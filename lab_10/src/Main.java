import java.lang.String;
import java.io.*;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Лабораторная работа №10 \nВариант №4 \n");
        StringUtils test = new StringUtils();
        test.printText();
        test.setInputString();
        test.searchInText();
        System.out.println(test.wordCounter());


        /*String text = "";
        try (FileReader reader = new FileReader("main.txt")){
            int c;

            while ((c = reader.read())!= -1){
                text += ((char)c);
            }

            System.out.println("Текст из файла: \n\n" + text);
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка: \n" + e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.print("\nВведите текст, который надо найти в тексте: ");
        String text_input = scanner.nextLine();
        text = text.replaceAll("\r\n", " ");
        searchInText(text, text_input);
        System.out.println("\nКоличество слов в тексте: " + wordCounter(text));
        System.out.println("\nКоличество символов в тексте (вместе с пробелами): " + symbolsWithSpacesCounter(text));
        System.out.println("\nКоличество символов в тексте (без пробелов): " + symbolsWithoutSpacesCounter(text));
        System.out.println("\nКоличество гласных в тексте: " + vowelsCounter(text));
        System.out.println("\nКоличество согласных в тексте: " + consonantsCounter(text));
        System.out.println("\nСамое короткое слово в тексте: " + shortestWord(text));
        System.out.println("\nСамое длинное слово в тексте: " + longestWord(text));
   */ }

    public static void searchInText(String text, String text_input){
        if(text.indexOf(text_input)!=-1){
            System.out.printf("Подстрока \"%s\" присутствует в данном тексте\n", text_input);
        }
        else{
            System.out.printf("Подстрока \"%s\" не присутствует в данном тексте\n", text_input);
        }
    }

    public static int wordCounter(String text){
        return text.split(" ").length;
    }

    public static int symbolsWithSpacesCounter(String text){
        return text.length();
    }

    public static int symbolsWithoutSpacesCounter(String text){
        return text.replaceAll(" ", "").length();
    }

    public static int vowelsCounter(String text){
        int counter = 0;
        char[] vowels = "ёуеыаоэяию".toCharArray();
        char[] array = text.toCharArray();
        for (int i = 0; i < vowels.length; i++){
            for (int j = 0; j < array.length; j++){
                if (vowels[i]==array[j]){
                    counter++;
                }
            }
        }
        return counter;
    }

    public static int consonantsCounter(String text){
        int counter = 0;
        char[] consonants = "йцкнгшщзхъфвпрлджчмтьб".toCharArray();
        char[] array = text.toCharArray();
        for (int i = 0; i < consonants.length; i++){
            for (int j = 0; j < array.length; j++){
                if (consonants[i]==array[j]){
                    counter++;
                }
            }
        }
        return counter;
    }

    public static String shortestWord(String text){
        String[] array = text.split(" ");
        String shortestWord = array[0];
        for (int i = 0; i < array.length; i++){
            if (shortestWord.length() > array[i].length()){
                shortestWord = array[i];
            }
        }
        return shortestWord;
    }

    public static String longestWord(String text){
        String[] array = text.split(" ");
        String longestWord = array[0];
        for (int i = 0; i < array.length; i++){
            if (longestWord.length() < array[i].length()){
                longestWord = array[i];
            }
        }
        return longestWord;
    }
}