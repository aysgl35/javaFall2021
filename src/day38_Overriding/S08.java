package day38_Overriding;

public class S08 {

	public static void main(String[] args) {
		X x = new X();
		Y y = new Y();
		y.m2();
		x.m1();
		y.m1();
		x=y;
		x.m1();

	}

}

class X{
	public void m1() {
		System.out.println("m1, X class");
	}
}

class Y extends X{
	public void m1() {
		System.out.println("m1, Y class");
	}
	public void m2() {
		System.out.println("m2, Y class");
	}

 

	public static void main(String[] args) {
		Computer mouse = new Laptop();
		System.out.println(mouse.getValue(100, 200));

	}
}
	class NoteBook{
		int getValue(int a,int b) {
			if(a>b)
				return a;
			else
				return b;
		}
	}

	class Computer extends NoteBook{
		int getValue(int a , int b) {
			return a*b;
		}
	}

	class Laptop extends Computer{
		int getValue(int a , int b) {
			return b - a;

	}

}
