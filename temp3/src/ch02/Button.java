package ch02;

public class Button {
	
	private String name;
	private IButtonListener iButtonListener;
	
	public Button(String name) {
		this.name = name;
	}
	
	public void setIButtonListener(IButtonListener buttonListener) {
		this.iButtonListener = buttonListener;
	}
	
	public void click(String message) {
		if(iButtonListener != null) {
			iButtonListener.clickEvent(message);
		} else {
			System.out.println("인터페이스 구현하고 돌아와");
		}
	}
	
} // end of class
