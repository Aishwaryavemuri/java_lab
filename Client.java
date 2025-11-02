import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 5000); // connect to server at port 5000
            PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
            pw.println("Hello Server!"); // send message to server

            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String response = br.readLine();
            System.out.println("Server says: " + response);

            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
