package submit10_11.submit1;

public class CartoonBoard extends Board{
	public CartoonBoard(int no, String title, String posttime, String content, String img) {
		super(no, title, posttime, content);
		this.img = img;
		
	}

	private String img;

	@Override
	public String toString() {
		return "CartoonBoard [img=" + img + "]";
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	
	
	
}
