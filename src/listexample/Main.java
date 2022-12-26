package listexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Student {
	private String name;
	private int korean;
	private int english;
	private int math;
	
	public Student(String name, int korean, int english, int math) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKorean() {
		return korean;
	}
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}	
}

public class Main {

	private static List<Student> students = new ArrayList<>();
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		/*
		students.add(new Student("홍길동", 100, 20, 80));
		students.add(new Student("고길동", 100, 20, 80));
		students.add(new Student("신길동", 100, 20, 80));
		
		for (Student std : students) {
			System.out.printf("%s\t%d\t%d\t%d\n", 
					std.getName(), 
					std.getKorean(), 
					std.getEnglish(),
					std.getMath()); 
		}
		*/	
		
		boolean isRun = true;
		while(isRun) {
			// 메뉴 출력
			System.out.println("------------------------------------------");
			System.out.println("1.입력 | 2.국어 | 3.영어 | 4.수학 | 5.종료");
			System.out.println("------------------------------------------");
			
			// 메뉴 선택에 따른 분기
			System.out.print("> ");
			switch(Integer.parseInt(scan.nextLine().trim())) {
			case 1: 
				// 이름, 국어, 영어, 수학 점수를 입력받아서 Student 객체를 만든 후 
				// 해당 객체를 students 리스트 객체에 추가
				// students.add(new Student(...))
				{
					System.out.println("> 이름, 국어, 영어, 수학 점수를 입력하세요. (입력을 종료하면 Q를 입력하세요.)");
					while(true) {
						String s = scan.nextLine().trim();
						if (s.equals("q") || s.equals("Q")) {
							break;
						}
						
						String[] input = s.split(",");
						Student student = new Student(
								input[0].trim(),
								Integer.parseInt(input[1].trim()),
								Integer.parseInt(input[2].trim()),
								Integer.parseInt(input[3].trim()));
						students.add(student);
					}
				}
				break;
			case 2:
				// students 리스트 타입의 객체에서 Student 객체를 하나씩 가져와서 
				// 국어 점수를 추출해서 합계를 구한 후 평균을 계산
				{
					double sum = 0;
					for(Student student : students) {
						sum = sum + student.getKorean();
						System.out.printf("> %s: %d\n", student.getName(), student.getKorean());
						
					}
					double average = sum / students.size();
					average = (double)Math.round(average * 10) / 10;
					
					// 76.6666666  7666.66666  7667  76.67
					
					System.out.printf("> 총점: %4.0f\n", sum);
					System.out.printf("> 평균: %4.1f\n", average);
				}
				break;
			case 3:
				// 영어 점수
				{
					double sum = 0;
					for(Student student : students) {
						sum = sum + student.getEnglish();
						System.out.printf("> %s: %d\n", student.getName(), student.getEnglish());						
					}
					double average = sum / students.size();
					average = (double)Math.round(average * 10) / 10;
					
					System.out.printf("> 총점: %4.0f\n", sum);
					System.out.printf("> 평균: %4.1f\n", average);
				}
				break;
			case 4:
				// 수학 점수
				{
					double sum = 0;
					for(Student student : students) {
						sum = sum + student.getMath();
						System.out.printf("> %s: %d\n", student.getName(), student.getMath());						
					}
					double average = sum / students.size();
					average = (double)Math.round(average * 10) / 10;
					
					System.out.printf("> 총점: %4.0f\n", sum);
					System.out.printf("> 평균: %4.1f\n", average);
				}
				break;
			case 5:
				isRun = false;
				break;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}

}
