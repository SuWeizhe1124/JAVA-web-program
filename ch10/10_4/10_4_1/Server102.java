import java.net.*;
import java.io.*;

public class Server102 {
  static int  port;

  public Server102() {
     try{
         ServerSocket SS = new ServerSocket(port);
         System.out.println("Server is created and waiting Client to connect...");
			
         Socket socket = SS.accept();
         System.out.println("Client IP = " +
                                  socket.getInetAddress().getHostAddress());

         DataInputStream instream = new DataInputStream(socket.getInputStream());
         String messagein = instream.readUTF();
         System.out.println("messagein = " + messagein);
      }
      catch(IOException e){
         System.out.println(e.getMessage());
      }		
  }

  public static void main(String args[]){
      if(args.length < 1){
         System.out.println("Usage: java Server102 [port]");
         System.exit(1);
      }
      port=Integer.parseInt(args[0]);
      Server102 ServerStart=new Server102();
  }
}
