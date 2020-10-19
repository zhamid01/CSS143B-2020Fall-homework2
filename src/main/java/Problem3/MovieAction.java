package Problem3;

public class MovieAction extends Movie {

    private int lateFeePerDayInDollar = 5;

    public MovieAction(String rating, String title) {
        super (title, rating);
        this.title = title;
        this.rating = rating;
    }

    public MovieAction(MovieAction anotherMovie) {
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
        // homework
    }
}
