import java.lang.String;
import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void searchInText(String text, String text_input){
        if(text.indexOf(text_input)!=-1){
            System.out.printf("Подстрока \"%s\" Эприсутствует в данном тексте\n", text_input);
        }
        else{
            System.out.printf("Подстрока \"%s\" не присутствует в данном тексте\n", text_input);
        }
    }

    public int wordCounter(String text){
        int counter = 0;
        //String[] arr = new String[text.split(" ".length())];
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("Лабораторная работа №10 \nВариант №4 \n");
        String text = "";
        try (FileReader reader = new FileReader("main.txt")){
            int c;

            while ((c = reader.read())!= -1){
                text += ((char)c);
            }

            System.out.println("Текст из файла:\n" + text);
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка: \n" + e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.print("Введите текст, который надо найти в тексте: ");
        String text_input = scanner.nextLine();
        searchInText(text, text_input);
    }
}