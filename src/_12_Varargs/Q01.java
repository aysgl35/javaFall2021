package _12_Varargs;

public class Q01 {
	public static void main(String[] args) {
		//  verilen Stringleri birlestiren concat isimli bir method olusturunuz
		// input : "m", "e", "r", "v", "e";
		// output : merve
		concat("A","y","s","e");
		concat(" Haným"," cok"," basarýlý***");
		concat("Cünkü", " java", " çalýþmayý", " seviyor");
	}

	public static void concat(String...str) {
		String yeniStr="";
		for (String w : str) {
			//yeniStr=w;
			//System.out.print(w);
			
		yeniStr=yeniStr.concat(w);
		}
		//System.out.println(" ");
		System.out.print(yeniStr);
	
		/*concat("h","a","c","e","r");
		concat("haným ", "basrili"," qa");
	}
	
	    public static void concat(String... str) {
		        String yeniStr = "";
		        for (String w : str) {
		            yeniStr = yeniStr.concat(w);
		        }
		        System.out.println(yeniStr);*/
	}

	
	}


