package test.graphic;

public class GraphicApplication {

	public static void main(String[] args) {
		// 인터페이스를 사용하지 않으면, 
		// 각 클래스에 정의된 방법(메서드 이름)에 따라서 사용해야 함
		// => 사용 클래스가 바뀌면 해당 클래스가 제공하는 메서드로 변경
		
		/*
		// A 그래픽 카드를 사용하는 경우
		Graphic_A g1 = new Graphic_A();
		g1.brightness_A(100);
		g1.contrast_A(50.0);
		g1.display_A();

		// B 그래픽 카드를 사용하는 경우
		Graphic_B g2 = new Graphic_B();
		g2.brightness_B(100);
		g2.contrast_B(50.0);
		g2.display_B();
		*/
		
		// 인터페이스를 이용하면
		// 쉽게 구현 클래스를 변경할 수 있음
		Graphic g3 = new Graphic_A();
		g3.brightness(100);
		g3.contrast(50.0);
		g3.display();
	}
}
