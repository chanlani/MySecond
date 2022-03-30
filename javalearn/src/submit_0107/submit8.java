package submit_0107;

public class submit8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String example = "aaabbcdddaeefffffgg";

		for (int i = 0; i < example.length() - 1; i++) {
			if (example.charAt(i) != example.charAt(i+1)) {
		
				System.out.println(example.charAt(i+1));
				// i+1을 넣으면 맨 앞의 a가 안나오고 i만 넣으면 
				// 맨 뒤의 g가 안나옴.
			}

		}

	
	
	
	
	}//main 끝
	
	
}

