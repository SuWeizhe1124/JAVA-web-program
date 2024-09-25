import java.io.*;

class Ex88 {
   public static void main(String args[])throws Exception {
      if (args.length < 1) {
         System.out.println("Usage: java Ex88 [fileName]");
         System.exit(1);
      }
	  
      String fileName = args[0];
      FileOutputStream fos=new FileOutputStream(fileName);
      DataOutputStream dos = new DataOutputStream(fos);

      String line= "English Message  ¤¤¤å°T®§";
      dos.write(line.getBytes());
      dos.close();
   }
}