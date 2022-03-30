package lec07_array;

public class ArrayQuestion {
	public static void main(String[] args) {
		int[] intArr = {23, 456, 213, 454, 1, 3, 4};
		System.out.println(intArr[2]);
		// intArr의 최댓값을 출력해주세요.
		// 당연히 for문을 이용해야겠죠
		int maxVal = intArr[0];
		for(int i = 0; i<intArr.length; i++) { // intArr의 1~intArr길이 전까지 돈다.
			if(maxVal < intArr[i])	{			// maxVal가 intArr보다 작으면 intArr의 값을 maxVal에 저장. 계속 돌면서 더 큰 값이 나오면 maxVal에 저장
				maxVal = intArr[i];	
			}
		}
		System.out.println("최댓값: "+ maxVal);
		
		
		// 배열내 요소 자리 바꾸는 함수
		
		System.out.println("\n===========================\n");
		
		// 선택 정렬
		// 1. 해당 배열에서 최댓값을 찾아서 해당 위치의 값과 
		// 배열의 마지막 값을 swap 한다.
		// 2. 배열의 마지막을 제외한 나머지 값들 중 
		// 최댓값을 찾아 해당 위치의 값과 배열의 끝에서 두번째
		// 값을 swap한다.
		// 3. 위 과정을 반복하면 정렬이 잘 된다.
		
		// @. 최댓값을 이용해서 내림차순을 해보세요.
		// 매번 최댓값을 찾아서, 맨 앞에서부터 바꿔가면 됩니다.
		
		int[] intArray = {23, 456, 213, 32, 464, 1, 2, 4}; 
		// intArray 의 length = 8
		// intArray 의 마지막 인덱스 = 7
		ascArray(intArray);
		
		for(int i = 0; 1<intArray.length-1; i++) {
			
			// 최댓값 구하기
			int maxValue = intArray[0];
			int maxIdx = 0;
			for(int j = 1; j< intArray.length-i; j++) {
				if(maxValue < intArray[j]) {
					maxValue = intArray[j];
					maxIdx = j;
				}
			}
			
			// swap, 최댓값인 maxValue의 인덱스와
			// 바꿀자리인 인덱스 자리
			swap(intArray, maxIdx, intArray.length-1-i);
		}
		System.out.println(intArray);
		ArrayStudy.printArray(intArray);
		
		// 내림차순
		for(int i = 0; i< intArray.length-1; i++) {
			// 최댓값 구하기
			int maxVar = intArray[intArray.length-1];
			int maxIdex = intArray.length-1;
			for(int j = i; j < intArray.length-1; j++) {
				if(maxVar < intArray[j]) {
					maxVar = intArray[j];
					maxIdex = j;
				}
			}
			// swap
			swap(intArray, maxIdex, i);
		}
		ArrayStudy.printArray(intArray);
		
		
	} //main 끝
	
	// 버블정렬 뒤에서 부터 정렬.
	public static void ascArray(int[] intArray) {
		for(int i = intArray.length-1; i>0; i--) {    // 배열 순서에 [0]이 들어가면 첫번째 배열을 뱉는다. 그러므로 [7]을 넣어야 마지막 순서를 뱉는다.
			for(int j = i-1; j>=0; j--)
			if(intArray[i]<intArray[j]) {
				int temp = intArray[i];
				intArray[i] = intArray[j];
				intArray[j]= temp;
				
			}
		}ArrayStudy.printArray(intArray); // 배열이 뒤죽박죽 해쉬코드로 나오기 때문에 해쉬코드를 배열로 바꾸는 식을 썼음
										   // ArrayStudy 클래스에서 printArray의 함수를 썼음.
	}
	
	
	
	/**
	 * 해당 intArray의 인덱스 idxA와 idxB의 값을 교환한다.
	 * @param intArray 값을 교환할 숫자 배열
	 * @param idxA 값을 교환할 인덱스 첫번째
	 * @param idxB 값을 교환할 인덱스 두번쨰
	 */
	
	public static void swap(int[] intArray, int idxA, int idxB) {
		int temp = intArray[idxA];
		intArray[idxA] = intArray[idxB];
		intArray[idxB] = temp;
	}
	
	
}
