package Test;

import mapper.BookMapper;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Book;

public class TestBookMapper {

    //mapper方式
    @Test
    public void TestfindBookById(){
        ClassPathXmlApplicationContext ac =
                new ClassPathXmlApplicationContext("applicationContext.xml");
       // BookMapper bookMapper =(BookMapper) ac.getBean("bookMapper");

       //扫描方式：
        BookMapper bookMapper = ac.getBean(BookMapper.class);
        Book bookById = bookMapper.findBookById(3);
        System.out.println(bookById.toString());

    }
}
