package submit_0107;

import java.util.Base64;
import java.util.Base64.Decoder;

import lec07_array.ArrayStudy;

public class submit3 {
	public static void main(String[] args) {
		String info = "홍길동, 010-1234-5678, gildong@gmail.com";
		String [] infoArray = info.split(",");
		
		System.out.println("=========================");
		System.out.println("이름   : "+infoArray[0]);
		System.out.println("연락처 :"+infoArray[1]);
		System.out.println("이메일 :"+infoArray[2]);
		System.out.println("=========================");
		

	}
}
