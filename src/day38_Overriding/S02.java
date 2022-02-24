package day38_Overriding;

class Derived01{
	public void getDetails(String temp) {
		System.out.println("Derived class "+temp);
	}
}
public class S02 extends Derived01{
	public void getDetails (String temp) {
		System.out.println("Test class "+temp);
		
	
	}
	
	public static void main(String[] args) {
		S02 obj = new S02();
		obj.getDetails("GFG");
		
	}

}
