package polymorphism;

class A {
	static void print() {
		System.out.println("A 클래스의 print()");
	}
}
class B extends A { 
	static void print() {
		System.out.println("B 클래스의 print()");
	}
}

public class InheritanceSample {
	public static void main(String[] args) {
		A.print();		// A 클래스의 print()
		B.print();		// B 클래스의 print()
		
		A ab = new B();
		ab.print();		// A 클래스의 print()
	}
}
