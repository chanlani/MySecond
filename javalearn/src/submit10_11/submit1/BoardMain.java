package submit10_11.submit1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import lec09_class.homepage.Member;
import lec09_class.homepage.MemberDB;
import submit_class.submit1.submit1;

public class BoardMain {
	public static void main(String[] args) {
		
		// 0, null, null, null
		Board board = new Board();
		int lastIndex = 1;
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("행동을 선택해주세요\n1. 글 목록 | 2. 글 쓰기 | 3. 종료\n >>> ");
			int inputNum = Integer.parseInt(sc.nextLine());
			if(inputNum == 2) {
				System.out.println("글 제목을 입력해주세요: ");
				String inputTitle = sc.nextLine();
				System.out.println("글 내용을 입력해주세요: ");
				String inputContent = sc.nextLine();
				Date dateToday = new Date();
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
				String posttime = dateFormat.format(dateToday);
				board.addBoard(new Board(lastIndex, inputTitle, posttime, inputContent));
				board.setNo(lastIndex++);
			}
			if(inputNum == 3) {
				System.out.println("종료합니다.");
				break;
			}
			if(inputNum == 1) {
				board.boardList();
			}
			else {
				System.out.println("잘못입력하였습니다");
			}
		}
		
	}
}
