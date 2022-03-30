package submit10_11.submit1;

public class AudioBoard extends Board{
	String audio;

	public AudioBoard(int no, String title, String posttime, String content, String audio) {
		super(no, title, posttime, content);
		this.audio = audio;
	}

	@Override
	public String toString() {
		return "AudioBoard [audio=" + audio + "]";
	}

	public String getAudio() {
		return audio;
	}

	public void setAudio(String audio) {
		this.audio = audio;
	}
	
	
	
}
