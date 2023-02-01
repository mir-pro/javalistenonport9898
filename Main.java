import java.io.*;
import java.net.*;

public class Main {
  public static void main(String[] args) throws IOException {
    ServerSocket serverSocket = new ServerSocket(9898);
    System.out.println("In attesa di connessioni sulla porta 9898");
    while (true) {
      Socket clientSocket = serverSocket.accept();
      PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
      out.println("ciaone");
      clientSocket.close();
    }
  }
}