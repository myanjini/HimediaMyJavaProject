package myaddressbookv2;

public class Student extends Person {
	// 필드
	private String studentNo;

	public Student(String name, String phoneNo, String studentNo) {
		super(name, phoneNo);
		this.studentNo = studentNo;
	}	
	
	// getter/setter
	public String getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public void print() {
		System.out.printf("%s\t%s\t%s\n", 
				// getName(), getPhoneNo(), getStudentNo());
				super.getName(), super.getPhoneNo(), this.getStudentNo());
	}
	
}
