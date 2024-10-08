import java.io.*;
import java.net.*;

public class Client109 {
  int i;
  static String iaddr;
  static int port;
  
  public Client109() {
     try{
         Socket socket=new Socket(InetAddress.getByName(iaddr),port);
         DataOutputStream outstream = new DataOutputStream(socket.getOutputStream());
 
         InputStreamReader isr = new InputStreamReader(System.in);
         BufferedReader br = new BufferedReader(isr);
         System.out.println("Input data on keyboard...");

         while(true) {
             i = br.read();
             outstream.writeInt(i);
         }
      }

      catch(IOException e){
        System.out.println(e.getMessage());
      }
  }

  public static void main(String args[]) {
      if (args.length < 2){
         System.out.println("USAGE: java Client109 [iaddr] [port]");
         System.exit(1);
      }

      iaddr = args[0];
      port=Integer.parseInt(args[1]);
      Client109 ClientStart=new Client109();
  }
}
