package submit1_jdbc;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import submit1_jdbc.boardservice.BoardService;
import submit1_jdbc.dao.BoardDao;
import submit1_jdbc.model.Board;
import submit1_jdbc.model.Login;

public class BoardMain {

	public static void main(String[] args) {
		BoardService service = BoardService.getInstance();

		Scanner sc = new Scanner(System.in);
		

		while (true) {
			System.out.println("Board에 오셨습니다.");
			System.out.println("1.로그인 | 2. 회원가입 3. 종료");
			System.out.println(">>> ");

			int select = 0;

			try {
				select = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println("숫자만 입력해주세요");
				continue;
			}

			if (select == 1) {
				// TODO 로그인
				System.out.println("아이디를 입력해주세요.");
				System.out.println(">>> ");
				String id = sc.nextLine();
				System.out.println("비밀번호를 입력해주세요.");
				System.out.println(">>> ");
				String pw = sc.nextLine();

				Login log = service.getLog(id);

				if (log.getPw().equals(pw)) {
					System.out.println(log.getId() + "님으로 접속했습니다.");
					
					//////////////////////////////////////////////////////////////
					
					// 로그인 이후 프로세스
					while(true) {
						System.out.println("1. 글쓰기 | 2. 글조회 | 3. 로그아웃");
						System.out.println(">>> ");
						select = 0;
						
						try {
							select = Integer.parseInt(sc.nextLine());
						} catch (Exception e) {
							System.out.println("숫자만 입력해주세요");
							continue;
						}
						if(select == 1) {
							System.out.println("글 제목을 입력해주세요: ");
							String tit = sc.nextLine();
							
							System.out.println("글 내용을 입력해주세요: ");
							String con = sc.nextLine();
							
							Date dateToday = new Date();
							SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd.HH.mm");
							String strToday = dateFormat.format(dateToday);
							
							Board board = new Board();	// 보드에 담아줌
							board.setAuthor(log.getId());
							board.setTitle(tit);
							board.setContent(con);
							board.setPostDate(strToday);
							
							service.insertBoard(board);	// sequence테이블로인해 no값은 자동으로 들어감. ?인 부분만 넣어줌
							System.out.println("글이 작성되었습니다.");
							
							// 글조회
						}else if(select == 2) {
							System.out.println("글번호 입력해주세요: ");
							int seqNum = Integer.parseInt(sc.nextLine());
							for(i=0; i< ???)
							ArrayList<Board> boardList = service.boardList();
							System.out.println(boardList);
						}
				
					
				
				
					
				}
			} else if(select ==2) {
				// 회원가입
				System.out.println("아이디를 입력해주세요.");
				System.out.println(">>> ");
				id = sc.nextLine();
				System.out.println("비밀번호를 입력해주세요.");
				System.out.println(">>> ");
				pw = sc.nextLine();
				
				// Login db에서 해당 아이디에 대한 데이터를 불러옴.
				log = service.getLog(id);
				
				if(log.getId() != null) {
					System.out.println("중복된 아이디입니다.");
				}else {	// 회원가입 진행.
					int resultCnt = service.registLog(id, pw);
					
					if(resultCnt > 0) {
						System.out.println("회원가입 완료");
					}else {
						System.out.println("오류가 발생했습니다.");
					}
				}
				
			}else if(select ==3) {
				System.out.println("종료합니다");
				break;
			}else {
				System.out.println("잘못 입력하였습니다.");
			}
		}
	}
}
}
