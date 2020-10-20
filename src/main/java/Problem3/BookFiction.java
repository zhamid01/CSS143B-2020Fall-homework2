package Problem3;

public class BookFiction extends Book {

    private int lateFeePerDayInDollar = 2;

    private String genres;

    public BookFiction(String title, String author, String genres) {
        super (title, author);
        this.genres = genres;
        this.title = title;
        this.author = author;
    }

    // copy constructor
    public BookFiction(BookFiction anotherBook) {
        super (anotherBook);
        author = anotherBook.author;
        title = anotherBook.title;
        genres = anotherBook.genres;
    }

    @Override
    public int getLateFeeInDollar() {
        return lateFeePerDayInDollar;
    }

    @Override
    public int calcLateFees(int numOfDaysPastDue) {
        if (numOfDaysPastDue > 0) {
            return (numOfDaysPastDue * lateFeePerDayInDollar);
        }
        return 0;
    }
}
