import java.util.*;
class biggest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number : ");
        int a = sc.nextInt();
        System.out.print("Enter Number : ");
        int b = sc.nextInt();
        System.out.print("Enter Number : ");
        int c = sc.nextInt();

        if(a>b && a>c)
        {
            System.out.println("A Biggest");
        }
        else if(b>a && b>c)
        {
            System.out.println("B Biggest");
        }
        else
        {
            System.out.println("C Biggest");
        }
    }
}