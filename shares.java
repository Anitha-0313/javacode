package secondweekjava;
// input consists of 3 int .1 inp=number of gold coins in tresure and 2 inp=beards share percent and 3 inp other prirates  share
import java.util.*;
public class shares {
public static void main(String args[])
{
	Scanner sc =new Scanner(System.in);
	int x=sc.nextInt();//total coins=x
	int y=sc.nextInt();//ben share profit=y
	int z=sc.nextInt();//other praite share=z
	int share1=(x*y)/100;//long ben shares
	int a = x-share1;
	int share2=(a*z)/100;
	int c=share1+share2;
	int d=x-c;
	int pirate=300;// 300 members are there
	int share3=(d*100)/300;// in this first multiply with d what is the remaing after the all shares and divide with 100
	System.out.println(share1);
	System.out.println(share2);
	System.out.println(share3);
}
}
// this the 3 equal shares
