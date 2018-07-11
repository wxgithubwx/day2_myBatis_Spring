package dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import pojo.Book;

import java.util.List;

public class BookDaoImpl extends SqlSessionDaoSupport implements BookDao {


    @Override
    public Book findBookById(Integer id) {
        //sqlSession 是线程不安全的 , 所以它的最佳使用范围在方法体内
        SqlSession sqlSession = this.getSqlSession();
        Book book = sqlSession.selectOne("findBookById", id);
        /*if(sqlSession!=null){
            sqlSession.close();
        }*/  //为啥不可以关闭
        return book;
    }

}
