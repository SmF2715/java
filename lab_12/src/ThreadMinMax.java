public class ThreadMinMax implements java.lang.Runnable {

    private Thread thread;
    private int[] AI;
    private int maxInt;
    private int minInt;

    public ThreadMinMax(int[]AI){
        this.AI = AI;
        thread = new Thread(this, "Thread1.");
        thread.start();
    }

    @Override
    public void run() {
        int max = AI[0];
        int min = AI[0];


    }
}
