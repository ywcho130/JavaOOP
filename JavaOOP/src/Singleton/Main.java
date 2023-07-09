package Singleton;

public class Main {
	public static void main(String[] args) {
		SingletonCalculator calculator = SingletonCalculator.getCalculaotr();
		double result1 = calculator.add(1, 2);
		double result2 = calculator.minus(3, 4);
		
		System.out.println(result1);
		System.out.println(result2);
	}

}
