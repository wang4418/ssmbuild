import com.jie.pojo.Books;
import com.jie.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName:MyTest
 * Package:PACKAGE_NAME
 * Description:每一个牛B的人物都有一段苦B的岁月，只要像傻B一样坚持，终将会牛B！
 *
 * @date:2021/3/3 14:10
 * @author:VX438364246
 */
public class MyTest {
    @Test
    public void test(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService=(BookService) context.getBean("BookServiceImpl");
        for (Books books : bookService.queryAllBooks()) {
            System.out.println(books);
        }



    }
}
