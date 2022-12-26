package myaddressbookv2;

import java.util.Scanner;

public class AddressBook {
	// 필드
	private static Person[] persons = new Person[100];
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		boolean isRun = true;
		while (isRun) {
			// 메뉴를 출력
			showMenu();

			// 메뉴를 선택하면 선택한 메뉴에 맞는 메서드를 호출
			switch (scan.nextInt()) {
			case 1:
				regist();
				break;
			case 2:
				show();
				break;
			case 3:
				modify();
				break;
			case 4:
				delete();
				break;
			case 5:
				isRun = false;
				break;
			}
		}

		// 프로그램을 종료
		System.out.println("프로그램을 종료합니다.");
	}

	private static void regist() {
		System.out.println("----");
		System.out.println("등록");
		System.out.println("----");
		
		System.out.print("이름: ");
		String name = scan.next();
		
		System.out.print("전화번호: ");
		String phoneNo = scan.next();
		
		System.out.print("학생여부: ");
		String studentYn = scan.next();
		studentYn = studentYn.trim().toUpperCase();
		
		// 학생 또는 회사원 객체를 생성해서 persons 배열에 추가
		Person person = null;
		if (studentYn.equals("Y")) {
			System.out.print("학번: ");
			String studentNo = scan.next();
			
			/*
			Student student = new Student();
			student.setName(name);
			student.setPhoneNo(phoneNo);
			student.setStudentNo(studentNo);
			*/
			
			/*
			Student student = new Student(name, phoneNo, studentNo);
			person = student;
			*/		
			person = new Student(name, phoneNo, studentNo);
		} else {
			System.out.print("사번: ");
			String workerNo = scan.next();
			
			/*
			Worker worker = new Worker();
			worker.setName(name);
			worker.setPhoneNo(phoneNo);
			worker.setWorkerNo(workerNo);
			*/
			
			/*
			Worker worker = new Worker(name, phoneNo, workerNo);
			person = worker;
			*/
			person = new Worker(name, phoneNo, workerNo);			
		}
		
		for (int i = 0; i < persons.length; i ++) {
			if (persons[i] == null) {
				persons[i] = person;
				break;
			}
		}
	}

	private static void show() {
		System.out.println("----");
		System.out.println("조회");
		System.out.println("----");
		
		for (int i = 0; i < persons.length; i ++) {
			if (persons[i] != null) {
//				if (persons[i] instanceof Student) {
//					Student student = (Student) persons[i];
//					student.print();
//				} 
//				else if (persons[i] instanceof Worker) {
//					Worker worker = (Worker) persons[i];
//					worker.print();
//				}
//				else if (persons[i] instanceof Teacher) {
//					Teacher teacher = (Teacher) persons[i];
//					teacher.print();
//				}
				
				persons[i].print();
			}
		}
	}

	private static void modify() {
		System.out.println("----");
		System.out.println("수정");
		System.out.println("----");
		
		System.out.print("이름: ");
		String name = scan.next();
		
		System.out.print("전화번호: ");
		String phoneNo = scan.next();
		
		// persons 배열에서 이름이 일치하는 Person을 가져와서 전화번호를 변경
		for (int i = 0; i < persons.length; i ++) {
			if (persons[i] != null && persons[i].getName().equals(name)) {
				persons[i].setPhoneNo(phoneNo);
				System.out.println("결과 > 정상적으로 수정되었습니다.");
				break;
			}
		}
	}

	private static void delete() {
		System.out.println("----");
		System.out.println("삭제");
		System.out.println("----");
		
		System.out.print("이름: ");
		String name = scan.next();
		
		// persons 배열에서 이름이 일치하는 Person을 삭제
		for (int i = 0; i < persons.length; i ++) {
			if (persons[i] != null && persons[i].getName().equals(name)) {
				persons[i] = null;
				System.out.println("결과 > 정상적으로 삭제되었습니다.");
				break;
			}
		}		
	}

	private static void showMenu() {
		System.out.println("------------------------------------------");
		System.out.println("1.등록 | 2.조회 | 3.수정 | 4.삭제 | 5.종료");
		System.out.println("------------------------------------------");
		System.out.print("선택 > ");
	}

}
