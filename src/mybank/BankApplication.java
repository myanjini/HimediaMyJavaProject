package mybank;

import java.util.Scanner;

public class BankApplication {

	Account[] accounts = new Account[100];
	
	// 메뉴를 출력하고 메뉴 선택값을 반환
	int showAndSelectMenu() {
		System.out.println("--------------------------------------------------");
		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
		System.out.println("--------------------------------------------------");
		System.out.print("선택> ");
		
		Scanner scan = new Scanner(System.in);
		int menu = scan.nextInt();
		// scan.close();
		
		return menu;		
	}
	
	void createAccount() {
		System.out.println("--------");
		System.out.println("계좌생성");
		System.out.println("--------");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("계좌번호: ");
		String accountNo = scan.nextLine();
		System.out.print("계좌주: ");
		String name = scan.nextLine();
		System.out.print("초기입금액: ");
		int balance = scan.nextInt();
		// scan.close();
		
		Account account = new Account(accountNo, name, balance);
		for (int i = 0; i < this.accounts.length; i ++) {
			if (this.accounts[i] == null) {
				this.accounts[i] = account;
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			}
		}
	}
	
	void showAccounts() {
		System.out.println("--------");
		System.out.println("계좌목록");
		System.out.println("--------");
		for (Account account : this.accounts) {
			 if (account != null) {
				 account.print();
			 }
		}
	}
	
	void depoit() {
		System.out.println("--------");
		System.out.println("예금");
		System.out.println("--------");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("계좌번호: ");
		String accountNo = scan.nextLine();
		System.out.print("예금액: ");
		int balance = scan.nextInt();
		
		for (Account account : this.accounts) {
			if (account != null && account.getAccountNo().equals(accountNo)) {
				account.deposit(accountNo, balance);
			}
		}
	}
	
	void withdraw() {
		System.out.println("--------");
		System.out.println("출금");
		System.out.println("--------");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("계좌번호: ");
		String accountNo = scan.nextLine();
		System.out.print("출금액: ");
		int balance = scan.nextInt();
		
		for (Account account : this.accounts) {
			if (account != null && account.getAccountNo().equals(accountNo)) {
				account.withdraw(accountNo, balance);
			}
		}
	}
	
	public static void main(String[] args) {
		BankApplication ba = new BankApplication();
		
		while(true) {
			int menu = ba.showAndSelectMenu();
			switch(menu) {
			case 1: 
				ba.createAccount();
				break;
			case 2: 
				ba.showAccounts();
				break;
			case 3:
				ba.depoit();
				break;
			case 4: 
				ba.withdraw();
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
			default:
				System.out.println("잘못된 입력입니다.");
			}
		}
	}

}
