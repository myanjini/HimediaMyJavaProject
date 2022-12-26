package otherpackage;

import mypackage.MyClass;

public class MyOtherClass extends MyClass {
		
	// 부모 클래스(MyClass)가 가지고 있는 멤버에 대한 접근을 확인
	void accessMyClassMember() {
		// privateInt = 10;
		// packageInt = 10;
		protectedInt = 10;
		publicInt = 10;
		
		// privateMethod();
		// packageMethod();
		protectedMethod();
		publicMethod();		
	}
	
	public static void main(String[] args) {
		MyClass mc = new MyClass();
		//mc.privateInt = 10;
		//mc.packageInt = 10;
		//mc.protectedInt = 10;
		mc.publicInt = 10;
		
		MyOtherClass moc = new MyOtherClass();
		//moc.privateInt = 10;
		//moc.packageInt = 10;
		moc.protectedInt = 10;
		moc.publicInt = 10;
	}

}
