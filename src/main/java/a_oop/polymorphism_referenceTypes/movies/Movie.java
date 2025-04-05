package a_oop.polymorphism_referenceTypes.movies;

public class Movie {
    private final String title;

    public Movie(String title) {
        this.title = title;
    }

    public static Movie getMovie(String type, String title) {
        return switch (type.toUpperCase().charAt(0)) {
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            default -> new Movie(title);
        };
    }

    public void watchMovie() {
        String instantType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instantType + " film");
    }

}

class Adventure extends Movie {
    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Pleasant Scene",
                "Scary Music",
                "Something Bad Happens");
    }
}

class Comedy extends Movie {
    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Pleasant Scene",
                "Happy Music",
                "Something Funny Happens");
    }
}
