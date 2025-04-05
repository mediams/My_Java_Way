package a_oop.polymorphism_referenceTypes.movies;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Movie movie = new Comedy("Star Wars");
        movie.watchMovie();

        movie = Movie.getMovie("Adventure", "Star Wars");
        movie.watchMovie();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the number of sides (C, S): ");
            String type = scanner.nextLine();
            if ("Qq".contains(type)) {
                break;
            }
            System.out.println("Enter Movie Title: ");
            String title = scanner.nextLine();
            movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }
    }
}
