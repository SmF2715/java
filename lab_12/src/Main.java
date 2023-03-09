public class Main {
    public static void main(String[] args) {
        System.out.println("Лабораторная работа №12 \nВариант №4 \n");
        System.out.println("Main Thread started");
        MyThread test = new MyThread();
        new Thread( test,"MyThread").start();
        try{
            Thread.sleep(1100);

            test.disable();

            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println("Thread has been interrupted");
        }
        System.out.println("Main thread finished...");
    }
}