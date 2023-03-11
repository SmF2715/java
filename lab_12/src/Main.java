public class Main {
    public static void main(String[] args) {
        System.out.println("Лабораторная работа №12 \nВариант №4 \n");
        /*System.out.println("Main Thread started");
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
        System.out.println("Main thread finished...");*/

        /*
        System.out.println("Main thread started");
        System.out.println("Main thread finished");
*/
        /*Jthread j = new Jthread("Jthread");
        j.start();
        try{
            Thread.sleep(150);
            j.interrupt();
            Thread.sleep(159);
        }
        catch (InterruptedException e) {
            System.out.println("Thread has been interrupted");
        }*/

        /*MyThread myThread = new MyThread();
        Thread t = new Thread(myThread, "T thread");
        t.start();
        try{
            Thread.sleep(150);
            t.interrupt();
            Thread.sleep(150);
        }
        catch (InterruptedException e){
            System.out.println("Thread was interrupted\n");
        }*/
        /*

        CommonResource commonResource = new CommonResource();
        for(int i = 1; i < 6; i++){
            Thread t = new Thread(new CountThread(commonResource));
            t.setName("Thread " + i);
            t.start();
        }
*/


    }
}