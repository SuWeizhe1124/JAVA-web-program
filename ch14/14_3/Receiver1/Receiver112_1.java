import java.net.*;
import java.io.*;

public class Receiver112_1 {
  int messagein;
  static int port_Rcv1;
  static String rcv1File;

  public Receiver112_1() {
     try{
         ServerSocket SS = new ServerSocket(port_Rcv1);
         System.out.println("Receiver1 is created and waiting Forwarder to connect...");

         Socket socket = SS.accept();
         System.out.println("Client IP = " +
                             socket.getInetAddress().getHostAddress());

         DataInputStream instream = new DataInputStream(socket.getInputStream());
         FileOutputStream fos = new FileOutputStream(rcv1File);

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
            System.out.println("Usage: java Receiver112_1 [port_Rcv1] [rcv1File]");
            System.exit(1);
         }
         port_Rcv1=Integer.parseInt(args[0]);
         rcv1File = args[1];
         Receiver112_1 ReceiverStart=new Receiver112_1();
  }
}
