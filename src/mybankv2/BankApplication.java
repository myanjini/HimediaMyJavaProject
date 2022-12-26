package mybankv2;

import java.util.Scanner;

public class BankApplication {
	
	// 필드를 정의 
	// => main 메서드에서 인스턴스 생성 없이 바로 사용할 수 있도록 static으로 정의 
	private static Account[] accounts = new Account[100];
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean isRun = true;
		while(isRun) {
			// 메뉴를 출력
			System.out.println("--------------------------------------------------");
			System.out.println("1.계정생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------------");
			System.out.print("선택 > ");
			
			// 선택한 메뉴 번호에 맞는 기능을 호출
			int menu = scan.nextInt();
			switch(menu) {
			case 1:
				createAccount();
				break;
			case 2:
				showAccounts();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5:
				isRun = false;
				break;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}

	private static void withdraw() {
		printTitle("출금");
		
		String accountNo = getUserInput("계좌번호");
		int amount = Integer.parseInt(getUserInput("출금액"));
		
		// accounts 배열에서 일치하는 계좌번호를 찾아서 해당 계좌에 예금액을 차감
		for (int i = 0; i < accounts.length; i ++) {
			Account account = accounts[i];
			if (account != null && account.getAccountNo().equals(accountNo)) {
				account.setBalance(account.getBalance() - amount);
			}
		}
	}
	
	private static void deposit() {
		printTitle("예금");
		
		String accountNo = getUserInput("계좌번호");
		int amount = Integer.parseInt(getUserInput("예금액"));
		
		// accounts 배열에서 일치하는 계좌번호를 찾아서 해당 계좌에 예금액을 추가
		for (int i = 0; i < accounts.length; i ++) {
			Account account = accounts[i];
			if (account != null && account.getAccountNo().equals(accountNo)) {
				account.setBalance(account.getBalance() + amount);
			}
		}
	}
	
	private static void showAccounts() {
		// 타이틀 출력
		printTitle("계좌목록");
		
		// accounts 배열의 내용을 하나씩 가져와서 출력
		/*
		for (int i = 0; i < accounts.length; i ++) {
			Account account = accounts[i];
			if (account != null) {
				System.out.printf("%s\t%s\t%d\n", 
						account.getAccountNo(), account.getName(), account.getBalance());
			}
		}
		*/
		
		// 동일한 기능을 for-each 구분으로 변경
		for (Account account : accounts) {
			if (account != null) {
				System.out.printf("%s\t%s\t%d\n", 
						account.getAccountNo(), account.getName(), account.getBalance());
			}
		}
	}
	
	private static String getUserInput(String message) {
		System.out.print(message + ": ");
		return scan.next();
	}
	
	private static void createAccount() {
		printTitle("계좌생성");
		
		String accountNo = getUserInput("계좌번호");
		String name = getUserInput("계좌주");
		int amount = Integer.parseInt(getUserInput("초기입금액"));
				
		// Account를 생성
		Account account = new Account(accountNo, name, amount);
				
		// accounts 배열에 비어있는 자리에 생성한 Account를 추가
		for (int i = 0; i < accounts.length; i ++) {
			if (accounts[i] == null) {
				accounts[i] = account;
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			}
		}		
	}

	private static void printTitle(String title) {
		System.out.println("--------");
		System.out.println(title);
		System.out.println("--------");
	}
}
