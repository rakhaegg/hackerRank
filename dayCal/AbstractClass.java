package dayCal;

import java.util.Scanner;
abstract class Book {
    String title;
    String author;
    
     Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    abstract void display();
}
class Mybook extends Book {
    int price;
    
    Mybook(String title , String author , int price){

        super(title, author);

        this.price = price;
        
    }

    @Override
    void display() {
        // TODO Auto-generated method stub
        System.out.println("Title: " + super.title);
        System.out.println("Author: " + super.author);
        System.out.println("Price: " + price);
        

    }

    
}

public class AbstractClass {
    
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();
        
        //Book book = new MyBook(title, author, price);
        Book book = new Mybook(title, author, price);
        book.display();
    }    
}
