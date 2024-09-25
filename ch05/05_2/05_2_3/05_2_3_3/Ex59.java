import java.net.*;
import java.io.*;

public class Ex59 {
  ServerSocket  SS; 

  public Ex59() {
     try{
         SS = new ServerSocket(1234);
         System.out.println("Server created.");
      }
     finally {
         System.out.println("In finally");
      }
  }

  public static void main(String args[]){
         Ex59 ServerStart=new Ex59();
  }
}
