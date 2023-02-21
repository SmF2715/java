public class Main {
    public static void main(String[] args) {
        System.out.println("Лабораторная работа №8\nВариант 4\n");
        PublishingHouse dom = new PublishingHouse("Дом Книги", 1921);
        dom.PrintInfo();
        Books twentyLieUnderWater = new Books("Жюль Верн", "20000 лье под водой", 360, 1);
        twentyLieUnderWater.PrintInfo();
        Books test = new Books("Орхидея", 1823, "Попков", "Исторические сводки", 1312, 12);
        test.PrintInfo();
    }
}