package submit10_11.submit1.submit3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateBoard {
	private String title;
	private String date;

	public DateBoard(String title, String date) {
		this.title = title;
		this.date = date;
	}

	@Override
	public String toString() {
		return "DateBoard [title=" + title + ", date=" + date + "]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}



}
