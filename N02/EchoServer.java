import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Serial;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.SocketHandler;
import javax.print.event.PrintEvent;

public class EchoServer {
    public static void main(String[] args) {
        //parse input arguments for port
        int port = 8675;
        if (args.length > 0) {
            try {
                port = Integer.parseInt(args[0]);
                
            }catch (NumberFormatException e){
                System.err.println("Couldn't understand port. Using default port instead");
            }
        }

        System.out.printf("port: %d%n", port);

        //use a try catch statement to creat sockets
        try (ServerSocket ServerSocket = new ServerSocket(port);
            Socket clientsocket = ServerSocket.accept();
            PrintWriter out = new PrintWriter(clientsocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientsocket.getInputStream()));
            ) { 
                //echo things from the client
                String inputLine;
                while ((inputLine = in.readLine()) != null){
                    System.out.println("Message received: " + inputLine);
                    out.println(inputLine);
                }

                System.out.println("Program execution complete.");
            } catch (IOException e ) {
                System.err.println("Error occurred: " + e.getMessage());
            }
        }
    }

