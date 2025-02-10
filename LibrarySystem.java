class Item{
    String title;
    String author;
    int publicationYear;

    public Item(String title,String author,int publicationYear){
        this.title=title;
        this.author=author;
        this.publicationYear=publicationYear;
    }
    public void displayDetails(){
        System.out.println("Title"+title);
        System.out.println("Author"+author);
        System.out.println("publicationYear"+publicationYear);
    }
}
class Book extends Item{
    private String genre;
    public Book(String title,String author,int publicationYear,String genre){
        super(title,author,publicationYear);
        this.genre=genre;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Genre"+genre);
        System.out.println("Type Book\n");
    }
}
class Magazine extends Item{
    private String issueNumber;
    public Magazine(String title,String author,int publicationYear,String issueNumber){
        super(title, author, publicationYear);
        this.issueNumber=issueNumber;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Issue Number"+issueNumber);
        System.out.println("Type Magazine\n");
    }
}
public class LibrarySystem{
public static void main(String[] args) {
    Book book1=new Book("Atomic Habits","James Clear",1985,"Productivity");
    Magazine magazine1=new Magazine("Power of your Subconscious mind", "Josephy Murphy", 2023, "1950");
    book1.displayDetails();
    magazine1.displayDetails();
}
    
}