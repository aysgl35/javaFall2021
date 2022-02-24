package day33_StringBuider;

public class C06_SubSquence {

	public static void main(String[] args) {
		StringBuilder sb =new StringBuilder("Java ne kadar kolay");
		System.out.println(sb.substring(14));//kolay
		System.out.println(sb.subSequence(14, 19));//kolay
	// ikisi de ayni sonucu döndürür ancak substring() String classindan geldigi için
	//arkasindan String methodlarini kullabilirim
	//ancak subSequence() kullandigimda bu mumkun olmaz
		
	}

}
