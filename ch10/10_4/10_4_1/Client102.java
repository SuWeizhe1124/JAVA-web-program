import java.io.*;
import java.net.*;

public class Client102 {
  static String iaddr;
  static int port;
  static String messageout;
  
  public Client102() {
     try{
         Socket socket=new Socket(InetAddress.getByName(iaddr),port);

         DataOutputStream outstream = new DataOutputStream(socket.getOutputStream());
         outstream.writeUTF(messageout);
	 System.out.println("Message is transferred to Server");

         socket.close(); 
      }

      catch(IOException e){
         System.out.println(e.getMessage());
      }
  }

  public static void main(String args[]) {
      if (args.length < 3){
         System.out.println("USAGE: java Client102 [iaddr] [port] [messageout]");
         System.exit(1);
      }

      iaddr = args[0];
      port=Integer.parseInt(args[1]);
      messageout = args[2];
      Client102 ClientStart=new Client102();
  }
}
