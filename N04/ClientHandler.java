import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;    

class ClientHandler implements Runnable {
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;
    private String userName;

    public ClientHandler(Socket socket) {
        this.clientSocket = socket;
    }

    public void sendMessage(String message) {
        out.println(message);
    }

    public void run() {

        // use try with catch statement to create output and input streams.
        try {
            out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            out.println("Enter username:");
            out.flush();
            userName = in.readLine();
            System.out.println(userName + " joined the chat");
            ChatServer.broadcast(userName + " joined the chat", this);

            System.out.println("Connected to client " + clientSocket.getInetAddress().getHostAddress() + " on port "
                    + clientSocket.getPort());
            String inputLine;

            while ((inputLine = in.readLine()) != null) {
                // display info about what was received.
                System.out.printf("Received from client (%s): %s%n", clientSocket.getInetAddress().getHostAddress(),
                        inputLine);
                ChatServer.broadcast(userName + ": " + inputLine, this);
            }
            System.out.println("Client disconnected: " + clientSocket.getInetAddress());
        } catch (IOException e) {
            System.err.println("Error handling client: " + e.getMessage());
        } finally {
            ChatServer.endUserConnection(this);
            if (userName != null) {
                ChatServer.broadcast(userName + " left the chat", this);
            }
        }
    }
}