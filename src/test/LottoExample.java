package test;

import java.util.Arrays;
import java.util.Scanner;

public class LottoExample {
	private static int[] userInputNumbers = new int[6];
	private static int[] lottoNumbers = new int[6];	
	
	private static void setUserInput() {
		// 사용자 입력 -> 정렬 -> 출력
		System.out.println("> 1부터 45 사이의 6개의 숫자를 입력하세요.");
		System.out.print("> ");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();		// input = "1, 42, 9, 8, 2, 33"  (콤마로 연결되어 있는 6개의 숫자)
		scan.close();
		
		// 입력값을 콤마를 기준으로 분리 
		String[] values = input.split(",");	// values = { "1", " 42", " 9", " 8", " 2", " 33" }
		
		// 로또 번호의 데이터 타입과 동일한 데이터 타입으로 변경 (String[] -> int[])
		// int[] userInputNumbers = new int[6];
		for (int i = 0; i < values.length; i ++) {
			userInputNumbers[i] = Integer.parseInt(values[i].trim());
		}
		// System.out.println(Arrays.toString(userInputNumbers));	// [1, 42, 9, 8, 2, 33]
		
		// 사용자 입력 데이터를 담고 있는 배열의 값을 정렬
		Arrays.sort(userInputNumbers);
		// System.out.println(Arrays.toString(userInputNumbers));	// [1, 2, 8, 9, 33, 42]	
		
		// 정렬된 결과를 출력 
		System.out.print(">> 선택번호: ");
		for(int no : userInputNumbers) {
			System.out.printf("%2d  ", no);
		}
		System.out.println();
		
	}

	private static void generateLottoNumbers() {
		// 로또 번호 생성 -> 정렬 -> 출력
		// 로또 번호를 저장하는 배열을 정의
		// int[] lottoNumbers = new int[6];			// { 0, 0, 0, 0, 0, 0 }
		while(true) {
			int num = (int) (Math.random() * 45) + 1;

			int i = 0;
			for (i = 0; i < lottoNumbers.length; i ++) {
				if (lottoNumbers[i] == num) 
					break;
				if (lottoNumbers[i] == 0) {
					lottoNumbers[i] = num;
					break;
				}
			}
			
			if (i == lottoNumbers.length)
				break;
		}
		// System.out.println(Arrays.toString(lottoNumbers));
		
		// 정렬
		Arrays.sort(lottoNumbers);
		// System.out.println(Arrays.toString(lottoNumbers));
		
		// 정렬된 배열을 출력
		System.out.print(">> 당첨번호: ");
		for(int no : lottoNumbers) {
			System.out.printf("%2d  ", no);
		}
		System.out.println();
	}
	
	private static void showResult() {
		// 로또 번호와 사용자 입력을 비교 -> 결과를 출력
		int count = 0;
		for(int user : userInputNumbers) {
			for(int lotto : lottoNumbers) {
				if (lotto == user) {
					count ++;
					break;
				}
			}
		}
		String message = "";
		if (count == 6) {
			message = "1등으로 당첨되었습니다.";
		}
		else if (count == 5) {
			message = "2등으로 당첨되었습니다.";
		}
		else if (count == 4) {
			message = "3등으로 당첨되었습니다.";
		}
		else {
			message = "당첨되지 않았습니다.";
		}
		System.out.printf("%d개가 일치하므로 %s\n", count, message);
	}
	
	public static void main(String[] args) {
		setUserInput();
		generateLottoNumbers();
		showResult();
	}
}
