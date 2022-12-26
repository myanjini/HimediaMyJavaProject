package mybank;

public class Account {
	private String accountNo;
	private String name;
	private int balance;
	
	public String getAccountNo() {
		return accountNo;
	}
	
	// 계좌번호, 계좌주, 잔액(초기입금액)을 매개변수로 받는 생성
	public Account(String accountNo, String name, int balance) {
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}
	
	// 계좌 목록 출력
	// 계좌번호		계좌주		잔액
	public void print() {
		System.out.printf("%s\t%s\t%d\n", this.accountNo, this.name, this.balance);
	}
	
	// 예금
	public void deposit(String accountNo, int amount) {
		if (!this.accountNo.equals(accountNo)) {
			System.out.println("계좌번호가 일치하지 않습니다.");
			return;
		}
		if (amount < 0) {
			System.out.println("마이너스 금액은 예금할 수 없습니다.");
			return;
		}
		this.balance += amount;
	}
	
	// 출금
	public void withdraw(String accountNo, int amount) {
		if (!this.accountNo.equals(accountNo)) {
			System.out.println("계좌번호가 일치하지 않습니다.");
			return;
		}
		if (amount < 0) {
			System.out.println("마이너스 금액은 출금할 수 없습니다.");
			return;
		}
		this.balance -= amount;
	}
	
}
