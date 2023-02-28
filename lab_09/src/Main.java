import java.io.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Лабораторная работа №9 \nВариант №4 \n");

        try(FileReader reader = new FileReader("lab_09.txt")){
            int c;
            while ((c= reader.read())!= -1){
                System.out.print((char)c);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}