package mapsample;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapSample {

	// 과일이름을 키로, 출현회수를 값으로 가지는 fruites라는 맵을 정의 
	private static Map<String, Integer> fruites = new HashMap<>();
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("지금까지 먹었던 과일을 입력하세요.");
		String input = scan.nextLine().trim();
		
		String[] fruiteNames = input.split(" ");
		
		// 입력 받은 과일 이름을 하나씩 가져와서 
		for (String fruiteName : fruiteNames) {
			// 맵의 키 목록(=과일 이름 목록)에서 입력 받은 과일 이름이 존재하는지 확인
			if (fruites.keySet().contains(fruiteName)) {
				// 존재하는 경우, 해당 과일의 카운트를 가져와서 1 증가
				Integer count = fruites.get(fruiteName);
				fruites.put(fruiteName, count + 1);
			} else {
				fruites.put(fruiteName, 1);
			}
		}
		
		
		System.out.printf("지금까지 먹었던 과일은 총 %d가지 종류이고 각 과일의 섭취 회수는 다음과 같습니다.\n", 
				fruites.size());
		for (String key : fruites.keySet()) {
			System.out.printf("- %s : %d\n", key, fruites.get(key));
		}
		
	}

}
