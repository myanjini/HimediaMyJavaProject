package test;

import java.text.DecimalFormat;

public class DecimalFormatExample {

	public static void main(String[] args) {
		double number = 1234567.89;
		
		DecimalFormat df;

		// 정수 자리까지 표기
		df = new DecimalFormat("#,###");
		System.out.println(df.format(number));	// 1,234,568

		// 소수 첫번째 자리까지 표기
		df = new DecimalFormat("#,###.0");
		System.out.println(df.format(number));	// 1,234,567.9
	}
}
