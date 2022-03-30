package submit10_11.submit1;

import java.util.ArrayList;


public class Board {
	private int no;
	private String title;
	private String posttime;
	private String content;
	public static int lastIndex = 1;
	
	public Board(int no, String title, String posttime, String content) {
		super();
		this.no = no;
		this.title = title;
		this.posttime = posttime;
		this.content = content;
	}
	






	public static void setLastIndex(int lastIndex) {
		Board.lastIndex = lastIndex;
	}




	public Board() {
	}




	@Override
	public String toString() {
		return "[" + no+"." + " | " + title + " | " + posttime  + "]\n";
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPosttime() {
		return posttime;
	}

	public void setPosttime(String posttime) {
		this.posttime = posttime;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public void boardList() {
		System.out.println(boardList);
	}

	private ArrayList<Board> boardList = new ArrayList<Board>();
	
	public void addBoard(Board board) {
		boardList.add(board);
	}

	
	
}
