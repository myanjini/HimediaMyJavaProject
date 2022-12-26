package test2;

public class SuperTest {

	public String toString() {
		return "SuperTest 클래스입니다.";
	}	   
	
	public static void main(String[] args) {
		SuperTest st = new SuperTest();
		
		String s = "";
		s.equals("");
		
		
		System.out.println(st.toString());	// test.SuperTest@3d012ddd
	}
}
