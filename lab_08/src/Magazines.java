public class Magazines extends Books implements IClassInfo{
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Magazines(){

    }
    public Magazines(int number){
        this.number = number;
    }
    public Magazines(String publisher, int yearOfPublishing, String author, String name, int pages, int volumes, int number){
        super(publisher, yearOfPublishing, author, name, pages, volumes);
        this.number = number;
    }

    @Override
    public void PrintInfo() {
        super.PrintInfo();
        System.out.printf("Номер журнала: %d\n", number);
    }

    public String typeOfClass(){
        return  getClass().toString();
    }
}
