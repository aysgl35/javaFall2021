package day48_Maps_TheEnd;

import java.util.HashMap;
import java.util.Map;

public class C04_Compute {

	public static void main(String[] args) {
		Map<String, Integer> ornek=new HashMap<>();
		ornek.put("A", 2);
		ornek.put("B", 3);
		ornek.put("C", 1);
		ornek.put("Z", 3);
		ornek.put("K", 10);
	System.out.println(ornek);	//{A=2, B=3, C=1, Z=3, K=10}
	ornek.compute("A",(key,value)->10);
	System.out.println(ornek);//{A=10, B=3, C=1, Z=3, K=10}
	ornek.compute("B",(key,value)->2*value+5);
	System.out.println(ornek);//{A=10, B=11, C=1, Z=3, K=10}
	ornek.computeIfAbsent("D", v->20);
	System.out.println(ornek);//{A=10, B=11, C=1, D=20, Z=3, K=10}
	ornek.computeIfAbsent("C", v->13);//var oldugu icin eklemiyor
	System.out.println(ornek);//{A=10, B=11, C=1, D=20, Z=3, K=10}
	ornek.computeIfAbsent("L", k->12);//k ya da v olmasi önemli degil
	System.out.println(ornek);//{A=10, B=11, C=1, D=20, Z=3, K=10 L=12}
	
	ornek.computeIfPresent("L", (key,value)->2*value+5);//bu defa varsa degistirecek
	System.out.println(ornek);//{A=10, B=11, C=1, D=20, Z=3, K=10, L=29}
	}

}
