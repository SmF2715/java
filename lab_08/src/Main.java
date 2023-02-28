interface IClassInfo{
    default String typeOfClass(){
        return "класс неизвестен/ошибка";
    };
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Лабораторная работа №8\nВариант 4\n");
        PublishingHouse dom = new PublishingHouse("Дом Книги", 1921);
        dom.PrintInfo();
        Books twentyLieUnderWater = new Books("Жюль Верн", "20000 лье под водой", 360, 1);
        twentyLieUnderWater.PrintInfo();
        Books test = new Books("Орхидея", 1823, "Попков", "Исторические сводки", 1312, 12);
        test.PrintInfo();
        Magazines magazines = new Magazines("Экспокнига", 2015, "Варган Компани", "Бизнес-молодость в РБ", 120, 1, 1);
        magazines.PrintInfo();
        magazines.setNumber(16);
        magazines.PrintInfo();
        System.out.println("Объект "+ magazines.toString() +" является экземпляром класса: " + magazines.typeOfClass());
        System.out.println("Кол-во журналов: " + magazines.getAmount());
    }
}