package submit1_jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import submit1_jdbc.model.Board;
import submit1_jdbc.model.Login;

public class LoginDao {
	private static LoginDao instance = new LoginDao();
	
	private LoginDao() {}
	
	public static LoginDao getInstance() {
		if(instance == null) {
			instance = new LoginDao();
		}
		
		return instance;
	}
	
	// 회원목록 조회(SELECT)
	public ArrayList<Login> memList(Connection conn) throws SQLException{
		
		StringBuffer query = new StringBuffer();
		query.append("SELECT     		 	  	    ");
		query.append("      login_id   as id   		");
		query.append("  ,login_pw as pw				");
		query.append("FROM				 	    	");
		query.append("			   submit_login 	");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		ResultSet rs = ps.executeQuery();
		
		ArrayList<Login> result = new ArrayList<Login>();
		
		while(rs.next()) {
			Login temp = new Login();
			
			temp.setId(rs.getString("id"));
			temp.setPw(rs.getString("pw"));
			
			result.add(temp);
		}
		if(ps != null)ps.close();
		if(rs != null)rs.close();
		
		return result;
	}

	// 회원추가 (INSERT)
	public int insertLogin(Connection conn, Login login) throws SQLException {
		StringBuffer query = new StringBuffer();
		
		query.append("INSERT INTO				");
		query.append("			submit_login	");
		query.append("VALUES (					");
		query.append("		  ?					");
		query.append("		, ?					");
		query.append("		)					");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		
		int idx = 1;
		ps.setString(idx++, login.getId());			// idx는 ?의 순서를 알려줌. 
		ps.setString(idx++, login.getPw());
		
		int cnt = ps.executeUpdate();
		
		if(ps != null)ps.close();
		
		return cnt;
		
	}
	

	// 회원가입할때, 입력한 아이디 중복체크
		// 로그인시, 입력한 아이디에 대한 패스워드 검사
		// 로그인 성공, 입력한 아이디에 대한 Login 데이터 가져옴
		public Login getLog(Connection conn, String id) throws SQLException {
			
			StringBuffer query = new StringBuffer();
			
			query.append("SELECT    			");
			query.append("		login_id		");
			query.append("	, login_pw 			");
			query.append("FROM					");
			query.append(" submit_login			");
			query.append("WHERE	1=1				");
			query.append("	AND dev_id = ?		");

			PreparedStatement ps = conn.prepareStatement(query.toString());
			ps.setString(1, id);
			
			
			ResultSet rs = ps.executeQuery();
			
			Login temp = new Login();
			
			while(rs.next()) {
				temp.setId(rs.getString("login_id"));
				temp.setPw(rs.getString("login_pw"));
				
				
			}
			if(ps != null)ps.close();
			if(rs != null)rs.close();
			
			return temp;
		}
}
