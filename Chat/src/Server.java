import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {

        final ServerSocket serverSocket;
        final Socket clientSocket;
        final BufferedReader in;
        final PrintWriter out;
        final Scanner scanner = new Scanner(System.in);

        try {
            serverSocket = new ServerSocket(7000);
            clientSocket = serverSocket.accept();
            out = new PrintWriter(clientSocket.getOutputStream());
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            Thread sender = new Thread(new Runnable() {
                String message; // contains data written by client
                @Override
                public void run() {
                    while(true) {
                        message = scanner.nextLine(); // reads input from keyboard
                        out.println(message); // writes data stored in message in clientSocket
                        out.flush(); // sends data
                    }
                }
            });
            sender.start();

            Thread receive = new Thread(new Runnable() {
                String message;
                @Override
                public void run() {
                    try {
                        message = in.readLine(); // reads data from clientSocket while client is connected
                        while(message!=null) {
                            System.out.println("Client : " + message); //print message sent by client
                            message = in.readLine(); //read date from clientSocket
                        }
                        // if message == null, client is not connected anymore
                        System.out.println("Client disconnected");
                        out.close();
                        clientSocket.close();
                        serverSocket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
            receive.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
