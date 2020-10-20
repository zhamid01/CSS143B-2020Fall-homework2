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
        if (numOfDaysPastDue > 0 && numOfDaysPastDue < 5) {
            return (numOfDaysPastDue * lateFeePerDayInDollar);
        }
        else if (numOfDaysPastDue >= 5){
            return ((2 * numOfDaysPastDue) * lateFeePerDayInDollar);
        }
        return 0;
    }
}
