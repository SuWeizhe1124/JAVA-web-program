class myNumber {private int number;}

class E extends myNumber {
      public void setNumber(int i) {number = i;}
      public int getNumber() {return number;}
}

class Ex31 {
      public static void main(String[] args) {
             E a = new E();
             a.setNumber(5);
             System.out.println("The number of a is: "+a.getNumber());
      }
}
