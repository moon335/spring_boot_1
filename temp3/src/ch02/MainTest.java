package ch02;

public class MainTest {

	public static void main(String[] args) {
		
		Button button = new Button("button1");
		IButtonListener button2 = new imgButton();
		
		button.setIButtonListener(button2);
		
//		button.setIButtonListener(new IButtonListener() {
//			@Override
//			public void clickEvent(String message) {
//				System.out.println("콜백 메서드 호출11111111111 " + message);
//			}
//		});
		
		button.click("hi~");
		
	} // end of main

} // end of class
