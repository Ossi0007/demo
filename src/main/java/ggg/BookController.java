package ggg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;
    @GetMapping("/books/{id}")
    public Book getAll(@PathVariable int id){
        return bookService.findById(id);
    }
}
