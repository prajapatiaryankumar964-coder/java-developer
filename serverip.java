import java.net.ServerSocket;
import java.net.Socket;

public class serverip {
    public static void main(String[] args) {

        try {
            ServerSocket server = new ServerSocket(5000);

            System.out.println("Waiting for Client...");

            Socket socket = server.accept();

            System.out.println("Client Connected!");
            System.out.println("Client IP : " + socket.getInetAddress().getHostAddress());

            socket.close();
            server.close();

        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
    }
}