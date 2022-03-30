package submit_class.submit3;

import java.util.ArrayList;

public class LibraryMain {
	public static void main(String[] args) {
		ArrayList<String> bookList = new ArrayList<String>();
		String strBooks = "삼국지, 해리포터와 마법사의 돌, 해리포터와 비밀의 방, 해리포터와 아즈카반의 죄수, 해리포터와 불사조 기사단, 해리포터와 혼혈왕자, 해리포터와 죽음의 성물, 어린왕자, 나의 라임 오렌지나무, 이것이 자바다, 좋은생각, 반지의 제왕: 반지 원정대, 반지의 제왕: 두 개의 탑, 반지의 제왕: 왕의 귀환, 토익보카, 개미";

		String[] strArray = strBooks.split(",");

		for (int i = 0; i < strArray.length; i++) {
			strArray[i] = strArray[i].trim();		// 공백을 없앰(trim)
		}

		for (int i = 0; i < strArray.length; i++) {
			bookList.add(strArray[i]);
		}
		for (int i = 0; i < bookList.size(); i++) {
			System.out.println(bookList.get(i));
		}

	}

}
