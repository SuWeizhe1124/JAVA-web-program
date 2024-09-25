abstract class myNumber {
         public int number = 5 ;
         public abstract int getNumber(); 
}

class E extends myNumber {
      public int getNumber() {return number;}
}

class Ex43 {
      public static void main(String[] args) {
             E a = new E();
             System.out.println("the number of a= "+a.getNumber());
      }
}
