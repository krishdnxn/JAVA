class Thread1 extends Thread{
    public void run(){
        while (true){
            System.out.println("I am a Thread ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Thread2 extends Thread{
    public void run(){
        while (true){
            System.out.println("I am a Thread but I am not Happy");
            try {
                Thread.sleep(1100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class cwh_75_thread_methods {
    public static void main(String[] args) throws InterruptedException {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
        }
    }

