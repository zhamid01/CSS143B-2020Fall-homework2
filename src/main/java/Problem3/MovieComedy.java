package Problem3;

public class MovieComedy extends Movie {
    private int lateFeePerDayInDollar = 3;

    public MovieComedy(String rating, String title) {
        super (rating, title);
        this.title = title;
        this.rating = rating;
    }

    public MovieComedy(MovieComedy anotherMovie) {
        super (anotherMovie);
        title = anotherMovie.title;
        rating = anotherMovie.rating;
    }

    @Override
    public int getLateFeeInDollar() {
        return lateFeePerDayInDollar;
    }

    @Override
    public int calcLateFees(int numOfDaysPastDue) {
        return (numOfDaysPastDue * lateFeePerDayInDollar);
    }
}
