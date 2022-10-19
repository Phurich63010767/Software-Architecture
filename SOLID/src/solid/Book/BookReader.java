package solid.Book;

import java.util.List;

public class BookReader {
    public static void main(String[] args) {
        Reader book = new Book("Tyland", List.of("I", "moved", "here", "recently", "too"));
        book.printToScreen();
    }
}

