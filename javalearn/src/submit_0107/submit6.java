package submit_0107;

public class submit6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] nameList = { "강욱근", "오현철", "최지혜", "김남규", "황햇빛나", "이가은", "김범석", "조서준", "이민우", "전영", "김지훈", "이용석", "박상우",
				"이유진", "박재훈", "이주석", "소은지", "이철현", "신예반", "이원태" };

		int countName = 0;
		for (int i = 0; i < nameList.length; i++) {
			if (nameList[i].charAt(0) == '이') {
				countName += 1; // '이'성을 가진 사람이 있으면 1씩 더한다.
			}
		}
		System.out.println("이씨 성을 가진 동기분이 총 " + countName + "명 있습니다."); // 반복문 밖으로 빼내면 count된 수가 나온다.

		// System.out.println(fruits.charAt(0));
	}// MAIN끝

}
