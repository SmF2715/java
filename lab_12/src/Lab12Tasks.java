import java.util.Scanner;

public class Lab12Tasks {

    public static void task1(){
        System.out.println("Задание №1\n");
        SearchResult test = new SearchResult("AI0.txt", "testThread");
        test.start();
    }

    public static void main(String[] args){
        System.out.println("Лабораторная работа №12 \n");
        task1();
    }
}
