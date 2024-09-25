import java.io.*;
import java.net.*;

public class Emitter128 {
  int i;
  static String iaddr_fwd;
  static int port_fwd;
  static String readFile;
  
  public Emitter128() {
     try{
         Socket socket=new Socket(InetAddress.getByName(iaddr_fwd),port_fwd);
         DataOutputStream outstream = new DataOutputStream(socket.getOutputStream());

         FileReader fr = new FileReader(readFile);
         while((i=fr.read()) !=-1) {
              for(int i= 0; i<= 1000000; i++) System.out.flush();
              outstream.writeInt(i);
         }
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
         System.out.println("USAGE: java Emitter128 [iaddr_fwd] [port_fwd] [readFile]");	
         System.exit(1);
      }

      iaddr_fwd = args[0];
      port_fwd=Integer.parseInt(args[1]);
      readFile = args[2];
      Emitter128 EmitterStart=new Emitter128();
  }
}
