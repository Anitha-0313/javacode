package secondweekjava;
//divide 4 groups
import java.util.*;
public class divide {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int a= sc.nextInt();
	if(a>=100&&a<=200) {
	for (int i=0;i<4;i++)
	{
      if(a%4==0)
      {
    	 int res=a/4;
    	 System.out.println(res);
      }
      else
      {
    	  
    	  int b=a%4;
    	  int res=a/4;
    	  if(i==3)
    	  {
    		  res=a/4+b;
    	  }
    	  System.out.println(res);
          
    	  }
	}
	
}
}
}

