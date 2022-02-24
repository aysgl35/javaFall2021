package _11_dateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q01 {

	public static void main(String[] args) {
		String date = LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE_TIME);
		//LocalDate=class parse=method stringe ceviriyor format=method DateTimeFormatter=class 
		//ISO_DATE_TIME= zaman saat dakika saniye bu final bir methoddur degistirilemez
		System.out.println(date);
		//what is the result ?

		/*
		 * A) May 04, 2014T00:00:00:000
		 * 
		 * B) 2014-05-04T00:00:00:000
		 * 
		 * C) 5/4/14T00:00:00:000
		 * 
		 * D) An exception is throw at runtime// cevap D þikki cünkü verilen tarih caðrilan method zaman saat dakika
		 */
	}
}
