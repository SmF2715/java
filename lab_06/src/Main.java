import java.util.Scanner;
public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Лабораторная работа №6 \nВариант 4 \n");
        WORKER plunger = new WORKER("Жмышенко Валерий Альбертович", "техник-сантехник 1 категории с наряд-допуском на высотные работы", 23);
        WORKER medic = new WORKER("Попов Арсений Евлампович", "Медбрат", 150);
        WORKER[] arr = {plunger, medic};
        for (int i = 0; i < arr.length; i++) {
            System.out.println("№ " + i);
            arr[i].PrintInfo();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.format("\nЭлемент №%d массива объектов класса WORKER содержит в себе: \nФИО: %s \nДолжность: %s \nКол-во отработанных часов: %d\n", i, arr[i].GetName(), arr[i].GetJobTitle(), arr[i].GetHours());
            arr[i].SetName();
            arr[i].SetJobTitle();
            arr[i].SetHours();
            System.out.format("\nЭлемент №%d массива объектов класса WORKER содержит в себе: \nФИО: %s \nДолжность: %s \nКол-во отработанных часов: %d\n", i, arr[i].GetName(), arr[i].GetJobTitle(), arr[i].GetHours());
        }

        System.out.print("Введите фамилию: ");
        String inputFamily = scan.next();
        for (int i = 0; i < arr.length; i++){
            if (inputFamily == arr[i].GetFamily()) {
                System.out.format("Кол-во отработанных часов  у %s = %d \n", inputFamily, arr[i].GetHours());
            }
        }

        WORKER1 bum = new WORKER1("Качан Василий Петрович", "бомж", 0, "Отсутсвует");
        arr[2] = bum;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("№ " + i);
            arr[i].PrintInfo();
        }
    }
}