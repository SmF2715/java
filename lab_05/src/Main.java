import java.util.Scanner;
public class Main {
    static Scanner scan = new Scanner(System.in);
    public static int Factorial(int k){
        int sum = 1;
        for(int i = 1; i <=k; i++){
            sum *= i;
        }
        return sum;
    }
    public static double S (double a, int n){
        double result = 0;
        for (int k = 0; k < n; k++){
            result += (Math.cos((k * Math.PI)/4)/Factorial(k))*Math.pow(a,k);
        }
        return result;
    }
    public static double Y (double a){
        return Math.pow(Math.E,a * Math.cos(Math.PI/4)) * Math.cos(a * Math.sin(Math.PI/4));
    }
    public static void first(){
        System.out.println("Задание №1");
        int n = 10;
        double a = 0.1, b = 1.0, h = 0.1;
        double[] inputDigits = {a,b,h};
        char[] variables = {'a','b', 'h'};

        for (int i =  0; i < inputDigits.length; i++){
            System.out.print("Введите значение переменной " + variables[i] + ": ");
            inputDigits[i] = scan.nextDouble();
        }
        System.out.print("Введите значение n: ");
        n = scan.nextInt();

        while(a < b){
            System.out.format("S(x) при х = %.3f = %.5f\n", a , S(a,n));
            System.out.format("Y(x) при х = %.3f = %.5f\n", a  , Y(a));
            a+=h;
        }
    }
    public static void second(){
        System.out.print("Задание №2 \nВведите кол-во чисел Фибоначчи: ");
        int num = scan.nextInt();
        int n0 = 1;
        int n1 = 1;
        int n2;
        System.out.print(n0+" "+n1+" ");
        for(int i = 3; i <= num; i++){
            n2=n0+n1;
            System.out.print(n2+" ");
            n0=n1;
            n1=n2;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("Лабораторная работа №5\n Вариант 4 \n");
        first();
        second();
    }
}