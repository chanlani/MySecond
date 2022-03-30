package lec05_controll;

public class LoopForQuestion {
	public static void main(String[] args) {
		// 거꾸로 트리를 5층 만들어 주세요
		//*****
		//****
		//***
		//**
		//*
		
		for(int i = 5; i >= 0; i--) {
			String star = "";
			for(int j = 0; j < i; j++) {
				star +="*";
			} 
			System.out.println(star);
		}
		
		// 거꾸로 구구단 2단 출력해주세요
		// 2 x 9 = 18
		// 2 x 8 = 16
		// 2 x 2 = 4
		
		for(int i = 9; i>1; i--) {
			System.out.println("2 x "+ i+" = "+(2*i));
		}
		
		// 5층 크리스마스 트리 만들어보기
		//    *
		//   ***
		//  *****
		// *******
		
		String star ="*";
		String blank = "";
		
		for(int i = 0; i<5; i++) {
			if(i>0) {
				star += "**";
			}
			blank = "";
			for(int j = 1; j < 5-i; j++ ) {
				blank += " ";
			}
			System.out.println(i+ ": " + blank + star);
		} 
		
		// 거꾸로 트리를 만들어주세요
		// *********
		//  *******
		//   *****
		//    ***
		//     *
		
		blank = "";
		star = "";
		for(int i = 0; i < 5; i++) {        //i가 0일때 j는 0~3. i가 한번바뀔때 j는 4번바뀌는셈. 중괄호 안은 바깥 한번돌때 조건에 따라 몇번돈다.
			if(i>0) {
				blank += " ";
			}
			star = "*";
			for(int j = 0; j < 4-i; j++) {    // i가 0일때 j는 0~3 총 4번 돈다. star *에 **가 4번 도는거니까 *가 8개. star *에 8개*를 붙이면 9개
				star += "**";                 // i가 1일때 j는 0~2 총 3번. star *에 **개 3번도니까 *가 6개. star * 더하기 *6개는 7   
			}
		
			System.out.println(i + ": "+blank+star);
		}
		
		
		
		
		
	}
}
