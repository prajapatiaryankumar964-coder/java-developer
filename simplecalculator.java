import java.util.*;

class simplecalculator
{
    public static void main(String args[])
    {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("a: ");
        int a = sc.nextInt();

        

        System.out.print("b: ");
        int b = sc.nextInt();

       

        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();


        switch(ch)
        {
            case 1:
                System.out.println(a+b);
                break;

            case 2:
                System.out.println(a-b);
                break;

            case 3:
                System.out.println(a*b);
                break;

            case 4:
                System.out.println(a/b);

            default:
                System.out.println("Invalid Choice");
        }
    }
}