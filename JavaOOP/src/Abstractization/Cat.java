package Abstractization;

public class Cat extends Animal {

	public Cat(String name) {
		super(name);
	}

	@Override
	public void makeSound() {
		System.out.println("Cat meows.");
	}

}
