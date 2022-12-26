package mapsample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Fruite {
	private String name;
	private int count;
	
	public Fruite(String name, int count) {
		super();
		this.name = name;
		this.count = count;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}	
}

public class ListSample {
	private static List<Fruite> fruites = new ArrayList<>();
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("지금까지 먹었던 과일을 입력하세요.");
		String input = scan.nextLine().trim();
		
		String[] values = input.split(" ");
		
		System.out.println(Arrays.toString(values));
		
		// 입력 받은 과일 이름을 하나씩 가져와서 
		for (String value : values) {
			
			// 과일 목록의 값과 비교 
			boolean isRegisted = false;
			for (Fruite fruite: fruites) {				
				// 입력 받은 과일 이름과 과일 목록의 과일 이름과 동일하면 
				// 카운트를 증가시키고 비교를 중지
				if (value.equals(fruite.getName())) {
					fruite.setCount(fruite.getCount() + 1);
					isRegisted = true;
					break;
				}
			}
			
			// 과일 목록에 이름이 일치하는 과일이 없는 경우
			// 해당 과일을 과일 목록에 추가
			if (!isRegisted) {
				fruites.add(new Fruite(value, 1));
			}
		}
		
		
		System.out.printf("지금까지 먹었던 과일은 총 %d가지 종류이고 각 과일의 섭취 회수는 다음과 같습니다.\n", 
				fruites.size());
		for (Fruite fruite : fruites) {
			System.out.printf("- %s : %d\n", fruite.getName(), fruite.getCount());
		}
		
	}

}
