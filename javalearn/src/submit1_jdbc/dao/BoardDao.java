package submit1_jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import submit1_jdbc.model.Board;


public class BoardDao {

	
	private static BoardDao instance = new BoardDao();
	
	private BoardDao() {}
	
	public static BoardDao getInstance() {
		if(instance == null) {
			instance = new BoardDao();
		}
		
		return instance;
	}
	
	// 게시글목록 조회(SELECT)
	public ArrayList<Board> boardList(Connection conn) throws SQLException{
		
		StringBuffer query = new StringBuffer();
		query.append("SELECT     		 	  	");
		query.append("     post_no   	   		");
		query.append("	,  board_author 		");
		query.append("  ,  post_title  			");		
		query.append("  ,  post_content  		");		
		query.append("  ,  post_date			");
		query.append("FROM			 	    	");
		query.append("		submit_board	 	");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		ResultSet rs = ps.executeQuery();
		
		ArrayList<Board> result = new ArrayList<Board>();
		
		while(rs.next()) {
			Board temp = new Board();
			
			temp.setNo(rs.getInt("post_no"));
			temp.setAuthor(rs.getString("board_author"));
			temp.setTitle(rs.getString("post_title"));
			temp.setContent(rs.getString("post_content"));
			temp.setPostDate(rs.getString("post_date"));
			
			result.add(temp);
		}
		if(ps != null)ps.close();
		if(rs != null)rs.close();
		
		return result;
	}

	// 게시글 추가 (INSERT)
	public int insertBoard(Connection conn, Board board) throws SQLException {
		StringBuffer query = new StringBuffer();
		
		query.append("INSERT INTO				");
		query.append("			submit_board	");
		query.append("VALUES (					");
		query.append("		  post_no.NEXTVAL	");
		query.append("		, ?					");
		query.append("		, ?					");
		query.append("		, ?					");
		query.append("		, ?					");
		query.append("		)					");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		
		int idx = 1;
		ps.setString(idx++, board.getAuthor());
		ps.setString(idx++, board.getTitle());
		ps.setString(idx++, board.getContent());
		ps.setString(idx++, board.getPostDate());
		
		int cnt = ps.executeUpdate();
		
		if(ps != null)ps.close();
		
		return cnt;
	}
	
	
	
}
