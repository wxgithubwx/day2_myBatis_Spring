package Test;

import dao.BookDao;
import dao.BookDaoImpl;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Book;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestBookDao {

    //dao方式
    @Test
    public void TestfindBookById(){

        ClassPathXmlApplicationContext ac =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bookDao = (BookDao)ac.getBean("bookDao");
        Book bookById = bookDao.findBookById(3);
        System.out.println(bookById.toString());
    }

}
