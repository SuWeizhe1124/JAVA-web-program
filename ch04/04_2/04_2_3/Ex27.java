class MyNumber {
      private static int number=5;
      public void setNumber(int i) { number = i; }
      public int getNumber() { return number; }
}

class E1 extends MyNumber {} 
class E2 extends MyNumber {}
class S  extends E2 {} 

class Ex27 {
      public static void main(String[] args) {
             E1 a1 = new E1();
             E2 a2 = new E2();
             S  s = new S();
             s.setNumber(20);
		
             System.out.println("The number of a1 is: "+a1.getNumber());
             System.out.println("The number of a2 is: "+a2.getNumber());
             System.out.println("The number of s is: "+s.getNumber());
       }
}
