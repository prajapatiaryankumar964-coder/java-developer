import java.util.*;

class array
{

public static void main(String args[])
{


Scanner sc=new Scanner(System.in);
int a,sum=0,i;
int num[]=new int[10];
System.out.println("\nenter 10 numbers\n");


i=0;
while(i<10)
{
    num[i]=sc.nextInt();
    sum+=num[i];

    i++;
}

System.out.println("sum="+sum);

}
}