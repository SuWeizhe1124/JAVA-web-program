import java.net.*;
import java.io.*;
import java.util.*;

public class Server101 {
  static int  port;

  public Server101() {
     try{
         ServerSocket SS = new ServerSocket(port);
         System.out.println("Server is created and waiting Client to connect...");
			
         while(true){
            Socket socket = SS.accept();
            Date currentDate = new Date();
            System.out.println("Client IP = " +
                                socket.getInetAddress().getHostAddress());
            System.out.println("Client port = " + socket.getPort());
            System.out.println("Connect date = " + currentDate);
            System.out.println("waiting...");
          }
      }
      catch(IOException e){
           System.out.println(e.getMessage());
      }	
  }

  public static void main(String args[]){
       if(args.length < 1){
            System.out.println("Usage: java Server101 [port]");
            System.exit(1);
       }
       port=Integer.parseInt(args[0]);
       Server101 ServerStart=new Server101();
  }
}
