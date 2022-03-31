package submit1_jdbc.boardservice;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;


import submit1_jdbc.dao.BoardDao;
import submit1_jdbc.dao.LoginDao;
import submit1_jdbc.jdbc.ConnectionPool;
import submit1_jdbc.model.Board;
import submit1_jdbc.model.Login;

public class BoardService {
	private static BoardService instance = new BoardService();
	private BoardDao dao1 = BoardDao.getInstance();
	private LoginDao dao2 = LoginDao.getInstance();
	private ConnectionPool cp = ConnectionPool.getInstance();
	
	private BoardService() {}
	
	public static BoardService getInstance() {
		if(instance == null) {
			instance = new BoardService();
		}
		return instance;
	}
	
	// 게시글목록 조회(SELECT)
	public ArrayList<Board> boardList(){		
		Connection conn = cp.getConnection();
		
		try {
			return dao1.boardList(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null)cp.releaseConnection(conn);
		}
		
		return new ArrayList<Board>();
	}
	
	// 게시글 추가(INSERT)
	public int insertBoard(Board board) {
		Connection conn = cp.getConnection();
		
		try {
			return dao1.insertBoard(conn, board);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null)cp.releaseConnection(conn);
		}
		
		return 0;		// try 안에서만 리턴값 넣으면 insertBoard함수가 에러가 뜸.
	}
	
	
	// 회원 추가(INSERT)
		public int insertLogin(Login login) {
			Connection conn = cp.getConnection();
			
			try {
				return dao2.insertLogin(conn, login);
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				if(conn != null)cp.releaseConnection(conn);
			}
			
			return 0;		// try 안에서만 리턴값 넣으면 insertBoard함수가 에러가 뜸.
		}
	
		
		// 파라미터 id에 대한 Developer 데이터 리턴
		public Login getLog(String id) {
			Connection conn = cp.getConnection();
			
			try {
				return dao2.getLog(conn, id);
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				if(conn != null) cp.releaseConnection(conn);
			}
			
			return new Login();
		}
		// 회원가입
		public int registLog(String id, String pw) {
			Connection conn = cp.getConnection();
			
			try {
				return dao2.registLog(conn, id, pw);
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				if(conn != null) cp.releaseConnection(conn);
			}
			
			return 0;
		}
		
		// 회원 정보 업데이트
		public int saveInfo(Login log) {
			Connection conn = cp.getConnection();
			
			try {
				return dao2.saveInfo(conn, log);
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				if(conn != null) cp.releaseConnection(conn);
			}
			
			return 0;
		}
		
}
