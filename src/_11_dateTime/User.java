package _11_dateTime;

import java.time.LocalDateTime;

public class User {

	
		/*Bu uygulama kulan�c�lar�n bir ArrayListe kay�t zaman�n� da alarak
     ekleyen ve sonras�nda her dakikan�n ilk 10 saniyesinde kaydolanlar�
     �ansl� kullan�c� olarak ekrana yazd�ran bir uygulamad�r.
     Bunun i�in;
     1- Bir user class olu�turun fields: name , registerDate (LocalDateTime cinsinden)
     2- Registration isminde bir class olu�turun ve register isminde bir metod
     ekleyerek Kullan�c�dan user ismini alarak ArrayList e ekleyin ve bu list i
     return edin.
     3- Registration class� na ayn� zamanda kendine verilen
     ArrayListteki userlardan her dakikan�n ilk  saniyesinde kaydolanlar�
     yazd�ran printHappyUsers isminde bir metod daha ekleyiniz.

     �pucu �al��acak main metodu a�a��daki gibi olmal�d�r.

     public static void main(String[] args) {
     Registration userReg = new Registration();https://www.msn.com/tr-tr/feed
     ArrayList<User> register = userReg.register();
      userReg.printHappyUsers(register);
		 * 
		 */
		
		
	String name;
	LocalDateTime registerDate;
	public User() {//parametresiz constructor
		
	}
	User(String name, LocalDateTime registerDate) {
		this.name = name;
		this.registerDate = registerDate;
	}
	

	}


