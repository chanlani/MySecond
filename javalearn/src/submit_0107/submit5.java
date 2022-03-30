package submit_0107;

import java.util.Scanner;

public class submit5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int randomNum = (int) ((Math.random() * 50) +1);
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 :");
		String num1 = scanner.nextLine();
		for(int i =4; i>=0; i--) {
			if(i>0) {
				int userNum = Integer.parseInt(num1);
			if(userNum > randomNum) {
				System.out.println("다운!! "+i+"번 남았다");
				System.out.println("숫자를 입력해주세요 :");
				num1 = scanner.nextLine();
			}else if(userNum < randomNum) {
				System.out.println("업!! "+i+"번 남았다");
				System.out.println("숫자를 입력해주세요 :");
				num1 = scanner.nextLine();
			}else if(userNum == randomNum) {
				System.out.println("정답입니다.");
				break;
			}
			
			}else if(i==0) {
				System.out.println("실패했습니다. 정답은 "+randomNum+"입니다");
				break;
			}
			
			}
		
			
		
	}
}
