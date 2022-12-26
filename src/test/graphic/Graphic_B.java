package test.graphic;

public class Graphic_B implements Graphic {
	private void brightness_B(int value) {
		System.out.println("밝기를 " + (value * 2) + "로 설정");
	}
	
	private void contrast_B(double value) {
		System.out.println("콘트라스를 " + value + "로 설정");
	}
	
	private void display_B() {
		System.out.println("화면을 출력");
	}

	@Override
	public void brightness(int value) {
		this.brightness_B(value);		
	}

	@Override
	public void contrast(double value) {
		this.contrast_B(value);		
	}

	@Override
	public void display() {
		this.display_B();		
	}
}
