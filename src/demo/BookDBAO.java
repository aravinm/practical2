package demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 151642b on 10/24/2016.
 */
public class BookDBAO {
    public BookDetails getBookDetails(String bookId) {

        return createDummyBook(bookId);

    }

    // convenient method to create a dummy book detail
    // this method is meant for testing
    private BookDetails createDummyBook(String bookId) {
        BookDetails details = new BookDetails();
        details.setBookId(bookId);
        details.setDescription("Web components for developers talks about how web components can transfor the way you develop application for the web");
        details.setFirstName("Java");
        details.setSurname("Expert");
        details.setInventory(5);
        details.setOnSale(false);
        details.setPrice(5.9f);
        details.setTitle("Web components for developers");
        details.setYear(2015);
        return details;
    }


    public List<BookDetails> getAllBooks() {
        ArrayList<BookDetails> details = new ArrayList<BookDetails>();
        for (int i = 0; i < 3; i++) {
            BookDetails book = new BookDetails();
            book.setBookId("" + i);
            book.setDescription("Book Description" + i);
            book.setFirstName("First Name" + i);
            book.setInventory(i);
            book.setOnSale(true);
            book.setPrice(1.0f + i);
            book.setTitle("Book Title" + i);
            book.setYear(2014+i);
            details.add(book);
        }
   return details;
    }


}
