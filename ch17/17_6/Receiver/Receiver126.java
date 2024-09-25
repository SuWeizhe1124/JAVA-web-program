import java.io.*;
import java.net.*;

public class Receiver126 {
  int messagein;
  static String iaddr;
  static int port_fwd;
  
  public Receiver126() {
     try{
         Socket socket=new Socket(InetAddress.getByName(iaddr),port_fwd);
         DataInputStream instream = new DataInputStream(socket.getInputStream());
 
         while(true) {
             messagein = instream.readInt();
             System.out.print((char)messagein);
         }
      }

      catch(IOException e){
         System.out.println(e.getMessage());
      }
  }

  public static void main(String args[]) {
      if (args.length < 2){
         System.out.println("USAGE: java Receiver126 [iaddr] [port_fwd]");
         System.exit(1);
      }

      iaddr = args[0];
      port_fwd=Integer.parseInt(args[1]);
      Receiver126 ReceiverStart=new Receiver126();
  }
}
