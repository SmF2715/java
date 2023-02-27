public class PublishingHouse implements IClassInfo{

    private String publisher;
    private int yearOfPublishing;

    public PublishingHouse(String publisher, int yearOfPublishing){
        this.publisher = publisher;
        this.yearOfPublishing = yearOfPublishing;
    }
    public PublishingHouse( ){

    }
    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public void PrintInfo(){
        System.out.println("\nИздатель: " + getPublisher() + "\nГод издания: " + getYearOfPublishing());
    }

    public String typeOfClass(){
        return  getClass().toString();
    }
}
