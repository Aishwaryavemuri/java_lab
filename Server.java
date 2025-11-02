import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(5000); // server listens on port 5000
            System.out.println("Server started. Waiting for client...");
            Socket s = ss.accept(); // accept client connection
            System.out.println("Client connected.");

            // Reading data from client
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String message = br.readLine();
            System.out.println("Client says: " + message);

            // Sending response to client
            PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
            pw.println("Hello Client, message received!");

            ss.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}