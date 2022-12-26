package myaddressbook;

public class Person {
	// 필드를 private으로 정의
	private String name;
	private String phone;
	
	// 필드의 값을 조회/설정할 수 있도록 getter/setter 메서드 정의
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	// print() 메서드 정의
	public void print() { 
		System.out.printf("%s\t%s\n", name, phone);
	}
}
