package Problem3;

public class BookFiction extends Book {

    private int lateFeePerDayInDollar = 2;

    private String genres;

    public BookFiction(String title, String author, String genres) {
        title = super.title;
        author = super.author;
        this.genres = genres;
    }

    // copy constructor
    public BookFiction(BookFiction anotherBook) {
        genres = anotherBook.genres;
        super.title = anotherBook.title;
        super.title = anotherBook.author;
    }

    @Override
    public int getLateFeeInDollar() {
        return lateFeePerDayInDollar;
    }

    @Override
    public int calcLateFees(int numOfDaysPastDue) {
        if (numOfDaysPastDue < 5) {
            return (numOfDaysPastDue * lateFeePerDayInDollar);
        }
        else {
            return (2 * numOfDaysPastDue * lateFeePerDayInDollar);
        }
    }
}
