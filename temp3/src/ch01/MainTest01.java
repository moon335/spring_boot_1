package ch01;

public class MainTest01 {

	public static void main(String[] args) {
		
		// 옵저버 패턴을 배워 보자 (콜백 메서드)
		Button button = new Button("button1");
		// 인터페이스 --> 익명 클래스 --> 익명 구현 클래스
		button.setIButtonListener(new IButtonListener() {
			@Override
			public void clickEvent(String event) {
				// 우리가 하고 싶은 동작, 알고리즘을 구현하면 됨
				System.out.println("콜 백 들어왔어 !!! " + event);
			}
		});
		///////////////////////////// 콜백 메서드 설계 완료 = 옵저버 패턴
		////// 오후 4시 알람 울림
		button.click("야 너 집에 가야지! 엄마 기다려!");
		button.click("이게 정말 콜백이야");
		button.click("맞아 옵저버 패턴이라고도 불려!!!");
	} // end of main
	
} // end of class
