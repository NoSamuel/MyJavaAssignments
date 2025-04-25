import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class ChatClient {
    public static void main(String[] args) {
        
        String hostIP = "127.0.0.1";
        int port = 8675;
        try(
            Socket echoSocket = new Socket(hostIP, port);
            PrintWriter out = new PrintWriter(echoSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
            BufferedReader in_ = new BufferedReader(new InputStreamReader(System.in));
        ) {
            System.out.println("Successfully connected to chat server. IP: " + hostIP + " on port " + port);

            //take in user info
            System.out.println("Enter your username: ");
            String userName = in_.readLine();
            out.println(userName);
            Thread inThread = new Thread(() -> {
                try {
                    String serverMessage;
                    while (((serverMessage = in.readLine()) != null)) {
                        System.out.println(serverMessage);
                    }
                } catch (Exception e) {
                    System.err.println("Connection closed");
                }
            });
            inThread.start();
            String input;
            while ((input = in_.readLine()) != null) {
                out.println(input);
            }
        } catch (UnknownHostException e) {
            System.err.println("Invalid host name");
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Failed to connect to " + hostIP);
            System.exit(1);
        }
    }
}