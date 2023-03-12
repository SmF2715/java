public class
TrainThreads2 {
    public static void main(String[] args){
        int[] AI = {2,3,4,81, 8,-1};
        ThreadMinMax t1 = new ThreadMinMax(AI);
        ThreadMinMax t2 = new ThreadMinMax(AI);

        System.out.println("Main Thread started\n");
        try{
            t1.getThread().join();
            t2.getThread().join();
        }
        catch (InterruptedException e){
            System.out.println("Error");
        }

        System.out.println("max = " + t1.getMaximum());
        System.out.println("min = " + t1.getMinimum());
    }
}
