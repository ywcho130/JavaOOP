package Abstractization;

public class Main {
	public static void main(String[] args) {
		Animal dog = new Dog("Bobby");
		dog.makeSound(); // dog barks.
		dog.eat(); // Bobby is eating.
		
		Animal cat = new Cat("Kitty");
		cat.makeSound(); // Cat meows.
		cat.eat(); // Kitty is eating.
	}

}
