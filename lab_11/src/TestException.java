import java.util.Scanner;

public class TestException {
    static Scanner scanner = new Scanner(System.in);

    public static void testMet(){
        int a,b,res = 0;
        try{
            System.out.println("Введите число a: ");
            a = scanner.nextInt();
            System.out.println("Введите число b: ");
            b = scanner.nextInt();
            res = a/b;
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        System.out.print("a/b = " + res);
    }
}