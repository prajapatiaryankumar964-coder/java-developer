import java.util.*;

class daydemo
{
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of the day : ");
        int day= sc.nextInt();


        switch(day)
        {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;

            default:
                System.out.println("Invalid Day");
        }
    }
}