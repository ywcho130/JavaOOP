package Interface;

public class Driver {
	public static void main(String[] args) {
		System.out.println(Speakable.absoluteZeroPoint);
		System.out.println(Speakable.PI);
		
		Specker reporter1 = new Specker();
		reporter1.sayYes();	
	}

}
