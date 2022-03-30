package submit_class.submit1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class submit1Main {
	public static void main(String[] args) {
		ArrayList<submit1> ranNumList = new ArrayList<submit1>();
		
	}
	public static void randomNum() {
		ArrayList <Integer> temp = new ArrayList<Integer>(); // HashSet은 중복수를 허용하지 않는다.
		while(temp.size()<10) {
			temp.add((int)(Math.random()*11)+10); // 10부터 20 사이의 수
		}
		HashSet<Integer> rNum = new HashSet<Integer>();
		rNum.addAll(temp);
		System.out.println(rNum);		// 중복된 수 제거하여 출력
		ArrayList<Integer> sequenceNum = new ArrayList<Integer>();
		sequenceNum.addAll(rNum);
		Collections.sort(sequenceNum);
		System.out.println(sequenceNum);	// 오름차순 정렬
		Collections.sort(sequenceNum, Collections.reverseOrder());
		System.out.println(sequenceNum); 	// 내림차순 정렬
		
	}
}

 