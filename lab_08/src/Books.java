public class Books extends PublishingHouse implements IClassInfo{
    private String author;
    private String name;
    private int pages;
    int volumes;

    public Books(){

    }

    public Books(String author, String name, int pages, int volumes){
        this.author = author;
        this.name = name;
        this.pages = pages;
        this.volumes = volumes;
        super.setPublisher("Неизвестен");
        super.setYearOfPublishing(0);
    }

    public Books(String publisher, int yearOfPublishing, String author, String name, int pages, int volumes){
        super(publisher, yearOfPublishing);
        this.author = author;
        this.name = name;
        this.pages = pages;
        this.volumes = volumes;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getPages() {
        return pages;
    }

    public int getVolumes() {
        return volumes;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setVolumes(int volumes) {
        this.volumes = volumes;
    }

    @Override
    public void PrintInfo() {
        System.out.printf("Автор: %s \nНазвание книги: %s \nСтраниц: %d \nТом: %d",author, name, pages, volumes);
        super.PrintInfo();
    }

    public String typeOfClass(){
        return  getClass().toString();
    }
}
