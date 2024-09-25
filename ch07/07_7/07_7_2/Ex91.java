import java.io.*;

class Ex91 {
   public static void main(String args[]) throws Exception  {
      if (args.length < 1) {
         System.out.println("Usage: java Ex91 [fileName]");
         System.exit(1);
      }
	  
      String fileName = args[0];
      FileWriter fw=new FileWriter(fileName);

      String line = "English Message ¤¤¤å°T®§";

      fw.write(line);
      fw.flush();
   }
}   