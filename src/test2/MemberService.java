package test2;

public class MemberService {
	
	// login
	boolean login(String id, String password) {
		if (id.equals("hong") && password.equals("12345")) {
		// if (id == "hong" && password == "12345") {
			return true;
		} else {
			return false;
		}
	}
			
	// logout
	void logout(String id) {
		System.out.println(id + "님이 로그아웃 되었습니다.");
	}
	
}
