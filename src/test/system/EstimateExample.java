package test.system;

public class EstimateExample {

	public static void main(String[] args) {
		
		int sum = 0;
		long start = System.nanoTime();
		for (int i = 1; i <= 1000000; i ++) {
			sum = sum + i;
		}
		long end = System.nanoTime();
		
		System.out.println(sum);
		System.out.println("소요시간 = " + (end - start) + "(나노초)");
	}
}
