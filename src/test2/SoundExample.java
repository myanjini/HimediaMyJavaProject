package test2;

interface Soundable {
	String sound();
}

class Cat implements Soundable {
	@Override
	public String sound() {
		return "야옹";
	}
}

class Dog implements Soundable {
	@Override
	public String sound() {
		return "멍멍";
	}
}

public class SoundExample {
	
	public static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	public static void main(String[] args) {
		printSound(new Cat());	// 야옹
		printSound(new Dog());	// 멍멍
	}	
}
