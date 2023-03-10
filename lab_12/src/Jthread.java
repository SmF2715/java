public class Jthread extends Thread {

    public Jthread(String name){
        super(name);
    }

    public void run(){
        System.out.printf("%s started... \n", Thread.currentThread().getName());
        int counter=1; // счетчик циклов
        while(!isInterrupted()){
            System.out.println("Loop " + counter++);
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e){
                System.out.println(getName() + " has been interrupted");
                break;
            }
        }
        System.out.printf("%s finished... \n", Thread.currentThread().getName());
    }
}
