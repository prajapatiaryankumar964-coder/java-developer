
import java.util.*;

class age
{

public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
int ag;


System.out.println("\nenter Your Age=");
ag=sc.nextInt();
System.out.println("Total Months:"+(ag*12));
System.out.println("Total Weeks:"+(ag*52));
System.out.println("Total Days:"+(ag*365));
System.out.println("Total Minutes:"+(ag*8760));
System.out.println("Total Seconds:"+(ag*525600));


}

}
