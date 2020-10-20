package Problem3;

import java.util.UUID;

public abstract class Movie implements StoreMediaOperations {
    String rating;
    String title;
    UUID id;

    public Movie(String rating, String title) {
        this.id = UUID.randomUUID();
        this.rating = rating;
        this.title = title;
    }

    public Movie(Movie anotherMovie) {
        id = anotherMovie.id;
        rating = anotherMovie.rating;
        title = anotherMovie.title;
    }

    @Override
    public boolean equals(Object obj) {
        Movie other = (Movie) obj;
        if (other == null) {
            System.out.println("Error: null Book object");
        }
        return (this.id == other.id && this.title == other.title && this.rating == other.rating);
    }
}
