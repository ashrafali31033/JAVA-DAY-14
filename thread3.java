public class thread3 {
    public static void main(String[] args) {
        System.out.println("hello world");

        try{
            Thread.sleep(10000);

        }catch(InterruptedException e)
        {
            System.out.println("iterrupted");
        }
        System.out.println("thread resumed");
    }    
}
