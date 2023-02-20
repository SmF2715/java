public class WORKER1 extends WORKER{
    private String load;
    public WORKER1(){
        super();
    }
    public WORKER1(String surnameNameSecondName, String jobTitle, int hours, String load){
        super(surnameNameSecondName, jobTitle, hours);
        this.load = load;
    }
    public void SetLoad(){
        System.out.print("Введите нагрузку: ");
        load = scan.nextLine();
    }
    public String GetLoad(){
        return load;
    }
    @Override
    public void InputInfo() {
        super.InputInfo();
        SetLoad();
    }
    @Override
    public void PrintInfo() {
        super.PrintInfo();
        System.out.println("\nНагрузка: " + GetLoad());
    }
}