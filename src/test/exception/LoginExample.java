package test.exception;

class NotExistIDException extends Exception {
	
	private String myMessage;
	public String getMyMessage() {
		return myMessage;
	}
	public void setMyMessage(String myMessage) {
		this.myMessage = myMessage;
	}
	
	
	public NotExistIDException() {}
	public NotExistIDException(String message) {
		super(message);
	}
}

class WrongPasswordExeption extends Exception {
	public WrongPasswordExeption() {}
	public WrongPasswordExeption(String message) {
		super(message);
	}
}

public class LoginExample {
	public static void main(String[] args) {
		try {
			login("white", "12345");			
		} catch(Exception e) {
			NotExistIDException neid = (NotExistIDException)e;
			System.out.println(neid.getMyMessage());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		try {
			login("blue", "54321");			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void login(String id, String password) throws NotExistIDException, WrongPasswordExeption {
		// id가 blue가 아니라면 NotExistIDException을 발생시킴
		if (!id.equals("blue")) {
			NotExistIDException neid = new NotExistIDException("아이디가 존재하지 않습니다.");
			neid.setMyMessage("^^");
			throw neid;
		}
		
		// password가 12345가 아니라면 WrongPasswordExeption을 발생시킴
		if (!password.equals("12345")) {
			throw new WrongPasswordExeption("패스워드가 틀립니다.");
		}
			
	}
}
