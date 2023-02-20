import java.util.Scanner;
public class WORKER {
    private String surnameNameSecondName;
    private String jobTitle;
    private int hours;
    Scanner scan = new Scanner(System.in);
    public WORKER(String surnameNameSecondName, String jobTitle, int hours){
        this.surnameNameSecondName = surnameNameSecondName;
        this.jobTitle = jobTitle;
        this.hours = hours;
    }
    public WORKER(){
    }
    public String GetName() {
        return surnameNameSecondName;
    }
    public void SetName() {
        System.out.print("Введите новое ФИО: ");
        surnameNameSecondName = scan.nextLine();
    }
    public String GetJobTitle(){
        return jobTitle;
    }
    public void SetJobTitle() {
        System.out.print("Введите новую должность: ");
        jobTitle = scan.nextLine();
    }
    public int GetHours(){
        return hours;
    }
    public String GetFamily(){
        String[] arr = surnameNameSecondName.split(" ");
        return arr[0];
    }
    public void SetHours(){
        System.out.print("Введите новое количество часов: ");
        hours = scan.nextInt();
    }
    public void InputInfo(){
        SetName();
        SetJobTitle();
        SetHours();
    }
    public void PrintInfo(){
        System.out.println("ФИО: " + GetName() + "\nДолжность: " + GetJobTitle() + "\nОтработано часов: " + GetHours());
    }
}