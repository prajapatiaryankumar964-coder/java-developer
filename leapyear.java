import java.util.*;

class leapyear
{
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter year : ");
        int year= sc.nextInt();

        if(year % 4 == 0)
        {
            System.out.println("Leap Year");
        }
        else 
        {
            System.out.println("Not Leap Year");
        }
    }
}