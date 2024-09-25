import java.net.*;
import java.io.*;

public class Ex52 {
  ServerSocket  SS; 

  public Ex52() {
         SS = new ServerSocket(1234);
         System.out.println("Server created");
  }

  public static void main(String args[]){
         Ex52 ServerStart=new Ex52();
  }
}
