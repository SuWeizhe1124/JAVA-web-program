class Mynumber {
     private int n;

     public Mynumber(int i){this.n= i;}
     public int getnumber(){return n;} 
}

class Ex22 {
     public static void main(String[] args) {
         Mynumber M = new Mynumber(10);
         System.out.println("M.getnumber : " + M.getnumber());	
     }
}
