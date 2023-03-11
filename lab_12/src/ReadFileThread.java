import java.util.*;
import java.io.*;

class ReadFileThread extends Thread {
    private int[] AI; // массив, который нужно прочитать из файла
    private String filename; // имя файла
    private Thread thr; // ссылка на текущий поток

    // Конструктор
    public ReadFileThread(String filename, String threadName) {
        // Запомнить имя файла
        this.filename = filename;

        // Создать поток с именем threadName
        thr = new Thread(this, threadName);
    }


    Scanner scanner = new Scanner(System.in);

    public void Start(){
        thr.start();
    }

    public void run(){
        System.out.println("Begin Thread: " + thr.getName());
        FileInputStream fis;
        try{
            fis = new FileInputStream(filename);
            int count = scanner.nextInt();
            AI = new int[count];
            for (int i = 0; i < AI.length; i++) {
                AI[i] = scanner.nextInt();
            }
            scanner.close();
            fis.close();
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("End thread: " + thr.getName());
    }
    public int[] getArray() { return AI; }
}