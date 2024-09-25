class Study {
     int credit=0; 
	
     void addcredit(int i) { credit += i; } 
     int  totalcredit() { return credit; } 
}

class Ex09 {	
     public static void main(String[] args) {
           Study joe = new Study();  
           Study george = new Study();
		
           joe.addcredit(12);  
           george.addcredit(9);

           joe.addcredit(6);  
           george.addcredit(3);
		
           System.out.println("joe studied: "+joe.totalcredit()+"credites");
           System.out.println("george studied: "+george.totalcredit()+"credites");  
      }
}
