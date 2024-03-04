public class Movie {

    private String title;
    private String director;
    private int releaseYear;
    private double rating;
    private Genre genre;

    public Movie(String title, String director, int releaseYear, double rating, Genre genre){
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
        this.rating = rating;
        this.genre = genre;
    }
    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public double getRating() {
        return rating;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
    public String toString() {
        return String.format("%s (%d) directed by %s, rating: %.2f, genre: %s", title, releaseYear, director, rating, genre);
    }

}
