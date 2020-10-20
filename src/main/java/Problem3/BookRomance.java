package Problem3;

public class BookRomance extends Book {

    private int lateFeePerDayInDollar = 4;

    public BookRomance(String title, String author) {
        super (title, author);
        this.title = title;
        this.author = author;
    }

    public BookRomance(BookRomance anotherBook) {
        super (anotherBook);
        author = anotherBook.author;
        title = anotherBook.title;
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
