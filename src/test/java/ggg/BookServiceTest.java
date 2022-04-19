package ggg;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.doReturn;

@RunWith(MockitoJUnitRunner.class)
public class BookServiceTest {
    @InjectMocks
    private BookService bookService;

    @Test
    public void findByIdTest(){
        Book book=new Book(1,"Mikasa");
        doReturn(book).when(bookService).findById(anyInt());
        Book b=bookService.findById(3);
        assertEquals(book, b);
    }
}
