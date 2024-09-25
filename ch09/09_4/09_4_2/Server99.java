import java.net.*;
import java.io.*;

public class Server99 {
  public Server99() {
     try{
         ServerSocket SS = new ServerSocket(1234);
         System.out.println("Server is created and waiting Client to connect...");
			
         Socket socket = SS.accept();
         System.out.println("connected from Client " + socket.getInetAddress());
         System.out.println("Server Local Port = " + socket.getLocalPort());
         System.out.println("Client Port = " + socket.getPort());
         socket.close();
      }
      catch(IOException e){
         System.out.println(e.getMessage());
      }		
  }

  public static void main(String args[]){
         Server99 ServerStart=new Server99();
  }
}
