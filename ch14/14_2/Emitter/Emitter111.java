import java.io.*;
import java.net.*;

public class Emitter111 {
  int i;
  static String iaddr_Fwd;
  static int port_Fwd;
  static String readFile;
  
  public Emitter111() {
     try{
         Socket socket=new Socket(InetAddress.getByName(iaddr_Fwd),port_Fwd);
         DataOutputStream outstream = new DataOutputStream(socket.getOutputStream());
 
         FileInputStream fis = new FileInputStream(readFile);
         while((i=fis.read()) !=-1)
              outstream.writeInt(i);
         outstream.writeInt(i);

         System.out.println("Data sent to internet successfully!");
         socket.close(); 
      }

      catch(IOException e){
         System.out.println(e.getMessage()); 
      }
  }

  public static void main(String args[]) {
      if (args.length < 3){
         System.out.println("USAGE: java Emitter111 [iaddr_Fwd] [port_Fwd] [readFile]");	
         System.exit(1);
      }

      iaddr_Fwd = args[0];
      port_Fwd=Integer.parseInt(args[1]);
      readFile = args[2];
      Emitter111 EmitterStart=new Emitter111();
  }
}
