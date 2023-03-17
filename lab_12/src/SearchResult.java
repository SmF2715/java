import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class SearchResult extends Thread{
    private String[] AS;
    private String fileName;
    private int index;
    private Thread thr;

    public SearchResult(String fileName, String threadName){
        this.fileName = fileName;
        thr = new Thread(this,threadName);
    }
    public void start(){
        thr.start();
    }

    public void run(){
        System.out.println("Starting thread " + thr.getName());
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input substring, which u need found in files: ");
            String stringForSearch = scanner.nextLine();
            byte[] encoded = Files.readAllBytes(Paths.get(fileName));
            String boul = new String(encoded, StandardCharsets.UTF_8);
            index = 0;
            AS = boul.split(" ");
            for (int i = 0; i < AS.length; i++) {
                System.out.println(AS[i] + " ");
                if (AS[i].matches(stringForSearch)){
                    index++;
                }
            }
            System.out.println("\n");
            Thread newthread = new Thread();
            run(newthread);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("End of thread " + thr.getName());
    }
    public String[] get() { return AS; }
    // Метод доступа к потоку t
    public Thread getThread() { return thr; }
    public void run(Thread name) {
        System.out.println("Запущен поток для вывода результата => " + name.getName());
        System.out.printf("\nКол-во совпадений в файле %s = %d\n", fileName, index);
        System.out.println("Завершен поток для вывода результата: " + name.getName());
    }
}
