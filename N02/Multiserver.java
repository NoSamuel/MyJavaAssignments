import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Multiserver {
    public static void main(String[] args) {
        //parse input arguments for port
        int port = 8675;
        if (args.length > 0) {
            try {
                port = Integer.parseInt(args[0]);

            } catch (NumberFormatException e) {
                System.err.println("Couldn't understand port. Using default port instead");
            }
        }

        System.out.printf("port: %d%n", port);

        //use a try catch statement to creat sockets
        try (ServerSocket ServerSocket = new ServerSocket(port);
                Socket clientsocket = ServerSocket.accept();
                PrintWriter out = new PrintWriter(clientsocket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(clientsocket.getInputStream()));) {
            //echo things from the client
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println("Message received: " + inputLine);
                out.println(inputLine);
            }

            System.out.println("Program execution complete.");
        } catch (IOException e) {
            System.err.println("Error occurred: " + e.getMessage());
        }

        //use try with resources to create server socket.
        try (ServerSocket serverSocket = new ServerSocket(port);) {
        System.out.println("Multi echo server listening on port " + port);
        while (true) {
        try {
            Socket clientSocket = serverSocket.accept(); // Accept incoming client connection
            System.out.println("Client connected: " + clientSocket.getInetAddress().getHostAddress());
            // Create a new thread to handle the client
            ClientHandler clientHandler = new ClientHandler(clientSocket);
            new Thread(clientHandler).start();
        } catch (IOException e) {
            System.err.println("Error accepting client connection: " + e.getMessage());
        }
    }
} catch (IOException e) {
    System.out.println("Exception caught when trying to listen on port "
            + port + " or listening for a connection");
    System.out.println(e.getMessage());
}

    }
    
}
    
class ClientHandler implements Runnable {
    private Socket clientSocket;
    public ClientHandler(Socket socket) {
        this.clientSocket = socket;
    }
    @Override
    public void run() {
        // use try with catch statement to create output and input streams.
        try (PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));) {
            System.out.println("Connected to client " + clientSocket.getInetAddress().getHostAddress()
                    + " on port " + clientSocket.getPort());
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                // display info about what was received.
                System.out.printf("Received from client (%s): %s%n",
                        clientSocket.getInetAddress().getHostAddress(), inputLine);
                // echo line back to client.
                out.println(inputLine);
            }
            System.out.println("Client disconnected: " + clientSocket.getInetAddress());
        } catch (IOException e) {
            System.err.println("Error handling client: " + e.getMessage());
        }
    }
}
