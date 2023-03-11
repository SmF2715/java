import java.util.ArrayList;

public class Threads {

    public static void arrayPrint(int[]AI, String arrName){
        System.out.printf("%s = [ ", arrName);
        for(int d: AI){
            System.out.print(d + ' ');
        }
        System.out.println(" ]");
    }

    public static void main(String[] args){
        /*int[]AI0 = {2,4,3,8,9,11,7};
        int[]AI1 = {1,8,7,6,3};
        int[]AI2 = {7,7,9,9,4,2};

        SaveAsThread T0 = new SaveAsThread(AI0, "AI0.txt", "T0");
        SaveAsThread T1 = new SaveAsThread(AI1, "AI1.txt", "T1");
        SaveAsThread T2 = new SaveAsThread(AI2, "AI2.txt", "T2");

        SaveAsThread[] test = {T0, T1, T2};
        for (int i = 0; i < test.length; i++) {
            test[i].start();
        }*/
        /*
        int[]AI0 = null;
        int[]AI1 = null;
        int[]AI2 = null;

        int[][]AIarrays = {AI0, AI1, AI2};

        ReadFileThread t0 = new ReadFileThread("AI0.txt", "t0");
        ReadFileThread t1 = new ReadFileThread("AI1.txt", "t1");
        ReadFileThread t2 = new ReadFileThread("AI2.txt", "t2");

        ReadFileThread[] test = {t0,t1,t2};
        for (int i = 0; i < test.length; i++) {
            test[i].start();
            try{
                test[i].join();
            }
            catch (InterruptedException e){
                System.out.println("Error: " + e.getMessage());
                return;
            }
        }
        AI0 = t0.getArray();
        AI1 = t1.getArray();
        AI2 = t2.getArray();

        arrayPrint(AI0,"AI0");
        arrayPrint(AI1,"AI1");
        arrayPrint(AI2,"AI2");
        */

    }
}
