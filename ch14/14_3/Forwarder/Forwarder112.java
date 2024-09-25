import java.net.*;
import java.io.*;

public class Forwarder112 {
  int messagein;
  static String iaddr_Rcv1, iaddr_Rcv2;
  static int port_Fwd, port_Rcv1, port_Rcv2;
  static String fwdFile;

  public Forwarder112() {
     try{
         ServerSocket SS = new ServerSocket(port_Fwd);
         System.out.println("Forwarder is created and waiting Emitter to connect...");

         Socket socket = SS.accept();
         System.out.println("Emitter IP = " +
                             socket.getInetAddress().getHostAddress());
         DataInputStream instream = new DataInputStream(socket.getInputStream());
         FileOutputStream fos = new FileOutputStream(fwdFile);

         Socket socket_Rcv1=new Socket(InetAddress.getByName(iaddr_Rcv1),port_Rcv1);
         DataOutputStream outstream_Rcv1 = new DataOutputStream(socket_Rcv1.getOutputStream());

         Socket socket_Rcv2=new Socket(InetAddress.getByName(iaddr_Rcv2),port_Rcv2);
         DataOutputStream outstream_Rcv2 = new DataOutputStream(socket_Rcv2.getOutputStream());

         while(messagein != -1){
              messagein = instream.readInt(); 
              outstream_Rcv1.writeInt(messagein);   
              outstream_Rcv2.writeInt(messagein);   
              fos.write(messagein);
          }
         System.out.println("Data written to fwdFile and send to Receivers successfully!");
      }
      catch(IOException e){
          System.out.println(e.getMessage());
      }		
  }

  public static void main(String args[]){
         if(args.length < 6){
            System.out.println("Usage: java Forwarder112 [port_Fwd] [fwdFile] [iaddr_Rcv1] [port_Rcv1] [iaddr_Rcv2] [port_Rcv2]");
            System.exit(1);
         }
         port_Fwd=Integer.parseInt(args[0]);
         fwdFile = args[1];
         iaddr_Rcv1= args[2];
         port_Rcv1= Integer.parseInt(args[3]);
         iaddr_Rcv2= args[4];
         port_Rcv2= Integer.parseInt(args[5]);
         Forwarder112 ForwardStart=new Forwarder112();
  }
}
