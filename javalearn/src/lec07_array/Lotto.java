package lec07_array;

public class Lotto {
	public static void main(String[] args) {
		// 로또
		// Math.random() : 0부터 1사이의 랜덤 실수를 생성
		// 0~0.9999999999
		// 로또는 1부터 45까지 6자리의 숫자 배열
		
		// Math.random() * 10 을 하면 0 ~ 9.9999999까지 나옴 (int로는 0~9)
		// Math.random() * 100 을 하면 0 ~ 99.999999(int로는 0~99)
		// Math.random() * 45을 하면 0 ~ 44.9999 ( int로는 0 ~ 44)
		
		int lottoNum = (int) ((Math.random() * 45) +1);
		System.out.println(lottoNum);
		
		int [] myLotto = new int[6];
//		myLotto[0] = 랜덤로또번호
//		myLotto[1] = 랜덤로또번호
//		myLotto[5] = 랜덤로또번호
		
		// myLotto 에 Math.random()을 이용해서
		// 로또 번호 (1~45)를 중복되지 않게 담아주세요.
		for(int i = 0; i < myLotto.length; i ++) {
			myLotto[i] = (int) ((Math.random() * 45) +1);
			for(int j=0; j<i; j++) {  //중복제거 
				if(myLotto[i]==myLotto[j]) 
				i--; // myLotto[i]와 myLotto[j]값이 같으면 i--로 i값을 줄인다. 그러면 다시 줄인 값으로 돌아가서 중복되지 않는 값을
					 // 도출할때까지 다시 로직을 돈다. i가 2일때 j는 1, 이때 값이 같으면 i값이 줄어든다. i는 1에서 다시 로직 시작. 
				
			}
		}
		ArrayStudy.printArray(myLotto);
		
		// 몇번 돌지 모르면 while문을 쓴다.
		int idx = 0;
		while(true) {
			int lotto = (int)((Math.random()*45) +1);
			boolean isEqual = false;  // isEqual이 false라고 설정.
			// 중복체크
			for(int i = 0; i < idx; i++) {
				if(lotto == myLotto[i]) {
					isEqual = true;
				}
			}
			if(isEqual == false) {
				myLotto[idx] = lotto;
				idx++;
				
				if(idx > 5) {
					break;
				}
			}
		}
		ArrayStudy.printArray(myLotto);
		
		// 로또는 정렬도 해야함 (오름차순)
		
		
		int[] winLotto = {1, 4, 29, 39, 43, 45};
		int[] lottoArr = makeLotto();
		
		ArrayStudy.printArray(winLotto);
		ArrayStudy.printArray(lottoArr);
		
		
		// winLotto 와 lottoArr을 비교해서
		// 당첨 갯수를 리턴하는 함수를 만들어주세요 
		
		System.out.println(compareLotto(winLotto, lottoArr));
		
		long runTime = 0;
		while(true) {
			System.out.println(++runTime + "회 실행");
			if(compareLotto(winLotto, makeLotto())) { // makeLotto는 함수니까 ()를 넣음 
				System.out.println("1등 당첨!!");
				System.out.println("구매횟수	: "+runTime);
				System.out.println("구매금액 : "+(runTime * 1000));
				break;
			}
		}
		
		
		
	} // main 끝
	
	// 두 숫자 배열을 비교하여 6개가 같다면 true를 리턴
	public static boolean compareLotto(int[] winArr, int[] myArr) {
		int result = 0;
		for(int i = 0; i <winArr.length; i++) {
			if(winArr[i] == myArr[i]) {
				result += 1;
			}
		}
//		if(result == 6) {
//			return true;
//		}else {
//			return false;
			System.out.println(result+"개 일치");
			return (result == 6);
		}
	
	
	// 로또 만들어서 숫자 배열 리턴 
	public static int[] makeLotto() {
		// 유용한 단축키
		// 해당변수를 더블클릭해서 선택되면 [alt + shift + r] 변수의 이름을 바꿀때,
		// 변수가 사용되고 있는 부분들까지 한번에 바꿀 수 있다.
		int [] myLotto = new int[6];
		int idx = 0;
		while(true) {
			int lotto = (int)((Math.random()*45) +1);
			boolean isEqual = false;
			// 중복체크
			for(int i = 0; i < idx; i++) {
				if(lotto == myLotto[i]) {
					isEqual = true;
				}
			}
			if(isEqual == false) {
				myLotto[idx] = lotto;
				idx++;
				
				if(idx > 5) {
					break;
				}
			}
		}
		for(int i = 0; i < myLotto.length; i++) {
			boolean swapped = false;
			for(int j = 0; j < myLotto.length - 1 - i; j++) {
				if(myLotto[j]> myLotto[j+1]) {
					int temp = myLotto[j];
					myLotto[j] = myLotto[j+1];
					myLotto[j+1] = temp;
					swapped = true;
					
				}
			}
			
			if(swapped == false) {
				System.out.println("이미 정렬 완료");
				break;
			}
			
			System.out.println(i+ "회 시행");
			ArrayStudy.printArray(myLotto);
		
		}
		
//		ArrayStudy.printArray(myLotto);
		return myLotto;
	}
	
	
	
}
