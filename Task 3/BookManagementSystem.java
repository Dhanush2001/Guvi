import java.util.Scanner;

class Book {
    private int bookID;
    private String title;
    private String author;
    private boolean isAvailable;
    public Book(int bookID, String title, String author,boolean isAvailable)
    {
        this.bookID=bookID;
        this.title=title;
        this.author=author;
        this.isAvailable=isAvailable;
    }
    //getter and setter methods for getting the values as well as setting the values for a certain object
    public void setBookID(int bookID)
    {
        this.bookID=bookID;
    }
    public int getBookID()
    {
        return bookID;
    }
    public void setTitle(String title)
    {
        this.title=title;
    }
    public String getTitle()
    {
        return title;
    }
    public void setAuthor(String author)
    {
        this.author=author;
    }
    public String getAuthor()
    {
        return author;
    }
    public void setAvailable(boolean isAvailable)
    {
        this.isAvailable=isAvailable;
    }
    public boolean getAvailable()
    {
        return isAvailable;
    }
    //this method is used to convert the object into string  it overrides the to string method
    public String toString() {
        return "Book ID: " + bookID + ", Title: " + title + ", Author: " + author + ", Available: " + isAvailable;
    }
}
class Library
{
    private Book[] books;
    private int count=0;
    public Library() {
        this.books = new Book[5];
    }
    // this method is used to add book into the stack
    public void addBook(Book book)
    {
        if(count<books.length && count<=5)
        {
            books[count++]=book;
        }
        else {
            System.out.println("Library is full!");
        }
    }
    // this method is used to remove book using bookID
    public boolean removeBook(int bookID) {
        for (int i = 0; i < count; i++) {
            if (books[i].getBookID() == bookID) {
                for (int j = i; j < count - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[--count] = null;
                return true;
            }
        }
        return false;
    }
    // this method is used to replace book using bookID
    public boolean replaceBook(int bookID, Book newBook) {
    for (int i = 0; i < count; i++) {
        if (books[i].getBookID() == bookID) {
            books[i] = newBook;
            return true;
        }
    }
    return false;
    }
    // this method is used to search book using bookID
    public Book searchBookByID(int bookID) {
        for (int i = 0; i < count; i++) {
            if (books[i].getBookID() == bookID) {
                return books[i];
            }
        }
        return null;
    }
    // this method is used to display all the books
    public void diplayBooks()
    {
        if(count==0)
        {
            System.out.println("No books in the library.");
        } else {
            for(int i=0;i<count;i++)
            {
                System.out.println(books[i]);
            }
        }
    }
}
public class BookManagementSystem
{
    public static void main(String[] args)
    {
        Library library=new Library();
        Scanner sc= new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter the operation to do the following tasks");
            System.out.println("1.Add a Book \n2.Remove Book \n3.Replace a Book \n4.Search book by ID \n5.Show Books\n6.Exit ");
            int operation= sc.nextInt();
            switch(operation){
                case 1:
                    System.out.print("Enter Book ID:");
                    int bookID = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Title:");
                    String title = sc.nextLine();
                    System.out.print("Enter Author:");
                    String author = sc.nextLine();
                    sc.nextLine();
                    Book book = new Book(bookID, title, author,true);
                    library.addBook(book);
                    System.out.println("Book added.");
                    break;
                case 2:
                    System.out.print("Enter Book ID to Remove:");
                    int removeID = sc.nextInt();
                    if (library.removeBook(removeID)) {
                        System.out.println("Book removed.");
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter Book ID to Replace:");
                    int replaceID = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter New Book Title:");
                    String newTitle = sc.nextLine();
                    System.out.print("Enter New Book Author:");
                    String newAuthor = sc.nextLine();
                    System.out.print("Is New Book Available:");
                    boolean newAvailable = sc.nextBoolean();
                    sc.nextLine();
                    Book newBook = new Book(replaceID, newTitle, newAuthor, newAvailable);
                    if (library.replaceBook(replaceID, newBook)) {
                        System.out.println("Book replaced.");
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter Book ID to Search:");
                    int searchID = sc.nextInt();
                    Book foundBook = library.searchBookByID(searchID);
                    if (foundBook != null) {
                        System.out.println("Book found:" + foundBook);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 5:
                    library.diplayBooks();
                    break;
                case 6:
                    System.out.println("Exiting");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

    }
}
