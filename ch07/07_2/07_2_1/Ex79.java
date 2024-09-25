public class Ex79 {
     static String msg;
     
     Ex79() {
        System.out.println(msg);
     }

     public static void main(String[] args) {
        msg = args[0];
        Ex79 a = new Ex79();
     }
}
