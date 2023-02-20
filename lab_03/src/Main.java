public class Main {
    public static void main(String[] args) {
        System.out.println("Лабораторная работа №3 \nВариант 4\nЗадание №1");
        Bus a82 = new Bus(82,"To Zavod", "08:00");
        a82.Print();
        a82.ReceiveBus("Sharaga");
        System.out.println("Номер автобуса: " + a82.GetNumber());

        Bus a107 = new Bus(107,"From Kamenka");
        a107.Print();
        a107.ReceiveBus("From Kamenka",12);
        System.out.println("Номер этого маршрута: " + a107.GetNumber());}
}