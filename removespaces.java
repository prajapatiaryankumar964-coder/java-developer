import java.util.Scanner;

class removespaces 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(str.replace(" ", ""));
    }
}