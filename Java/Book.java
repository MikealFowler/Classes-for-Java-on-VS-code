// Example:
// Class: Book
// Constructor: Book(String title, String author)
public class Book {
    private String Author;
    private String Title;


    public Book(String Author, String Title){
        this.Author = Author;
        this.Title = Title;
    }

    public void display(){
        System.out.println("Title: " + Title);
        System.out.println("Author: " + Author);
    }
}
