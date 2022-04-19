package ggg;

import org.springframework.stereotype.Component;
import java.util.*;

@Component
public class BookService {

    private static List<Book> books=new ArrayList<>();

    static {
        Book b=new Book(1, "Mikasa");
        books.add(b);
    }

    public Book findById(int id){
        for(Book boo:books)
            if(boo.getId()==id)
                return boo;
        return null;
    }
}
