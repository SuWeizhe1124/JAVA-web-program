
import java.io.*;

class Ex85 {
   public static void main(String args[])throws Exception {
      if (args.length < 1) {
         System.out.println("Usage: java Ex85 [fileName]");
         System.exit(1);
      }
	  
      String fileName = args[0];
      FileOutputStream fos=new FileOutputStream(fileName);

      String line = "English Message ¤¤¤å°T®§";

      fos.write(line.getBytes());
      fos.close();
   }
}   