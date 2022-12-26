package mybankv2;

public class Account {
	// 필드는 외부에서 접근할 수 없도록 private 접근 제한자를 설정
	private String accountNo;	// 계좌번호
	private String name;		// 계좌주
	private int balance;		// 잔액
	
	// 필드를 매개변수로 가지는 생성자를 추가
	public Account(String accountNo, String name, int balance) {
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}
	
	// 각 필드의 값을 조회하고 설정할 수 있도록 getter/setter 메서드를 정의
	public String getAccountNo() {
		return accountNo;
	}	
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
}
