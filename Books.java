/*Create a class Book which contains four members: name, author,
price, num_pages. Include a constructor to set the values for the
members. Include methods to set and get the details of the objects.
Include a toString( ) method that could display the complete details
of the book. Develop a Java program to create n book objects.*/

import java.util.*;
class Books
{
    String name, author;
    float price, num_pages;
    
    Books (  )
    {
        name="";
        author="";
        price=0;
        num_pages=0;
    }
    
    void set()
    {
        System.out.println("Enter Name, Author, price and total number of pages");
		Scanner sc = new Scanner(System.in);
		name = sc.next();
		author = sc.next();
		price = sc.nextInt();
		num_pages = sc.nextInt();
    }
    
    void get(Books b)
    {
        System.out.println("The Name, Author, price and total number of pages in the book are:");
        System.out.println(b.toString());
    }
}
class Main
{
    public static void main(String[] args) 
    { 
        Books b = new Books(); 
        b.set();
        b.get(b);
        
    }
}
