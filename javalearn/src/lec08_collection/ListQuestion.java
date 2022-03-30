package lec08_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ListQuestion {
	//상수선언
	static final int SONG_NAME = 1;
	static final int SINGER_NAME = 2;
	
	public static void main(String[] args) {
		
		// 하이마트 물건 목록 -> 배열0
		// ["냉장고","선풍기","TV","노트북","세탁기","에어컨","건조기"]
		
		// 아내가 사고 싶은 물건  -> 배열1
		// ["냉장고","세탁기","에어컨"]
		
		// 남편이 사고싶은 물건 -> 배열2
		// ["노트북","TV","에어컨"]
		
		// 각각의 목록들을 배열로 만드신 후 
		// 서로 사고 싶은 물건 목록 -> 배열3 (1, 2의 교집합)
		// 사고 싶은걸 다 산다고 했을때의 구매 목록 -> 배열4 (1,2의 합집합)
		
		ArrayList<String> wifeStuff = new ArrayList<String>();
		wifeStuff.add("냉장고");
		wifeStuff.add("세탁기");
		wifeStuff.add("에어컨");
		ArrayList<String> husStuff = new ArrayList<String>();
		husStuff.add("노트북");
		husStuff.add("에어컨");
		husStuff.add("TV");
		

		
		System.out.println(wifeStuff.indexOf(husStuff));
		
		
		ArrayList<String> bothStuff = new ArrayList<String>();
		for(int i = 0; i < husStuff.size();i++) {
			System.out.println("남편"+husStuff.get(i));
			System.out.println("아내"+wifeStuff.get(i));
			if(husStuff.get(i).equals(wifeStuff.get(i))) {
				bothStuff.add(husStuff.get(i));
				System.out.println(bothStuff);
			}
		}
			

		System.out.println("\n=============================\n");
		// 서로 사고 싶은 물건 목록
		ArrayList<String> wantBuy = new ArrayList<String>();
		for(int i = 0; i < wifeStuff.size(); i++) {
			if(husStuff.indexOf(wifeStuff.get(i)) != -1	) {
				bothStuff.add(wifeStuff.get(i));
			}
		}
		System.out.println(bothStuff);
		
		// 구매 목록
		ArrayList<String> allBuy = new ArrayList<String>();
		for(String wi : wifeStuff) {
			allBuy.add(wi);
		}
		for(String hu : husStuff) {
			if(allBuy.indexOf(hu) == -1) {
				allBuy.add(hu);
			}
		}
		System.out.println(allBuy);
		
		// 교집합
		wantBuy = new ArrayList<String>();
		wantBuy.addAll(wifeStuff);
		wantBuy.retainAll(husStuff);
		System.out.println(wantBuy);
		
		
/*		
		// 동적 매개변수(파라미터) 받는 메소드
		int maxValue = maxValue(1,2,4,43,55,44,23);
		System.out.println(maxVal);
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		intList.add(4);
		intList.add(44);
		intList.add(566);
		
		maxVal = maxValue(intList);
		System.out.println(maxVal);
	*/	
		
		
		ArrayList<String> playList = new ArrayList<String>(Arrays.asList("INVU: 태연", "사랑은 늘 도망가: 임영웅", "취중고백: 멜로망스", "언제나 사랑해: 케이시"
				, "듣고 싶을까: MSG워너비", "ELEVEN: IVE", "Step Back: GOT the beat", "abcdefu: GAYLE", "회전목마: sokodomo", "너, 너: 휘인"
				, "SMILEY: YENA", "호랑수월가: 탑현", "리무진: 비오", "RUN2U: STAYC", "눈이 오잖아: 이무진", "Counting Stars: 비오", "신호등: 이무진"
				, "어제처럼: 폴킴", "잊었니: 임영웅", "잊을 수 있을까: 노을", "HERO: 임영웅", "Can't Control Myself: 태연", "Next Level: aespa"
				, "strawberry moon: 아이유", "겨울잠: 아이유", "끝사랑: 임영웅", "드라마: 아이유", "Bk Love: 임영웅", "만남은 쉽고 이별은 어려워: 베이식"
				, "Weekend: 태연", "Savage: aespa", "Butter: 방탄소년단", "Dynamite: 방탄소년단", "OHAYO MY NIGHT: 디핵", "사랑인가 봐: 멜로망스"
				, "라일락: 아이유", "Celebrity: 아이유", "낙하: 악동뮤지션", "Blueming: 아이유", "롤린: 브레이브걸스", "고백: 멜로망스", "그런 밤: 태연"));
		
		
		System.out.println("사이즈: "+playList.size());
		
		showList(playList);
		
		System.out.println("\n========정렬==========\n");
		
		Collections.sort(playList);
		showList(playList);
		
		System.out.println("\n===============검색============\n");
		

		ArrayList<String> search = searchSong("태연", playList);
		showList(search);
		
		System.out.println("\n============노래명/가수 검색============\n");
		
		// 노래명 검색
		search = searchSong(SONG_NAME,"호랑수월가",playList);
		showList(search);
		// 가수 검색
		search = searchSong(SINGER_NAME,"영웅",playList);
		showList(search);
		
		
	}// main 끝 
	
	// 검색어(word)를 입력받으면 플레이리스트에서 
	// 해당 검색어를 포함하는 데이터만 담은 리스트 리턴
	static ArrayList<String> searchSong(String word, ArrayList<String> inputList){
		ArrayList<String> searchList = new ArrayList<String>();
		
		for(int i = 0; i < inputList.size(); i++) {
			if(inputList.get(i).indexOf(word) != -1) {
				searchList.add(inputList.get(i));
			}
		}
		return searchList;
		
	}
	
	// 메소드 오버로딩 
	// type 에 1이 들어오면 노래명
	// type 에 2가 들어오면 가수 검색 
	static ArrayList<String> searchSong(int type, String word, ArrayList<String> inputList){
		ArrayList<String> searchList = new ArrayList<String>();
		
		for(int i = 0; i < inputList.size(); i++) {
			String song = inputList.get(i).split(": ")[0];
			String singer = inputList.get(i).split(": ")[1];
			
			if(type == SONG_NAME) {
				if(song.indexOf(word) != -1) {
					searchList.add(inputList.get(i));
			}
			
			}else {
				if(singer.indexOf(word) != -1) {
					searchList.add(inputList.get(i));
			}
			}
		}
		return searchList;
		
	}
	
	
	// 파라미터로 입력 받은 문자열 리스트를 
	// 페이징 처리해서 출력해주는 함수 
	static void showList(ArrayList<String> inputList) {
		// 게시판 페이징 구현
		int totalCountGul = inputList.size();  // 게시판에 글이 총 336개 있다.
		int showCountInOnePage = 10;  // 한 페이지에서 보여줄 글의 수
		
		// 총 페이지의 수  (42/10 = 4.2  을 올림 -> 5)
//				int countPage = (int)math.ceil((double) totalCountGul / showCountInOnePage);
		double temp = ((double) totalCountGul / showCountInOnePage);
		int countPage = 0;
		if(temp > (totalCountGul/showCountInOnePage)) {
			countPage = (totalCountGul/showCountInOnePage)+1;
		}else {
			countPage = totalCountGul/showCountInOnePage;
		}
		
		// 마지막 페이지에 있는 글의 수 (42% 10 = 2)
		int countLastPageGul = totalCountGul % showCountInOnePage;
		
		// 페이징
		for(int i = 0; i<countPage; i++) {
			System.out.println("현재 페이지: "+(i+1));
			
			// platList의 인덱스 0~41
			// i가 0일때(페이지 1), 인덱스 0~9
			// i가 1일때(페이지 2), 인덱스 10~19
			// i가 2일때(페이지 3), 인덱스 20~29
			
			// i가 4일때 (페이지 5), 인덱스 40~49
			// 40 ~ 41 < 42
			int start = i*showCountInOnePage;
			int end = (i *showCountInOnePage) + showCountInOnePage;
			
			if(i == countPage-1) {
				// end는 42
				end = (i *showCountInOnePage)+ countLastPageGul; //42
				end = inputList.size(); // 42 위나 아래나 똑같음. 하나만 써도 됨
			}
			
			for(int j = start; j < end; j++) {
				System.out.println((j+1)+". "+inputList.get(j));
			}
			System.out.println("==================\n");
			
			
		}
				
	}
	
	
	
	
	static int maxValue(int...num) {
		int maxVal = 0;
		for(int i = 0; i < num.length; i++) {
			if(maxVal < num[i]) {
				maxVal = num[i];
			}
		}
		return maxVal;
	}
	static int maxValue(ArrayList<Integer>num) {
		int maxVal = 0;
		for(int i = 0; i < num.size(); i++) {
			if(maxVal < num.get(i)) {
				maxVal = num.get(i);
			}
		}
		return maxVal;
	}
	
}
