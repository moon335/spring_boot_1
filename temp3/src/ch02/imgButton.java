package ch02;

public class imgButton implements IButtonListener{

	@Override
	public void clickEvent(String message) {
		System.out.println("콜백 메서드 호출 " + message);
	}

}
