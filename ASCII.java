package secondweekjava;
// program wheather the character is in upper or lower or digit;
import java.util.*;
import java.lang.*;
public class ASCII {
public static void main(String args[])

{
	Scanner sc=new Scanner(System.in);
	char a= sc.next().charAt(0);
	
	
   if (Character.isLowerCase(a)) //if(a>='A' &&a<='Z')
	{
		System.out.println("lower");
	}
   else if(Character.isUpperCase(a))//if(a>='a' &&a<='z')
	{
		System.out.println("upper");
	}
	else// //if(a>='0' &&a<='9') then else symbol
	{
		System.out.println("digit");
	}
	
}
}
