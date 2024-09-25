import java.net.*;
import java.io.*;
import java.util.*;

public class Forwarder126 {
  private static ServerSocket SS;
  private static int port_fwd;
  private Hashtable ht = new Hashtable();
  Socket socket;

  public Forwarder126() {
     try {
          SS = new ServerSocket(port_fwd);
          System.out.println("Forwarder is created and waiting  to connect...");
	
          while (true) {
              socket = SS.accept();
              System.out.println("Client IP = " +
                                socket.getInetAddress().getHostAddress());
				
              DataOutputStream outstream = new 
                                DataOutputStream(socket.getOutputStream());
              ht.put(socket, outstream);
              Thread thread = new Thread(new ForwarderRunnable(socket, ht));
              thread.start();
           }
      }
      catch (IOException e) {
           System.out.println(e.getMessage());
      }
   }

  public static void main(String[] args) {
      if (args.length < 1) {
         System.out.println("Usage: java Forwarder126 [port_fwd]");
         System.exit(1);
      }

      port_fwd=Integer.parseInt(args[0]) ;
      Forwarder126 ForwarderStart=new Forwarder126();
  }
}

class ForwarderRunnable implements Runnable {
  private Socket socket;
  private Hashtable ht;

  public ForwarderRunnable(Socket socket, Hashtable ht) {
     this.socket = socket;
     this.ht = ht;
  }

  public void run() {
     DataInputStream instream;

     try {
          instream = new DataInputStream(socket.getInputStream());
			
          while (true) {
              int message = instream.readInt();

              synchronized(ht) {
                   Enumeration en = ht.elements();
                   while(en.hasMoreElements()) {
                      DataOutputStream outstream = (DataOutputStream)en.nextElement();
			
                      try {
                           outstream.writeInt(message);
                       } 
                      catch (IOException e) {
                           System.out.println(e.getMessage());
                      }
                   }
              }
         }
     } 
     catch (IOException e) {
          System.out.println(e.getMessage());  
     }
     finally {
           synchronized(ht) {
                 System.out.println("Remove connection: " + socket);
                 ht.remove(socket);
                 try {
                      socket.close();
                 } 
                 catch (IOException e) {
                 }
            }
      }
  }
}