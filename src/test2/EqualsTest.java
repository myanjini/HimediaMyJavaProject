package test2;

import java.util.HashMap;

class Person {
	private String name;
	
	Person(String name) {
		this.name = name;
	}
	
	// 실제 내용(이름)을 비교하도록 equals 메서드를 오버라이드
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person person = (Person) obj;
			if (person.name == this.name) {
				return true;
			}
		}
		return false;
	}
}


public class EqualsTest {

	public static void main(String[] args) {
		Person p1 = new Person("홍길동");
		Person p2 = new Person("홍길동");

		System.out.println(p1.hashCode());	// 1865127310
		System.out.println(p2.hashCode());	// 1586600255
		
		System.out.println(p1 == p2);		// false
		System.out.println(p1.equals(p2));	// true
		
		
		Person p3 = p1;
		System.out.println(p3.hashCode());	// 1865127310
		
		System.out.println(p1 == p3);		// true
		System.out.println(p1.equals(p3));	// true
		
		HashMap hm = new HashMap();
		hm.put(1, "홍길동");
		hm.put(2, "고길동");
		System.out.println(hm.get(1)); 		// 홍길동
		System.out.println(hm.get(2)); 		// 고길동
		
		hm.put(1, "신길동");
		System.out.println(hm.get(1)); 		// 신길동
		System.out.println(hm.get(2)); 		// 고길동
		
	}
}
