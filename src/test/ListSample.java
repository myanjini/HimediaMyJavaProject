package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListSample {

	public static void main(String[] args) {
		String[] array = new String[] { "가", "나", "다", "라" };
		System.out.println(array.length);			// 4
		System.out.println(Arrays.toString(array));	// [가, 나, 다, 라]
		array[1] = null;
		array[2] = null;
		array[3] = null;
		System.out.println(array.length);			// 4
		System.out.println(array[0]);				// 가	
		
		
		
		List<String> list = new ArrayList<>();
		list.add("다");
		list.add("나");
		list.add("가");
		list.add("라");
		System.out.println(list.size());			// 4
		System.out.println(list.toString());		// [다, 나, 가, 라]
		System.out.println(list.get(0));			// 다
		list.remove(0);
		list.remove("라");
		System.out.println(list.size());			// 2
		System.out.println(list.toString());		// [나, 가]
		System.out.println(list.get(0));			// 나
		
		list.add(2, "다");
		System.out.println(list.size());			// 3
		System.out.println(list.toString());		// [나, 가, 다]
		
		list.add(2, "X");
		System.out.println(list.size());			// 4
		System.out.println(list.toString());		// [나, 가, X, 다]
		
		list.removeAll(list);
		System.out.println(list.size());			// 0
		System.out.println(list.toString());		// []
		System.out.println(list.isEmpty());			// true
		
		// java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
		// list.remove(0);
		
		// java.lang.IndexOutOfBoundsException: Index: 2, Size: 0
		// list.add(2, "Y");		
	}
}
