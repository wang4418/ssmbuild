package com.jie.service;

import com.jie.dao.BookMapper;
import com.jie.pojo.Books;

import java.util.List;

/**
 * ClassName:BookServiceImpl
 * Package:com.jie.service
 * Description:每一个牛B的人物都有一段苦B的岁月，只要像傻B一样坚持，终将会牛B！
 *
 * @date:2021/3/2 16:34
 * @author:VX438364246
 */
public class BookServiceImpl implements BookService {
    //业务层调用逻辑层
    //service调用dao层：组合dao
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Books> queryAllBooks() {
        return bookMapper.queryAllBooks();
    }
}
