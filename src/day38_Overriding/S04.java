package day38_Overriding;
class Direved03{
	int a=4;
	public void getDetails() {
		System.out.println("Derived class ");
	}
}
public class S04 extends Direved03 {
	int b=5;
	public void getDetails () {
		System.out.println("Test class ");
		super.getDetails();
	}	
		
	public static void main(String[] args) {
		Direved03 obj = new S04();
		System.out.println(obj.a);
		obj.a=6;
		System.out.println(obj.a);
		obj.getDetails();

	}

}
