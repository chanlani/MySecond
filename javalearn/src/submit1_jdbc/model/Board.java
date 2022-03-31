package submit1_jdbc.model;

public class Board {
	private int no; 		// 글번호 
	private String author;	// 글 작성자	
	private String title;	// 글제목
	private String content; // 글내용
	private String postDate;	// 작성일자
	
	public Board() {};
	
	public Board(int no, String author, String title, String content, String postDate) {
		super();
		this.no = no;
		this.author = author;
		this.title = title;
		this.content = content;
		this.postDate = postDate;
		
	}

	@Override
	public String toString() {
		return "Board [no=" + no + ", author=" + author +", title=" + title + ", content=" + content + ",postdate="+postDate+ "]";
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPostDate() {
		return postDate;
	}

	public void setPostDate(String postDate) {
		this.postDate = postDate;
	}
	

}
