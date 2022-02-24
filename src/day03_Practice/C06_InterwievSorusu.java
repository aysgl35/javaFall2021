package day03_Practice;

public class C06_InterwievSorusu {
	// interwiev sorusu 
	public static void main(String[] args) {
	int a=9;
	switch (a) {
	case 0:
		a++;
		
		case 9:
			a+=a;
			System.out.println(a);
		
		default: 
			a%=5;
	}
	System.out.println(a);
			
	}

	}


