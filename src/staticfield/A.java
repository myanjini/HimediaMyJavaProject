package staticfield;

class Color {
	static final String RED = "붉은색";
	static final String BLUE = "푸른색";
}

class Shape {
	final String CIRCLE = "원";
	final String RECT = "사각형";
}


public class A {

	final int CONST_NUM_TEN;
	static final int CONST_NUM_NINE;
	
	
	void changeFinal () {
		
		String currentColor = Color.RED;
		
		Shape s = new Shape();
		String currentShape = s.CIRCLE;
		
		// final로 지정된 값은 변경할 수 없음
		// CONST_NUM_TEN = 100;
		// CONST_NUM_NINE = 99;
	}
	
	A() {
		CONST_NUM_TEN = 10;
		// 생성자에서 static final 상수를 초기화할 수 없음
		// CONST_NUM_NINE = 9;
	}
	
	static {
		// CONST_NUM_TEN = 10;
		CONST_NUM_NINE = 9;
	}

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.CONST_NUM_TEN);
		
		System.out.println(A.CONST_NUM_NINE);
	}
}
