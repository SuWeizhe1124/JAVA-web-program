class Client1 implements Runnable {
  public void run() {
    System.out.println("Message by Client1");
  }
}

class Client2 implements Runnable {
  public void run() {
    System.out.println("Message by Client2");
  }
}

class Client3 implements Runnable {
  public void run() {
    System.out.println("Message by Client3");
  }
}

public class Ex114 {
  public Ex114() {
     Client1 client1 = new Client1();
     Thread thread1 = new Thread(client1);
     thread1.start();

     Client2 client2 = new Client2();
     Thread thread2 = new Thread(client2);
     thread2.start();

     Client3 client3 = new Client3();
     Thread thread3 = new Thread(client3);
     thread3.start();

     Thread threadEx114 = new Thread();
     int act = threadEx114.activeCount();
     System.out.println("threadEx114.activeCount() = " + act);

     Thread curr = threadEx114.currentThread();
     System.out.println("threadEx114.currentThread() = " + curr.getName());

  }

  public static void main(String[] args) throws Exception {
      Ex114 ServerStart=new Ex114();
  }
}

