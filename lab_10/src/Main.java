import java.lang.String;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Лабораторная работа №10 \nВариант №4 \n");
        StringUtils test = new StringUtils();
        test.printText();
        test.writeInFile();
        test.printText();
    }
}