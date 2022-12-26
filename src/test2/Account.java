package test2;

public class Account {
	
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	
	private int balance;

	// getter 메서드 = 필드의 값을 반환하는 메서드
	public int getBalance() {
		return balance;
	}

	// setter 메서드 = 필드에 값을 설정하는 메서드 
	public void setBalance(int balance) {
		if (balance < 0 || balance > 1000000) {
			return;
		}		
		this.balance = balance;
	}

	public static void main(String[] args) {
		Account account = new Account();
		
		account.setBalance(10000);
		System.out.println("현재 잔고: " + account.getBalance());
		
		account.setBalance(-100);
		System.out.println("현재 잔고: " + account.getBalance());
		
		account.setBalance(2000000);
		System.out.println("현재 잔고: " + account.getBalance());
		
		account.setBalance(300000);
		System.out.println("현재 잔고: " + account.getBalance());
	}

}
