package _13_stringBuilder;

public class Q01 {
    public static void main(String[] args) {
		/*
		Bir cumleyi parametre olarak kabul eden, StringBuilder kullanarak cumleyi ters ceviren ve cumlenin palindrom
	        olup olmadýgýnýný kontrol eden (buyuk/kucuk harf duyarlýlýðý olmadan) bir Java programý yazýn.
	     (without case sensitivity)
	     Eg : input : I love Java
	     Output: "Reversed sentence : avaJ evol I 
	        It is not a palindrome"

		 */
    	String str="ey edip adanada pide ye";
    	StringBuilder sb = new StringBuilder(str);
    	// kullanýcidan alirsak (StringBuilder sb = new StringBuilder(scan.nextLine();) bu sekilde yapabilirz
    	//sb.append(str); böyle de olur.
    	String tersMetin=sb.reverse().toString();//burda metod zinciri var. toString yaparak String varaible ceviriyoruz
    	
    	if (tersMetin.equalsIgnoreCase(str)) {
			System.out.println("Girilen metin polindrome ifadedir:"+tersMetin);
		}else System.out.println("Girilen metin polindrome ifade degil:"+tersMetin);
    	
    
    
    
    }

}
