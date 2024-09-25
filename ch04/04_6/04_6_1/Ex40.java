abstract class myNumber {
         private int number = 5;
         public int getNumber() { return number; }
}

class Ex40 {
      public static void main(String[] args) {
             myNumber a = new myNumber();
             System.out.println(a.getNumber());
      }
}
