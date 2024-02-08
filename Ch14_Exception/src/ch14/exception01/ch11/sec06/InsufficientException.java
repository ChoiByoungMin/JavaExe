package ch14.exception01.ch11.sec06;
// 실제로는 필요한 정보를 많이 담아서 직접 만들어 사용한다.
public class InsufficientException extends Exception {
	public InsufficientException() {
		
	}
	public InsufficientException(String message) {
		super(message);
	}

}
