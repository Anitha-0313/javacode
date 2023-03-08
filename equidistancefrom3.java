// eqi distance of 3 places x and y formula  (x1+x2+x3)/3 (y1+y2+y3)/3
package secondweekjava;
import java.util.*;
class A
{
	int x1,x2,x3;
	int y1,y2,y3;
	// reading x1,x2,x3,y1,y2,y3
	void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter val");
		x1=sc.nextInt();
		x2=sc.nextInt();
		x3=sc.nextInt();
		y1=sc.nextInt();
		y2=sc.nextInt();
		y3=sc.nextInt();
	}
	
	// printing with the formula  x1,x2,x3,y1,y2,y3
	void output()
	{
	 float a=(x1+x2+x3)/3;
	 float b=(y1+y2+y3)/3;
	System.out.printf("% .1f \n", a);
	System.out.printf("%.1f",b);
		
	}
	
	
}
public class equidistancefrom3 {
	public static void main (String args[])
	{
		A ob=new A();
		ob.read();
		ob.output();
	}
}
