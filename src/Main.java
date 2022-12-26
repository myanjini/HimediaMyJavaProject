import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		Map<Integer, String> hm = new HashMap<>();
		hm.put(1,  "가나다");
		hm.put(2,  "라마바");
		hm.put(1, "abc");
		System.out.println(hm.toString());
	}

}
