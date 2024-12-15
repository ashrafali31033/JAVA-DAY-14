//creating thread using lambda exception
public class thread2
{
    public static void main(String[] args) {
        Runnable r= ()->System.out.println("i am new from java version");
        Thread t=new Thread(r);
        t.start();
        System.out.println(t.isAlive());

    }
}