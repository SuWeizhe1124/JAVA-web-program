import java.net.*;
import java.io.*;

public class Receiver127 {
  static String iaddr_fwd;
  static int port_fwd;
  static String rcvFile;
  int messagein;

  public Receiver127() {
     try{
         Socket socket=new Socket(InetAddress.getByName(iaddr_fwd),port_fwd);
         DataInputStream instream = new DataInputStream(socket.getInputStream());
         FileWriter fw = new FileWriter(rcvFile);

         while(messagein != -1){
              messagein = instream.readInt();     
              fw.write(messagein);
          }
         fw.flush();
         System.out.println("Data written to File successfully!");
      }
      catch(IOException e){
         System.out.println(e.getMessage());
      }		
  }

  public static void main(String args[]){
         if(args.length < 3){
            System.out.println("Usage: java Receiver127 [iaddr_fwd] [port_fwd] [rcvFile]");
            System.exit(1);
         }
         iaddr_fwd = args[0];
         port_fwd=Integer.parseInt(args[1]);
         rcvFile = args[2];
         Receiver127 ReceiverStart=new Receiver127();
  }
}
