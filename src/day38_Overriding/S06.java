package day38_Overriding;
class Person{
	public void talk() {
		System.out.println("First Program");
	}
}
class Student extends Person{
	public void talk() {
		System.out.println("Second Program");
	}
}
public class S06 {
	
public static void main(String[] args) {
		Person p = new Student();
		p.talk();//Second Program
	//Bir obje ile method ca�r�l�nca java data t�r�n�n class�ndaki methoda gider fakat o method gecersiz
	//k�l�nm�ssa (overriden) java constructora bakar o classa gider ve o method calisir
		

	}

}
