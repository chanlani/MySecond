package lec12_exception;

public class BizException extends Exception {

	//에러코드 만들기
	private String errCode = "";
	
	public BizException(String errCode, String errMsg) {
		super(errMsg);	// 부모객체에 에러메시지 보내는것.
		this.errCode = errCode;
	}
	
	public BizException (String errMsg) {
		super(errMsg);
	}
	
	public BizException(Exception e) {
		super(e);
	}
	
	public String getErrCode() {
		return errCode;
	}
	
	
}
