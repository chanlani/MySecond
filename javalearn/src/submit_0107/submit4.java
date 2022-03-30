package submit_0107;

import java.util.Scanner;

public class submit4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("현재 신장(cm)을 입력해주세요 :");
		Scanner scanner = new Scanner(System.in);
		String inputHeignt = scanner.nextLine();
		System.out.print("현재 체중(kg)을 입력해주세요 :");
		String inputWeight = scanner.nextLine();
		double avgWe = (double) ((Integer.parseInt(inputHeignt)-100)*0.9);
		double fat = (double) (Integer.parseInt(inputWeight)/avgWe)*100;
		if(fat>= 130) {
			System.out.println("비만 입니다.");
		}else if(fat>=110) {
			System.out.println("과체중 입니다.");
		}else if(fat>=80) {
			System.out.println("정상체중 입니다.");
		}else {
			System.out.println("저체중 입니다.");
		}
		
	}

}
