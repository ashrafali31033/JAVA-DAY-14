class a extends Thread {
 
    public void r() {
        System.out.println("Thread is running");
    }
}

public class Main
    {
    public static void main(String[] args) {
        a t = new a();
        t.r(); 
        t.start();
    }
}
