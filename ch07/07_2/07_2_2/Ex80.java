public class Ex80 {
     static int num;
     
     Ex80() {
        num = num+1;
        System.out.println(num);
     }

     public static void main(String[] args) {
        num = Integer.parseInt(args[0]);
        Ex80 a = new Ex80();
     }
}
