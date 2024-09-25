import java.net.*;
import java.io.*;

public class Server98 {
  public Server98() {
     try{
         ServerSocket SS = new ServerSocket(1234);
         System.out.println("Server is created and waiting Client to connect...");
			
         Socket socket = SS.accept();
         System.out.println("connected from Client " + socket.getInetAddress());

         socket.close();
      }
      catch(IOException e){
         System.out.println(e.getMessage());
      }		
  }

  public static void main(String args[]){
         Server98 ServerStart=new Server98();
  }
}
