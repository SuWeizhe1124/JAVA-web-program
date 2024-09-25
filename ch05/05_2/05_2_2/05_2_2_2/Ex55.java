
class Ex55 {
   public static void main (String args[])
       {
        int x;
        try
          {
           x = 10 / 0; 
           System.out.println("x= "+ x);
          }
        catch (ArithmeticException e) 
          {
           System.out.println("In ArithmeticException:"+e.getMessage());
          }
       }
}