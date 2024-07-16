// Write a Java program to create a class called Library that contains an array of Book objects.
//  Create objects and print the details of the books in the library.
//     Example:
//     Class: Book
//     Attributes: title, author
//     Class: Library
//     Attributes: books (Book[])

public class Library {

    private Book[] books;
    private int counter;
    private int maxbooks;

    public Library(int maxbooks) {
        books = new Book[maxbooks];
        counter = 0;
        this.maxbooks = maxbooks;
    }

    public void addBook(Book x) {
        if (counter < books.length) {
            books[counter] = x;
            counter++;
        }else {
            System.out.println("Can't add anymore books");
        }
    }

    public void printBooks() {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                books[i].display();
                System.out.println(" ");
            }
        }
    }
}
