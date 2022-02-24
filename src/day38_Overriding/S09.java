package day38_Overriding;
class Super{

	public Integer getLength() {
		return 4;
	}
}

public class S09 {
	public Integer getLength() {
		return  5;
	}


	public static void main(String[] args) {
		Super sooper=new Super();
		S09 sub=new S09();
		System.out.println(sooper.getLength().toString() + 
				", " + sub.getLength().toString());
	}

}
