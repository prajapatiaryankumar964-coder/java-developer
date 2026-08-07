import java.net.InetAddress;
import java.util.Scanner;

class websiteip
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Website Name: ");
            String website = sc.nextLine();

            InetAddress ip = InetAddress.getByName(website);

            System.out.println("Host Name : " + ip.getHostName());
            System.out.println("IP Address: " + ip.getHostAddress());

        } catch (Exception e) {
            System.out.println("Error : " + e);
        }

        sc.close();
    }
}