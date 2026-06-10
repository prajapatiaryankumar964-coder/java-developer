import java.util.*;

class for1
{

public static void main(String args[])
{


Scanner sc=new Scanner(System.in);
int a,b,i,j;

System.out.println("\nenter the value for a=");
a=sc.nextInt();
System.out.println("\nenter the value for b=");
b=sc.nextInt();

for(j=a;j<=b;j++)
{
    for(i=1;i<=10;i++)
{
System.out.println(j+"x"+i+"="+j*i);
}

}

}

}