package myaddressbookv2;

public class Person {
	// 필드
	private String name;
	private String phoneNo;
	
	public Person(String name, String phoneNo) {
		this.name = name;
		this.phoneNo = phoneNo;
	}
	
	// getter/setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public void print() {
		
	}
}
