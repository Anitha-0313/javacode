package secondweekjava;
// write a program to rectangle perimeter and the quantity means length into breath 
import java.util.*;
public class cricketstadium {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int length=sc.nextInt();
	int breadth=sc.nextInt();
	int perimeter =2*(length+breadth);
	int area=length*breadth;
	System.out.println(perimeter);
	System.out.println(area);

}
}
