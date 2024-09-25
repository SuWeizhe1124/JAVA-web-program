import java.io.*;
import java.net.*;

public class Client101 {
  static String iaddr;
  static int port;
  
  public Client101() {
     try{
         Socket socket=new Socket(InetAddress.getByName(iaddr),port);
         System.out.println("To connect Server");
         socket.close();
      }
      catch(IOException e){
         System.out.println(e.getMessage());
      } 
  }

  public static void main(String args[]) {
      if (args.length < 2){
         System.out.println("USAGE: java Client101 [iaddr] [port]");
         System.exit(1);
      }
      iaddr = args[0];
      port = Integer.parseInt(args[1]);
      Client101 ClientStart=new Client101();
  }
}
