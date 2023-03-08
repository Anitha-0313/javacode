package secondweekjava;
// input consists of 3 intergers w x y is the number of copies sold x is the cost per copy and y is the agency  spends per copy
import java.util.*;
// delivery and storage 100
public class profit {
public static void main(String args[])

{
	Scanner sc=new Scanner(System.in);
	int w=sc.nextInt();
	int x=sc.nextInt();
	int y=sc.nextInt();
	int profit=((w*x)-(w*y))-100;
	System.out.println(profit);
	
	}
}

// in this  w is the copies sold so it is 1000 and copies sold with the rate of x that is 2 then selling price will be (w*x)means number of copies sold into the rate you sold
//y is the spend on agency cost price you have to calaculate the cost of the agency for per copy soo (w*y)
// every delivery 100 so dect 100
//formula ((w*x)-(w*y))-100