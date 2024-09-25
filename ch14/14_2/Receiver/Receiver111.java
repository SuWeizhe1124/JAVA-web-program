import java.net.*;
import java.io.*;

public class Receiver111 {
  int messagein;
  static int port_Rcv;
  static String rcvFile;

  public Receiver111() {
     try{
         ServerSocket SS = new ServerSocket(port_Rcv);
         System.out.println("Receiver is created and waiting Forwarder to connect...");

         Socket socket = SS.accept();
         System.out.println("Client IP = " +
                             socket.getInetAddress().getHostAddress());

         DataInputStream instream = new DataInputStream(socket.getInputStream());
         FileOutputStream fos = new FileOutputStream(rcvFile);

         while(messagein != -1){
              messagein = instream.readInt();     
              fos.write(messagein);
          }
         System.out.println("Data written to File successfully!");
      }
      catch(IOException e){
          System.out.println(e.getMessage());
      }		
  }

  public static void main(String args[]){
         if(args.length < 2){
            System.out.println("Usage: java Receiver111 [port_Rcv] [rcvFile]");
            System.exit(1);
         }
         port_Rcv=Integer.parseInt(args[0]);
         rcvFile = args[1];
         Receiver111 ReceiverStart=new Receiver111();
  }
}
