package day38_Overriding;
class Direved04{
	
	public void getDetails() {
		System.out.println("Derived class ");
	}
}
public class S05 extends Direved04 {
	public void getDetails () {
		System.out.println("Test class ");
		super.getDetails();
	}	
		
	public static void main(String[] args) {
		Direved04 obj = new Direved04();
		Direved04 obj1 = new S05();
		obj.getDetails();
		obj1.getDetails();
		

	}

}
