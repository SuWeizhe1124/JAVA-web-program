import java.io.*;
import java.net.*;

public class Client107 {
  int i;
  static String iaddr;
  static int port;
  
  public Client107() {
     try{
         Socket socket=new Socket(InetAddress.getByName(iaddr),port);
         DataOutputStream outstream = new DataOutputStream(socket.getOutputStream());
 
         BufferedInputStream bis = new BufferedInputStream(System.in);
         System.out.println("Input data on keyboard...");

         while(true) {
             i = bis.read();
             outstream.writeInt(i);
         }
      }

      catch(IOException e){
         System.out.println(e.getMessage());
      }
  }

  public static void main(String args[]) {
      if (args.length < 2){
         System.out.println("USAGE: java Client107 [iaddr] [port]");
         System.exit(1);
      }

      iaddr= args[0];
      port=Integer.parseInt(args[1]);
      Client107 ClientStart=new Client107();
  }
}
