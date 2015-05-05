package groovy
import com.example.groovy.spring.BookService
import com.example.groovy.spring.Manager
import org.springframework.beans.factory.annotation.Autowired
/**
 * Created by linuke on 2014/10/28.
 */

class GroovyManager implements Manager {

    @Autowired
    BookService bookService;

    void run(){
        for (int i = 0; i < 5; i++) {
            println bookService.getName(i)
        }
    }
}