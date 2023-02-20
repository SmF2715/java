import java.lang.Math;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void first(){
        System.out.println("Лабораторная работа №2 \nВариант 4 \nЗадание №1");
        Scanner scanner = new Scanner(System.in);
        int n = (int)(Math.random()*(10-1))+1;
        int[]array = new int[n];
        int lastPositiveDigit = 0;
        int i_Positive = 0;
        int sum = 0;
        System.out.println("Кол-во элементов в массиве " + n);
        System.out.println("Заполните массив целыми числами:\n");
        for(int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
            if(array[i] > 0){
                lastPositiveDigit = array[i];
                i_Positive = i;
            }
        }
        System.out.print("Массив: ");
        for(int i = 0; i < n; i++){
            System.out.print(array[i]+" ");
        }
        for (int i = 0; i <i_Positive; i++){
            sum+=array[i];
        }
        System.out.println("Последнее положительное число: " + lastPositiveDigit);
        System.out.println("Сумма: " + sum);
    }

    public static void second(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Задание №2 \nВариант 4 \nВведите n: ");
        int n = scanner.nextInt();
        System.out.print("\nВведите m: ");
        int m = scanner.nextInt();
        int zero_Counter = 0;
        int[][] matrix = new int[n][m];
        for (int y = 0; y < n; y ++){
            for (int x = 0; x < m; x++){
                matrix[x][y] =random.nextInt(-10,10);
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
        System.out.println("Количество столбцов с хотя бы одним элементом, равном 0 =  " + zero_Counter);
    }

    public static void main(String[] args) {
        first();
        second();
    }
}