import java.util.*;

class min
{

public static void main(String args[])
{


Scanner sc=new Scanner(System.in);
int i,j,n=5;
int a[]=new int[5];
for(i=0;i<n;i++)
{

System.out.println("\nenter the value:");
a[i]=sc.nextInt();
}

int min=a[0];
for(i=0;i<n;i++)
{
    if(a[i]<min)
    {
        min=a[i];
    }  


}

System.out.println("minimum value="+min);

}
}