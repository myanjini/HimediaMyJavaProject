package mypackage;

public class MainClass {

	public static void main(String[] args) {
		
		// MyClass의 인스터스를 생성한 후 필드와 메서드에 접근
		MyClass mc = new MyClass();
		
		// private 접근 지정자로 선언된 멤버 필드는 해당 클래스 외부에서 접근할 수 없음
		// The field MyClass.privateInt is not visible
		// mc.privateInt = 10;
		
		// package, protected, public 접근 지정자로 선언된 멤버 필드는 해당 클래스 외부에서 접근이 가능
		mc.packageInt = 10;
		mc.protectedInt = 10;
		mc.publicInt = 10;

		// private 접근 지정자로 선언된 멤버 메서드는 해당 클래스 외부에서 접근할 수 없음
		// The method privateMethod() from the type MyClass is not visible
		// mc.privateMethod();
		
		// package, protected, public 접근 지정자로 선언된 멤버 메서드는 해당 클래스 외부에서 접근이 가능		
		mc.packageMethod();
		mc.protectedMethod();
		mc.publicMethod();

	}

}
