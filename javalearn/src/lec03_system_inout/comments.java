package lec03_system_inout;

public class comments {
   // 단일 주석
//   int intVal = 1;    //단일 주석 단축키는 ctrl + / 입니다.
//	int intVal2 = 2; 
	
	/*
	 * 다중 주석 
	 * 이 슬레시 안에 있는건 다 주석처리됨.
	 */
	
	// 자바 문서(javadoc) 주석
	/**
	 * 가장 맛난 과일은
	 */
	static String orange = "오렌지";
	
	
	public static void main(String[] args) {
		String banana = "바나나";
		// TODO 바나나를 콘솔에 출력해야함
		
		System.out.println(orange);
		System.out.println(banana);
	}
	
	// TODO 주석 
	
	
}
