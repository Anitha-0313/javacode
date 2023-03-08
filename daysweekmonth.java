package secondweekjava;
// one input in this we should check how many days years and months 3 output one input
import java.util.*;
public class daysweekmonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int in=sc.nextInt();
		int year=in/365;
		int m=(in-year*365)/30;//in valute take 373 then multply with the year with 365 u will get a val then sub with in and div with 30 as per 1mon=30 days
		System.out.println(year);
		System.out.println(m);
		int days=in-365;
		
		System.out.println(days);
		

	}

}
