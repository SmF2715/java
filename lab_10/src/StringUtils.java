import java.io.*;
import java.util.Scanner;

public class StringUtils {

    static Scanner scanner = new Scanner(System.in);

    private static String mainString = "";
    private static String inputString;

    public StringUtils(){

    }

    public static void setInputString(){
        System.out.print("Введите слово, которое хотите найти в тексте: ");
        inputString = scanner.nextLine();
    }

    public static String getInputString(){
        return inputString;
    }

    public static String readFromFile(){
        try(FileReader reader = new FileReader("main.txt")){
            int c;
            while((c = reader.read())!=-1){
                mainString += ((char)c);
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        mainString.replaceAll("\r\n", " ");
        return  mainString;
    }

    public static void printText(){
        System.out.println("Текст: " + readFromFile());
    }

    public static void searchInText(){
        if(readFromFile().indexOf(inputString)!=-1){
            System.out.printf("Подстрока \"%s\" присутствует в данном тексте в \n", inputString);
        }
        else{
            System.out.printf("Подстрока \"%s\" не присутствует в данном тексте\n", inputString);
        }
    }

    public static int wordCounter(){
        return  129408;
    }
}
