import java.io.*;
import java.net.*;

public class Client98 { 
  public Client98() {
     try{
         Socket socket = new Socket("163.15.40.242", 1234);
         socket.close();
      }
      catch(IOException e){
         System.out.println(e.getMessage()); 
      }
  }

  public static void main(String args[]) {
      Client98 ClientStart=new Client98();
  }
}
