package myaddressbook;

import java.util.Scanner;

public class AddressBook {
	// 필드 정의
	private static Person[] persons = new Person[100];
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		/*
		boolean isRun = true;
		while(isRun) {
			
		}
		*/
		
		Student student = new Student();
		student.setName("홍길동");
		student.setPhone("010-0000-1111");
		student.setStudentNo("111112222233333");
		persons[0] = student;
		
		Worker worker = new Worker();
		worker.setName("고길동");
		worker.setPhone("010-1111-0000");
		worker.setWorkerNo("ABC1234");
		persons[1] = worker;
		
		
		for (Person person : persons) {
			if (person != null) {
				person.print();
			}
		}		
	}
}
