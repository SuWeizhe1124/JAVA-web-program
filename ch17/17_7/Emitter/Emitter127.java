import java.io.*;
import java.net.*;

public class Emitter127 {
  int i;
  static String iaddr_fwd;
  static int port_fwd;
  DataOutputStream  outstream;
  
  public Emitter127() {
     try{
         Socket socket=new Socket(InetAddress.getByName(iaddr_fwd),port_fwd);
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
         System.out.println("USAGE: java Emitter127 [iaddr_fwd] [port_fwd]");
         System.exit(1);
      }

      iaddr_fwd = args[0];
      port_fwd=Integer.parseInt(args[1]);
      Emitter127 EmitterStart=new Emitter127();
  }
}
