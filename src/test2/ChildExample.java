package test2;

class Parent {
	public String nation;
	
	public Parent() {						// #3
		this("대한민국");					// #4를 호출
		System.out.println("Parent() call");// #6	
	}
	
	public Parent(String nation) {			// #4
											// super() 메서드를 실행 -> Object() 생성자를 실행
		this.nation = nation;
		System.out.println("Parent(String nation) call");	// #5
	}	
}

class Child extends Parent {
	public String name;
	
	public Child() {						// #1
		this("홍길동");						// #2를 호출
		System.out.println("Child() call");	// #8 
	}
	
	public Child(String name) {				// #2
											// super() 메서드를 실행 -> Parent() 생성자를 실행
		this.name = name;
		System.out.println("Child(String name) call");		// #7
	}
}

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
	}
}
