package dao;



import pojo.Book;

import java.util.List;

public interface BookDao {
    public Book findBookById(Integer id);
   // public List<Book> findBookByName(String name);
}
