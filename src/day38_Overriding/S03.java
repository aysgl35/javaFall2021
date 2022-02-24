package day38_Overriding;

class Direved02{
	public void getDetails() {
		System.out.println("Derived class ");
	}
}
public class S03 extends Direved02{
	public void getDetails () {
		System.out.println("Test class ");
		
	
	}
	
	public static void main(String[] args) {
		Direved02 obj = new S03();
		obj.getDetails();
		
	}

}
