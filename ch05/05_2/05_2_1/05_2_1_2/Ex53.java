import java.net.*;
import java.io.*;

public class Ex53 {
  ServerSocket  SS; 

  public Ex53() {
     try{
         SS = new ServerSocket(1234);
         System.out.println("Server created.");
      }
      catch(IOException e){
           System.out.println(e.getMessage());
      }		
  }

  public static void main(String args[]){
         Ex53 ServerStart=new Ex53();
  }
}
