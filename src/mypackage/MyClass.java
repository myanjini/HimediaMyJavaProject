package mypackage;

public class MyClass {
	
	private int privateInt;
	int packageInt;
	protected int protectedInt;
	public int publicInt;
	
	private void privateMethod() { 
		// 같은 클래스 내의 모든 필드에 접근이 가능 
		System.out.println(privateInt);
		System.out.println(packageInt);
		System.out.println(protectedInt);
		System.out.println(publicInt);
		
		// 같은 클래스 내의 모든 메서드에 접근이 가능 
		packageMethod();
		protectedMethod();
		publicMethod();
	}
	void packageMethod() { }
	protected void protectedMethod() { }
	public void publicMethod() { }
	
}
