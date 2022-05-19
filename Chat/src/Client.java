import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        final Socket clientSocket; // used to send and receive data from server
        final BufferedReader in; // reads data from socket
        final PrintWriter out; // writes data into socket
        final Scanner scanner = new Scanner(System.in); // reads input from keyboard

        try {
            clientSocket = new Socket("127.0.0.1", 7000);
            out = new PrintWriter(clientSocket.getOutputStream());
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            Thread sender = new Thread(new Runnable() {
                String message;
                @Override
                public void run() {
                    while(true) {
                        message = scanner.nextLine();
                        out.println(message);
                        out.flush();
                    }
                }
            });
            sender.start();

            Thread receiver = new Thread(new Runnable() {
                String message;
                @Override
                public void run() {
                    try {
                        message = in.readLine();
                        while(message!=null) {
                            System.out.println("Server : " + message);
                            message = in.readLine();
                        }
                        System.out.println("Server out of service");
                        out.close();
                        clientSocket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
            receiver.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
