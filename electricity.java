package secondweekjava;
// elecricity bill if less than 200 then units is0.5
// if it is less than 400 then units is 0.65 with 100 charge
//if it is less than 600 then units is 0.8 with 200 charge
import java.util.*;
import java.math.*;
public class electricity {
public static void main (String args[])

{
	double res;
	Scanner sc=new Scanner(System.in);
	
	int a=sc.nextInt();
	if(a<=200)
	{
		double unit=0.5;
		res=a*unit;
		
		System.out.println(res);
		
	}
	
	else if(a<=400)
	{
		double unit=0.65;
		int charge=100;
		
		res=(a*unit)+charge;
		int con=(int) Math.ceil(res);
		
		System.out.println(con);
	
	}
	
	else if(a<=600)
	{
		double unit=0.80;
		int charge=200;
		res=(a*unit)+charge;
		int con=(int)Math.ceil(res);
		System.out.println(con);
	}
	else
	{
		res=(a*1.25)+425;
		int con=(int)Math.ceil(res);
		System.out.println(con);
	}
	}


}
