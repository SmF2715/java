import java.util.Scanner;

public class Jthread extends Thread {

    private int time;
    Scanner scanner = new Scanner(System.in);
    public Jthread(String name){
        super(name);
    }
    public void run(){

        System.out.printf("%s started... \n", Thread.currentThread().getName());
        try{
            /*for (int i = 1; i <= time; i++){
                sleep(1000);
                System.out.printf("%d seconds past\n", i );
            }*/
            Thread.sleep(2000);
        }
        catch(InterruptedException e){
            System.out.println("Thread has been interrupted");
        }
       // System.out.printf("%s finished... \n", Thread.currentThread().getName());
    }
}
