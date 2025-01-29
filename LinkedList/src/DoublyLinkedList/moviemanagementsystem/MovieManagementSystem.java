package DoublyLinkedList.moviemanagementsystem;

public class MovieManagementSystem {
    public static void main(String[] args) {
        MovieLinkedList movieList = new MovieLinkedList();

        movieList.addMovieAtEnd("Inception", "Christopher Nolan", 2010, 8.8);
        movieList.addMovieAtBeginning("Titanic", "James Cameron", 1997, 7.8);
        movieList.addMovieAtEnd("Interstellar", "Christopher Nolan", 2014, 8.6);
        movieList.addMovieAtPosition("Avatar", "James Cameron", 2009, 7.9, 1);

        System.out.println("Movies in forward order:");
        movieList.displayForward();

        System.out.println("\nMovies in reverse order:");
        movieList.displayReverse();

        System.out.println("\nSearching for movies by Christopher Nolan:");
        movieList.searchByDirector("Christopher Nolan");

        System.out.println("\nUpdating rating for Titanic:");
        movieList.updateMovieRating("Titanic", 8.0);
        movieList.displayForward();

        System.out.println("\nRemoving Interstellar:");
        movieList.removeMovie("Interstellar");
        movieList.displayForward();
    }
}