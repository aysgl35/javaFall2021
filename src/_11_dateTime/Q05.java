package _11_dateTime;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Q05 {

    public static void main(String[] args) {

       /*
         What is the output of the following code?
        Asagidaki code'un  ciktisi  nedir?
        */

        LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);

        Period p = Period.ofDays(1).ofYears(2);//son eklenen period ilkini ezer,son eklenen zaman dilimi gecerlidir.

        d = d.minus(p);//minus=(maynýs)geri gitmek. 2 yil geri git diyor

        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);

        System.out.println(d.format(f));//10.05.2013 11:22

 /*
            A. 5/9/13 11:22
            B. 5/10/13 11:22
            C. 5/9/14
            D. 5/10/14
            E. The code does not compile.
            F. A runtime exception is thrown.
*/

    }
}