import java.util.*;

class Ex122 {
   public static void main(String[] args) {
      Hashtable ht = new Hashtable();
      ht.put("Server", new String("163.15.40.242"));
      ht.put("Client1", new String("163.15.40.243"));
      ht.put("Client2", new String("163.15.40.244"));

      System.out.println("ht.put() : " + ht.put("Client1", new String("163.15.40.245")));
      System.out.println("ht.put() : " + ht.put("Client3", new String("163.15.40.245")));

   }
}
