package day39_Overridding_Polymorphism;

public class Lamb extends Animal {
	
	public void eat() {
		super.eat();
		System.out.println("Lambs eat grass");
	}

	public static void main(String[] args) {
		Lamb lamb = new Lamb();
		lamb.eat();

	}

}
