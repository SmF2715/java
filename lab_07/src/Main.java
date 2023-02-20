import java.io.*;
import java.util.Random;
import java.lang.Math;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void firstLab02(){
        System.out.println("ЛР 2 \nВариант 4 \n#1");
        int[] array = new int[(int)(Math.random()*(10-1))+1]; //длина массива и сам массив
        int lastPositiveDigit = 0; //последнее положительное число
        int i_Positive = 0;
        int sum = 0;
        System.out.println("Кол-во элементов в массиве " + array.length);
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(-10,10);
            if(array[i] > 0){
                lastPositiveDigit = array[i];
                i_Positive = i;
            }
        }
        System.out.print("Массив: ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]+" ");
        }
        for (int i = 0; i <i_Positive; i++){
            sum+=array[i];
        }
        System.out.println("Последнее положительное число: " + lastPositiveDigit);
        try(FileWriter writer = new FileWriter("firstLab02.txt", false)) {
            // запись всей строки
            writer.write("Последнее положительное число = " + lastPositiveDigit + "\nСумма элементов до последнего положительного: " + sum);
            writer.append('\n');
            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        try (FileReader reader = new FileReader("firstLab02.txt")) {
            int c;
            while ((c=reader.read())!= -1){
                System.out.print((char)c);
            }
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    public static void secondLab02(){
        System.out.println("#2");
        System.out.print("Введите число столбцов и строк: ");
        int n = scanner.nextInt();
        int m = n;
        int zero_Counter = 0;
        int[][] matrix = new int[n][m];
        for (int y = 0; y < n; y ++){
            for (int x = 0; x < m; x++){
                matrix[x][y] = random.nextInt(-10,10);
                System.out.print(matrix[x][y] + " ");
            }
            System.out.println("\n");
        }
        for(int y = 0; y < m; y++){
            for(int x = 0; x < n; x++){
                if (matrix[y][x] == 0) {
                    zero_Counter++;
                    break;
                }
            }
        }

        try(FileWriter writer = new FileWriter("secondLab02.txt", false)){
            writer.write("Количество столбцов, в которых есть хотя бы 1 нулевой элемент равно " + zero_Counter);
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try (FileReader reader = new FileReader("secondLab02.txt")){
            int c;
            while((c = reader.read())!= -1){
                System.out.print((char)c);
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void lab02(){
        firstLab02();
        secondLab02();
    }
    public static void lab03(){
        Bus a82 = new Bus(82,"To Zavod", "08:00");
        a82.Print();
        a82.ReceiveBus("Sharaga");
        System.out.println("Номер автобуса: " + a82.GetNumber());

        Bus a107 = new Bus(107,"From Kamenka");
        a107.Print();
        a107.ReceiveBus("From Kamenka",12);
        System.out.println("Номер этого маршрута: " + a107.GetNumber());
        Bus[] buses = {a82, a107};
        for (int i = 0; i < buses.length; i++){
            try(FileWriter writer = new FileWriter("firstLab03.txt", false)){
                writer.write(buses[i].GetInfo());
            }
            catch (IOException ex){
                System.out.println(ex.getMessage());
            }
            try(FileReader reader = new FileReader("firstLab03.txt")){
                int c;
                while ((c = reader.read())!= -1){
                    System.out.print((char)c);
                }
            }
            catch (IOException ex){
                System.out.println(ex.getMessage());
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Лабораторная работа №7 \nВариант №4");
        lab02();
        lab03();
    }
}