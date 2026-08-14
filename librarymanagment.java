import java.util.Scanner;

class book {
       private int bookid;
       private String title;
       private String author;
       private double price;
       private boolean availaibility;
      public book(int bookid, String title, String author, double price, boolean availaibility) {
        this.bookid = bookid;
        this.title = title;
        this.author = author;
        this.price = price;
        this.availaibility = availaibility;
      }
    public void issuebook(){
        if(availaibility)
        {
            System.out.println("Book available");
            availaibility = false;
        }
        else
        {
            System.out.println("Book not available");
        }
    }
    public void searchbook(String title){
        if (this.title.equals(title))
        {
            System.out.println("Book Available: " + title);
            displaybook();
        }
        else
        {
            System.out.println("Book not available");
        }
    }

    public void returnbook(){
        if(!availaibility)
        {
            System.out.println("Book returned");
            availaibility = true;
        }
        else
        {
            System.out.println("Book was not issued");
        }
    }

    public void displaybook(){
        System.out.println("Book ID: " + bookid);
        System.out.println("Title: " + title);  
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Availability: " + availaibility);
    }
}

public class librarymanagment {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter book id:");
        int bookid = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Enter title:");
        String title = sc.nextLine();

        System.out.println("Enter author:");
        String author = sc.nextLine();

        System.out.println("Enter price:");
        double price = sc.nextDouble();

        System.out.println("Is the book available?:");
        boolean availaibility = sc.nextBoolean();

        book Book = new book(bookid, title, author, price, availaibility);

        Book.displaybook();
        Book.issuebook();
        Book.returnbook();
        sc.close();
    }
}