package lec08_collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionSet {
	public static void main(String[] args) {
		// 집합(HashSet)의 선언
		HashSet<String> stuSet = new HashSet<String>();
		HashSet<String> stuSet2 = new HashSet<>();
		Set<String> stuSet3 = new HashSet<String>();   // 다형성 집합선언의 3가지 방식이 있다.
		
		// .add() 데이터 추가
		stuSet.add("욱근");
		stuSet.add("주석");
		stuSet.add("예반");
		
		System.out.println(stuSet);
		// 인덱스가 없어서 추가해도 추가가 안됨.(중복값 add안됨) 순서가 없는상태. 
		stuSet.add("욱근");
		
		System.out.println(stuSet);
		
		// .contains() 해당 데이터가 Set 안에 있으면 true,
		// 없으면 false
		System.out.println(stuSet.contains("주석"));
		
		// .size() Set 내 데이터의 개수를 리턴
		System.out.println(stuSet.size());
		
		System.out.println("\n=================================\n");
		
		// Set 조회
		// while문 사용 
		Iterator<String> iterator = stuSet.iterator();
		
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
		
		
		for(int i =0; i < 100; i++) {
			stuSet.add(i+"");
		}
		
		// 향상된 for문 = foreach문
		System.out.println("for문 쓰는 이유");
		for(String name : stuSet) {
			if(name.length() == 1) {
				System.out.println(name);
			}
		}
		
		
		// .foreach 사용 
		stuSet.forEach(name -> System.out.println(name));  // 중괄호 없어서 안쪽 세미클론 지움.
		
		stuSet.forEach(name -> {  // 중괄호 있을 때는 안에 세미클론 넣음. 여러개 검색 가능.
			System.out.println(name);
			System.out.println(name);
		});
		
		System.out.println("\n============================\n");
		
		// Set은 집합을 쓰는 경우가 아니라면 잘 쓰지 않으며,
		// 그나마 Set을 쓴다면 중복을 허용하지 않는 속성을 이용하는 경우 
		// 중복제거
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		for(int i= 0; i < 10; i++) {
			intList.add(i);
		}
		for(int i = 4; i < 10; i++ ) {
			intList.add(i);
		}
		System.out.println(intList);
		
		// ArrayList에서 HashSet으로 변환 (중복제거하기위해)
		HashSet<Integer> tempSet = new HashSet<Integer>();
		tempSet.addAll(intList);
		System.out.println(tempSet);
		
		// HashSet에서 ArrayList로 변환
		intList.clear();
// 클리어로 지우는거랑 같음	=	intList = new ArrayList<Integer>(); 
		intList.addAll(tempSet);
		System.out.println(intList);
		
	}
}
