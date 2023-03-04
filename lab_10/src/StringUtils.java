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
        return mainString.replaceAll("[\r\n]", " ");
    }

    public static void writeInFile(){
        try(FileWriter fileWriter = new FileWriter("main.txt", false)){
            System.out.println("Введите текст для записи в файл");
            String inputInFile = scanner.nextLine();
            fileWriter.append(" ".concat(inputInFile + " "));
            fileWriter.flush();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void printText(){
        System.out.println("Текст: \n" + readFromFile());
    }

    public static void searchInText(){
        if(readFromFile().contains(inputString)){
            System.out.printf("Подстрока \"%s\" присутствует в данном тексте \n", inputString);
        }
        else{
            System.out.printf("Подстрока \"%s\" не присутствует в данном тексте\n", inputString);
        }
    }

    public static int wordCounter(){
        return readFromFile().split(" ").length;
    }

    public static int symbolsWithSpacesCounter(){
        return readFromFile().length();
    }

    public static int symbolsWithoutSpacesCounter() {
        return readFromFile().replaceAll(" ", "").length();
    }

    public static int vowelsCounter(){
        int counter = 0;
        char[] vowels = "ёуеыаоэяию".toCharArray();
        char[] array = readFromFile().toCharArray();
        for (int i = 0; i < vowels.length; i++){
            for (int j = 0; j < array.length; j++){
                if (vowels[i]==array[j]){
                    counter++;
                }
            }
        }
        return counter;
    }

    public static int consonantsCounter(){
        int counter = 0;
        char[] consonants = "йцкнгшщзхъфвпрлджчмтьб".toCharArray();
        char[] array = readFromFile().toCharArray();
        for (int i = 0; i < consonants.length; i++){
            for (int j = 0; j < array.length; j++){
                if (consonants[i]==array[j]){
                    counter++;
                }
            }
        }
        return counter;
    }

    public static String shortestWord(){
        String[] array = readFromFile().split(" ");
        String shortestWord = array[0];
        for (int i = 0; i < array.length; i++){
            if (shortestWord.length() > array[i].length()){
                shortestWord = array[i];
            }
        }
        return shortestWord;
    }

    public static String longestWord(){
        String[] array = readFromFile().split(" ");
        String longestWord = array[0];
            for (int i = 0; i < array.length; i++){
            if (longestWord.length() < array[i].length()){
                longestWord = array[i];
            }
        }
        return longestWord;
    }

    public static void printALlMethods(){
        printText();
        setInputString();
        searchInText();
        System.out.println("Кол-во слов: "+ wordCounter());
        System.out.println("Кол-во символов (с пробелами): " + symbolsWithSpacesCounter());
        System.out.println("Кол-во символов (без пробелов): " + symbolsWithoutSpacesCounter());
        System.out.println("Кол-во гласных в тексте: " + vowelsCounter());
        System.out.println("Кол-во согласных в тексте: " + consonantsCounter());
        System.out.println("Самое короткое слово в тексте: "+ shortestWord());
        System.out.println("Самое длиное слово в тексте: "+ longestWord());
    }
}