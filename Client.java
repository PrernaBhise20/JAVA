import java.net.*;
import java.io.*;

public class Client {
    public static void main(String A[]) throws UnknownHostException, IOException 
    {
        System.out.println("Client application is running..");
        Socket s = new Socket("localhost", 2100);
        System.out.println("Client is waiting for server to accept the request");
    }
}
