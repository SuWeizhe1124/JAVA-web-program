public class Ex81 {
     static String msg;
     static int num;
     
     Ex81() {
        System.out.println(msg);
        System.out.println(num);
     }

     public static void main(String[] args) {
        if(args.length < 2) {
           System.out.println("Usage: java Ex81 [msg] [num]");
           System.exit(1);
        }
        msg = args[0];
        num = Integer.parseInt(args[1]);
        Ex81 a = new Ex81();
     }
}
