package secondweekjava;
// adult weight 75kg and children 30 kg if  weight is normal is boat stable else no
// 3 integers 1input= weight that boat can handle 2= weight of audlt and 3 =chilren output stable or not
import java.util.*;
public class stablebotornot {
public static void main(String args[])
{
	int adult=75;
	int child=30;
	Scanner sc =new Scanner(System.in);
	int total=sc.nextInt();
	int aweight=sc.nextInt();
	int cweight=sc.nextInt();
	int cala=aweight*adult;
	int calc=cweight*child;
	int add=cala+calc;
	if(add>total)
	{
		System.out.println("boat will drown");
		
	}
	else
	{
		System.out.println("stable boat");
	}
}
}
