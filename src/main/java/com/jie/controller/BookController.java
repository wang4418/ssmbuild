package com.jie.controller;

import com.jie.pojo.Books;
import com.jie.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public String list(Model model){
        List<Books> list = bookService.queryAllBooks();
        model.addAttribute("list",list);
        return "allBook";
    }

    //跳转到书籍增加页面
    @RequestMapping("/toAddPaper")
    public String toAddPaper(){
        return "addBook";
    }

}
