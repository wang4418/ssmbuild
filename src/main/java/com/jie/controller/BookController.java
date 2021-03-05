package com.jie.controller;

import com.jie.pojo.Books;
import com.jie.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:BookController
 * Package:com.jie.controller
 * Description:每一个牛B的人物都有一段苦B的岁月，只要像傻B一样坚持，终将会牛B！
 *
 * @date:2021/3/3 11:35
 * @author:VX438364246
 */
@Controller
@RequestMapping("/book")
public class BookController {
    //controller 调用service
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    //查询全部书籍，返回一个书籍展示页面
    @RequestMapping("/allBook")
    public String list(Model model) {
        // System.out.println(model);
        List<Books> list = bookService.queryAllBooks();
        model.addAttribute("list", list);
        return "allBook";
    }

    //跳转到书籍增加页面
    @RequestMapping("/toAddPaper")
    public String toAddPaper() {
        return "addBook";
    }

    //添加书籍的请求
    @RequestMapping("/addBook")
    public String addBook(Books books) {
        //System.out.println("addBook=>"+books);
        bookService.addBook(books);
        return "redirect:/book/allBook";//重定向请求 @RequestMapping("/allBook")
    }

    //跳转到修改页面
    @RequestMapping("/toUpdateBook")
    public String toUpdatePaper(Model model, int id) {
        Books books = bookService.queryBookById(id);
        //System.out.println(books);
        model.addAttribute("book", books);
        return "updateBook";
    }

    //修改书籍
    @RequestMapping("/updateBook")
    public String updateBook(Books books) {
        //System.out.println("updateBooks=>"+books);
        bookService.updateBook(books);
        return "redirect:/book/allBook";
    }

    //删除书籍
    @RequestMapping("/deleteBook/{bookId}")
    public String deleteBook(@PathVariable("bookId") int id) {
        // System.out.println("int的id：=》"+id);
        bookService.deleteBookById(id);
        return "redirect:/book/allBook";
    }

    //查询书籍
    @RequestMapping("/queryBook")
    public String queryBook(String queryBookName, Model model) {
        Books books = bookService.queryBookByName(queryBookName);
        List<Books>list=new ArrayList<Books>();
        list.add(books);
        System.out.println(books);
        if (books==null){
            list=bookService.queryAllBooks();
            model.addAttribute("error","没查询到书籍");
        }
        model.addAttribute("list",list);
        return "allBook";
    }

}
