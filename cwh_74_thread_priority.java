class Myth1 extends Thread{
    public Myth1(String name){
        super(name);
    }
    public void run(){
        //int i = 1;
        while(true) {
            System.out.println("I am a Thread : " + getName());
            //i++;
        }
    }
}
public class cwh_74_thread_priority {
    public static void main(String[] args) {
        Myth1 t1 = new Myth1("Krish");
        Myth1 t2 = new Myth1("Aayush");
        Myth1 t3 = new Myth1("Abhay");
        Myth1 t4 = new Myth1("Garv (Max Priority)");
        Myth1 t5 = new Myth1("Chotu");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MAX_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
