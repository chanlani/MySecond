package lec08_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

import lec07_array.ArrayStudy;

public class CollectionQuestion {
	
	static HashMap<String, String> infoMap = new HashMap<>();
	
	
	public static void main(String[] args) {
		// 중복 제거 
		// makeLotto를 ArrayList와 HashSet을 이용해서 
		// while문을 이용하여 랜덤숫자를 만들다. 랜덤숫자 6개가 되면 탈출. 중복되지 않은 hashSet을 arrayList에 담는다.
		// 만들어 보세요
		
		ArrayList<Integer> Lotto = new ArrayList<Integer>();
		HashSet<Integer> temp = new HashSet<Integer>();
		while(temp.size()<6) {
			temp.add((int)(Math.random()*45)+1);
			}
		Lotto.addAll(temp);
		System.out.println(Lotto);
		
		System.out.println("로또 전");
		makeLotto();
		
		
		// 굳이 Set을 쓰지 않더라도, 중복 제거 정도는 
		// ArrayList로 처리할 수 있습니다.	
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		for(int i= 0; i < 10; i++) {
			intList.add(i);
		}
		for(int i = 4; i < 10; i++ ) {
			intList.add(i);
		}
		
		
		ArrayList<Integer> intArray = new ArrayList<Integer>();
		for(int i = 0; i < intList.size(); i++) {
			
			if(intArray.indexOf(intList.get(i))==-1) {
				intArray.add(intList.get(i));
			}
		}
		System.out.println(intArray);
		
		System.out.println("\n=============================\n");
		

		
		infoMap.put("a001", "1234a");
		infoMap.put("b001", "1234b");
		infoMap.put("c001", "1234c");
		infoMap.put("d001", "1234d");
		infoMap.put("e001", "1234e");
		
		// 사용자가 아이디와 비밀번호를 파라미터(매개변수)로 넣었을때, 
		// infoMap의 Key(아이디)와 Value(비밀번호)가 일치하는지
		// 일치하면 true, 다르면 false를 리턴해주는 함수를 
		// 만들어보세요
		
		System.out.println(loginCheck("a001","dhdk"));
		System.out.println(loginCheck("b001", "1234b"));
		
	}//main 끝 
	
	static boolean loginCheck(String id, String pw) {
//		if(pw.contentEquals(infoMap.get(id))) {
//			return true;
//		}
//		return false;
		return pw.contentEquals(infoMap.get(id));
	}
	
	// .get(Key)
	// Key에 해당하는 Value를 리턴
	//System.out.println(stuMap2.get("비트코인"));
	
	// 메소드로 처리하는 중복제거 
	static void makeLotto() {
		HashSet<Integer> tempSet = new HashSet<Integer>();
		while(tempSet.size()<6) {
			int rand = (int)(Math.random()*45) +1;
			tempSet.add(rand);
		}
		ArrayList<Integer> lottoList = new ArrayList<Integer>();
		lottoList.addAll(tempSet);
		Collections.sort(lottoList);
		
		System.out.println(lottoList);
	}
	
}
