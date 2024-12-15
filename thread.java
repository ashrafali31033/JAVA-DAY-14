class a implements Runnable {
 
    public void run() {
        System.out.println("helo i am thread ");
    }
}

public class thread
    {
    public static void main(String[] args) {
        a r=new a();
        Thread s=new Thread(r);
        s.start();
        s.start();
        s.run();
    }
}