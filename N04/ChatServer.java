import java.io.IOError;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChatServer {
    private static List<ClientHandler> userList = Collections.synchronizedList(new ArrayList<>());

    public static void main(String[] args) {
        int port = 8675;
        if (args.length > 0) {
            try {
                port = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.err.println("Invalid port number, please try again");
            }
        }

        //create server socket
        try (ServerSocket serverSocket = new ServerSocket(port);) {
            System.out.println("Current server port: " + port);
            while (true) {
                try {
                    Socket clientSocket = serverSocket.accept();
                    System.out.println("Client connected: " + clientSocket.getInetAddress().getHostAddress());

                    //client handler
                    ClientHandler clientHandler = new ClientHandler(clientSocket);
                    userList.add(clientHandler);
                    new Thread(clientHandler).start();
                } catch (IOException e) {
                    System.err.println("Failed to accept client connection request");
                }
            }
        } catch (IOException e) {
            System.err.println("Failed to listen to port");
        }
    }
        //method to broadcast
        public static void broadcast(String message, ClientHandler sender) {
            synchronized (userList) {
                for (ClientHandler user : userList) {
                    if (user != sender) {
                        user.sendMessage(message);
                    }
                }
            }
        }

        //method to end user connection
        public static void endUserConnection(ClientHandler clientHandler) {
            userList.remove(clientHandler);
        }
}