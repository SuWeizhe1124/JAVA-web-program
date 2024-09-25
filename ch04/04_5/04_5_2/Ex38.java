class MyNumber {
      int number;
      final void setNumber() { number = 5; }
      public int getNumber() { return number; }
}

class E extends MyNumber {
      public void setNumber() { number = 10; }
} 

class Ex38 {
      public static void main(String[] args) {
             E a = new E();
             a.setNumber();
             System.out.println("The number of a is: "+a.getNumber());
      }
}