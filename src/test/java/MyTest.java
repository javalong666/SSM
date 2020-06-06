import com.llb.pojo.Books;
import com.llb.service.BookService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 风华绝代吴彦祖
 * @version 1.0
 * @Data 2020-06-06 16:19:14
 */
public class MyTest {
    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImpl= (BookService) context.getBean("BookServiceImpl");
    for (Books books : bookServiceImpl.queryAllBook()) {
      System.out.println(books);
    }
    }
}
