class myRunnable implements Runnable {
  public void run() {
    System.out.println("Message by myRunnable");
  }
}

public class Ex113 {
  public Ex113() {
     myRunnable testR = new myRunnable();
     Thread testTh = new Thread(testR);
     testTh.start();
  }

  public static void main(String[] args) throws Exception {
      Ex113 ServerStart=new Ex113();
  }
}

