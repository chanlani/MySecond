package lec12_exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

// 에러 처리할 메소드들을 가지는 클래스
public class ExMethod {
	
	// 입력받은 두 숫자를 나눈 값 리턴
	public static int divide(int numA, int numB) throws BizException {
		if(numB == 0) {
			// 
			throw new BizException("numB는 0이외의 숫자를 입력하시오");
		}else {
			return numA/numB;
		}
		
	}
	
	// 입력받은 이름을 콘솔에 출력하는 메소드
	// 만약에 입력받은 이름이 숫자거나, empty 면 throw BizException
	public static void showName(String name) throws BizException {
		String regex = "[a-zA-z가-힣]*";
		
		if(name.length() == 0) {
			throw new BizException(ErrConstants.API_0001,"이름을 한글자 이상 입력해주세요 입력한 값 : "+name);
		}else if(!Pattern.matches(regex, name)) {
			throw new BizException(ErrConstants.API_0002,"숫자를 입력하지마세요. 입력한 값 : "+ name);
		}else {
			System.out.println(name);
		}
		
	}
	// 날짜 문자열을 입력하면 밀리초로 바꿔서 리턴
	// yyyy.MM.dd
	public static long dateMillSec(String date) throws ParseException {		// throws를 넣으면 안에 try catch안하고 throw로 ParseException으로 던져버림.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		Date temp = sdf.parse(date);
		return temp.getTime();
	}
	
	
	
}
