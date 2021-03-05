package com.jie.dao;

import com.jie.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ClassName:BookMapper
 * Package:com.jie.dao
 * Description:每一个牛B的人物都有一段苦B的岁月，只要像傻B一样坚持，终将会牛B！
 *
 * @date:2021/3/2 15:43
 * @author:VX438364246
 */
public interface BookMapper {
    //增加一本书
    int addBook(Books books);
    //删除一本书
    int deleteBookById(@Param("bookId") int id);
    //修改一本书
    int updateBook(Books books);
    //查询一本书
    Books queryBookById(@Param("bookId") int id);
    //查询全部书
    List<Books> queryAllBooks();
    //根据书名查询书
    Books queryBookByName(@Param("bookName") String Name);

}
