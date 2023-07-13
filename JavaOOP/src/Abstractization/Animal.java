package Abstractization;

abstract class Animal {
	private String name;
	public Animal(String name) {
		this.name = name;
	}

	public abstract void makeSound(); // 추상 메서드
	
	public void eat() {
		System.out.println(name + " is eating.");
	}
	
}
