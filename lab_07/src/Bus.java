public class Bus {
    private int number;
    private String time;
    private String name;
    public Bus (int number, String name){
        this.number = number;
        this.name = name;
    }
    public Bus(int number, String name, String time){
        this(number,name);
        this.time = time;
    }
    static {
        System.out.println("\nСоздан объект класса Bus");
    }
    public Bus(){
        System.out.println("Ну ввёл бы хоть что-то для вида");
    }
    public String ReceiveBus(String name){
        String res = ("Автобус рейса " + name);
        return  res;
    }
    public String ReceiveBus(String name, int number){
        String res = ("Автобус рейса "+ name +" под номером " + number);
        return res;
    }
    public int GetNumber(){
        return number;
    }
    public void Print(){
        System.out.println("Название: " + name + ", номер : " + number + ", время: " + time);
    }
    public String GetInfo(){
        return "\nName: " + name + "\nNumber: " + number + "\nTime: " + time;
    }
    /*    public void sendMessage(string names...){
        System.out.print("Введите название маршрута/автобуса: ");
        Scanner scanner = new Scanner(System.in);
        String bus_name =
    }*/
}