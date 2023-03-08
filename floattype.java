package secondweekjava;
import java.util.Scanner;
public class floattype {
	public static void main (String args[])
	{
		float a;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the float value");
		a=sc.nextFloat();
		System.out.printf("%.1f\n",a);
		System.out.printf("%.2f \n",a);
		System.out.printf("%.3f \n",a);
		System.out.printf("%.4f \n",a);
		System.out.printf("%.5f\n",a);

	}

}
