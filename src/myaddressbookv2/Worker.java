package myaddressbookv2;

public class Worker extends Person {
	// 필드
	private String workerNo;
	
	public Worker(String name, String phoneNo, String workerNo) {
		super(name, phoneNo);
		this.workerNo = workerNo;
	}
	
	// getter/setter
	public String getWorkerNo() {
		return workerNo;
	}
	public void setWorkerNo(String workerNo) {
		this.workerNo = workerNo;
	}
	
	public void print() {
		System.out.printf("%s\t%s\t%s\n", 
				super.getName(), super.getPhoneNo(), this.getWorkerNo());
	}
}
