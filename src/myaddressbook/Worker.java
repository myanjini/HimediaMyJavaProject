package myaddressbook;

public class Worker extends Person {
	// 사번 필드 추가 
	private String workerNo;

	// getter/setter 추가
	public String getWorkerNo() {
		return workerNo;
	}
	public void setWorkerNo(String workerNo) {
		this.workerNo = workerNo;
	}
	
	// print() 메서드 오버라이딩
	public void print() {
		// System.out.printf("%s\t%s\t%s\n", super.getName(), super.getPhone(), this.getWorkerNo());
		System.out.printf("%s\t%s\t%s\n", getName(), getPhone(), getWorkerNo());
	}
}
