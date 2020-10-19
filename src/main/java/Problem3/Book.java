package Problem3;

import java.util.UUID;

//https://www.geeksforgeeks.org/copy-constructor-in-java/

public abstract class Book implements StoreMediaOperations {
    UUID id;
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.id = UUID.randomUUID();
    }

    // copy constructor
    public Book(Book anotherBook) {
        id = anotherBook.id;
        title = anotherBook.title;
        author = anotherBook.author;
    }

    @Override
    public boolean equals(Object obj) {
        Book other = (Book) obj;
        if (other == null) {
            System.out.println("Error: null Book object");
        }
        else if (this.id == other.id && this.title == other.title && this.author == other.author)
        {
            return true;
        }
    }
}
