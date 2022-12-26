package test.graphic;

public class Graphic_A implements Graphic {
	private void brightness_A(int value) {
		System.out.println("밝기를 " + value + "로 설정");
	}
	
	private void contrast_A(double value) {
		System.out.println("콘트라스를 " + value + "로 설정");
	}
	
	private void display_A() {
		System.out.println("화면을 출력");
	}

	@Override
	public void brightness(int value) {
		this.brightness_A(value);		
	}

	@Override
	public void contrast(double value) {
		this.contrast_A(value);		
	}

	@Override
	public void display() {
		this.display_A();		
	}
}
