import java.io.InputStream;  
import java.util.List;  
  

	
  
public class ParseTest {  
  
    public void testSAX() throws Throwable{  
        SaxParseService sax = new SaxParseService();  
        InputStream input = this.getClass().getClassLoader().getResourceAsStream("book.xml");  
        List<Book> books = sax.getBooks(input);  
        for(Book book : books){  
            System.out.println(book.toString());  
        }  
    }  
    
    public static void main(String[] args) throws Throwable {
	new ParseTest().testSAX();	
	}
} 