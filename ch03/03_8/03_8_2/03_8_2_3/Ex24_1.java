class Mynumber {
     private int n;

     public Mynumber(int i){this.n= i;}
     public Mynumber(int j, String s){
          System.out.println("Here is a Overload Constructor");
          this(j);
     }

     public int getnumber(){return n;} 
}

class Ex24_1 {
     public static void main(String[] args) {
         Mynumber M = new Mynumber(10, "abcde");
         System.out.println("M.getnumber : " + M.getnumber());	
     }
}
