package ch02;

public class Encoder {
	
	private IEncoder iEncoder;
	
	// DI 의존 주입 설정 + 전략 패턴
	public Encoder(IEncoder iEncoder) {
		this.iEncoder = iEncoder;
	}
	
	// setter
	public IEncoder setiEncoder(IEncoder iEncoder) {
		return this.iEncoder = iEncoder;
	}
	
	// 기능
	public String encode(String message) {
		return iEncoder.encode(message);
	}
	
} // end of class
