import java.util.Scanner;
public class Main {
    public static double midDigits(int[] nums){
        double res = 0;
        for (int i = 0; i < nums.length; i++){
            res += nums[i];
        }
        return res/nums.length;
    }

    public static int minSearch(int ...nums){
        int minimum = nums[0];
        for(int i = 0; i < nums.length; i++){
            if (nums[i] < minimum) {minimum = nums[i];}
        }
        return minimum;
    }

    public static void main(String[] args) {
        System.out.println("Лабораторная работа №4 \nВариант 4 \n");
        Scanner scanner = new Scanner(System.in);
        int[] digits = new int[3];
        for (int i = 0; i < digits.length; i++){
            System.out.print("Введите значение переменной " + i + ": ");
            digits[i] = scanner.nextInt();
        }
        double y = midDigits(digits) / minSearch(digits);
        System.out.println("y = " + y);
    }
}