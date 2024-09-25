class Mynumber {
    private int n;
    public void setnumber(int i){this.n= i;}
    public int getnumber(){return n;} 
}

class Ex21 {
    public static void main(String[] args) {
        Mynumber M = new Mynumber();
        M.setnumber(10);
	System.out.println("M.getnumber : "+ M.getnumber());	
	}
}
