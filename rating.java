package secondweekjava;
// rating
import java.util.*;
public class rating {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int rank=sc.nextInt();
	
	if(rank>=30 &&rank<=50) {
		 System.out.println("Average");
		 
    }
	else if(rank>=51 &&rank<=60)
	{
		 System.out.println("good");
	}
	else if(rank>=61 &&rank<=80)
	{
		 System.out.println("Excellent");
	}
	else if(rank>=90 &&rank<=100)
	{
		 System.out.println("outstanding");
	}
	}
}

