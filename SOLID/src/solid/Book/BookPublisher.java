package solid.Book;

import java.util.List;

public class BookPublisher {
    public static void main(String[] args) {
        Publisher book = new Book("Tyland", List.of("I", "moved", "here", "recently", "too"));
        book.printToFile();
    }
}
