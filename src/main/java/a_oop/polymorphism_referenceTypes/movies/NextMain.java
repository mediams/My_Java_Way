package a_oop.polymorphism_referenceTypes.movies;

public class NextMain {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
        jaws.watchMovie();

        var airplane = Movie.getMovie("C", "Test");
        airplane.watchMovie();
    }
}
