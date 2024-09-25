import java.net.*;
import java.io.*;

public class Receiver112_2 {
  int messagein;
  static int port_Rcv2;
  static String rcv2File;

  public Receiver112_2() {
     try{
         ServerSocket SS = new ServerSocket(port_Rcv2);
         System.out.println("Receiver2 is created and waiting Forwarder to connect...");

         Socket socket = SS.accept();
         System.out.println("Client IP = " +
                             socket.getInetAddress().getHostAddress());

         DataInputStream instream = new DataInputStream(socket.getInputStream());
         FileOutputStream fos = new FileOutputStream(rcv2File);

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
            System.out.println("Usage: java Receiver112_2 [port_Rcv2] [rcv2File]");
            System.exit(1);
         }
         port_Rcv2=Integer.parseInt(args[0]);
         rcv2File = args[1];
         Receiver112_2 ReceiverStart=new Receiver112_2();
  }
}
