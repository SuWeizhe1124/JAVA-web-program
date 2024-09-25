import java.net.*;
import java.io.*;

public class Forwarder111 {
  int messagein;
  static String iaddr_Rcv;
  static int port_Fwd, port_Rcv;
  static String fwdFile;

  public Forwarder111() {
     try{
         ServerSocket SS = new ServerSocket(port_Fwd);
         System.out.println("Forwarder is created and waiting Emitter to connect...");

         Socket socket = SS.accept();
         System.out.println("Emitter IP = " +
                             socket.getInetAddress().getHostAddress());
         DataInputStream instream = new DataInputStream(socket.getInputStream());
         FileOutputStream fos = new FileOutputStream(fwdFile);

         Socket socket_Rcv=new Socket(InetAddress.getByName(iaddr_Rcv),port_Rcv);
         DataOutputStream outstream_Rcv = new DataOutputStream(socket_Rcv.getOutputStream());

         while(messagein != -1){
              messagein = instream.readInt(); 
              outstream_Rcv.writeInt(messagein);    
              fos.write(messagein);
          }
         System.out.println("Data written to fwdFile and send to Receiver successfully!");
      }
      catch(IOException e){
          System.out.println(e.getMessage());
      }		
  }

  public static void main(String args[]){
         if(args.length < 4){
            System.out.println("Usage: java Forwarder111 [port_Fwd] [fwdFile] [iaddr_Rcv] [port_Rcv]");
            System.exit(1);
         }
         port_Fwd=Integer.parseInt(args[0]);
         fwdFile = args[1];
         iaddr_Rcv= args[2];
         port_Rcv= Integer.parseInt(args[3]);
         Forwarder111 ForwardStart=new Forwarder111();
  }
}
