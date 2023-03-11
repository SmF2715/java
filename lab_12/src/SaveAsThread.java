import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class SaveAsThread implements java.lang.Runnable {
    private int[] AI;
    private String filename;
    private String threadName;
    private Thread t;

    public SaveAsThread(int[] AI, String filename, String threadName){
        this.AI = AI;
        this.filename = filename;
        this.threadName = threadName;

        t = new Thread(this, "SaveThread");
    }

    public void start(){
        t.start();
    }

    @Override
    public void run() {
        System.out.println("Begin Thread: " + threadName);
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(filename);
            PrintStream printStream = new PrintStream(fileOutputStream);

            printStream.println(AI.length);
            for(int i = 0; i < AI.length; i++){
                printStream.println(AI[i]);
            }
            printStream.close();
            fileOutputStream.close();
        }
        catch (IOException e){
            System.out.println("Error " + e.getMessage());
        }
        System.out.println("End Thread: " + threadName);
    }
}
