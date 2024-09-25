class myNumber {
      private int number;

      myNumber (int number) {this.number = number;}
      public int getNumber() { return number; }
}

class E extends myNumber {
      E() {
           System.out.println("This is Constructor");
           super(5);
      }
}

class Ex35_1 {
      public static void main(String[] args) {
             E a = new E();

             System.out.println("number= "+a.getNumber());
      }
}
