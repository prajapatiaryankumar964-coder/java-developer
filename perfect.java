import java.util.*;

class perfect
{

public static void main(String args[])
{


Scanner sc=new Scanner(System.in);
int a,j,sum=0;

System.out.println("\nenter the value for a=");
a=sc.nextInt();

j=1;
while(j<a)
{
    if(a%j==0)
    
{

    sum=sum+j;
}
j++;
}

System.out.print("\nsum="+sum);
System.out.print("\noriginal="+a);

if(sum==a)
{
    System.out.print("\nperfect no.");
}
else
{
    System.out.print("\nnot perefect no.=");

}

}
}