package lec14_jdbc_jsp.jdbc;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Connection 객체를 만들어주는 공장(Factory)클래스
 */
public class ConnectionFactory {
	private String driver;
	private String url;
	private String user;
	private String password;
	private int maxConn;
	
	private static ConnectionFactory instance = new ConnectionFactory();
	
	public static ConnectionFactory getInstance() {
		if(instance == null) {		// 안전빵 리턴만 써도되는데 혹시 안되면 이렇게하도록
			instance = new ConnectionFactory();
		}
		
		return instance;
	}
	
	private ConnectionFactory() {
		
		try {
			Properties prop = new Properties();
			
			// 프로퍼티 읽어오기 
			InputStream reader = getClass().getClassLoader().getResourceAsStream("lec14_jdbc_jsp/db.properties");
			prop.load(reader);
			
			// 프로퍼티 내용으로 필드 변수 세팅
			driver = prop.getProperty("driver");
			url = prop.getProperty("url");
			user = prop.getProperty("user");
			password = prop.getProperty("password");
			maxConn = Integer.parseInt(prop.getProperty("maxConn"));
			
			// 드라이버 로딩
			Class.forName(driver);
			System.out.println("드라이버 로딩 성공");
			
			} catch (IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	// DB와의 Connection 객체 내어주는 메소드
	public Connection getConnection() throws SQLException {
		Connection conn = DriverManager.getConnection(url, user, password);
		return conn;
	}
	
	public int getMaxConn() {
		return maxConn;
	}
	
}
