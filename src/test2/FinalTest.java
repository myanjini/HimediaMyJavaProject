package test2;

class A1 {
	// 선언과 동시에 값을 대입
	int a = 3;
	final int b = 5;
}

class A2 {
	// 선언과 값 대입을 분리
	int a;
	final int b;
	A2() {
		this.a = 3;
		this.b = 5;		// 생성자를 통한 초기화가 가능
	}
}

class A3 {
	int a = 3;
	final int b = 5;
	A3() {
		this.a = 30;
		// this.b = 50;	// The final field A3.b cannot be assigned
	}
}

public class FinalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
