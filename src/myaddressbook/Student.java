package myaddressbook;

public class Student extends Person {
	// 학번 필드 추가 
	private String studentNo;

	// getter/setter 추가
	public String getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	
	// print() 메서드 오버라이딩
	public void print() {
		// System.out.printf("%s\t%s\t%s\n", super.getName(), super.getPhone(), this.getStudentNo());
		System.out.printf("%s\t%s\t%s\n", getName(), getPhone(), getStudentNo());
	}
}
