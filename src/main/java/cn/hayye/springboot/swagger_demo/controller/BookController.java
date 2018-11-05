package cn.hayye.springboot.swagger_demo.controller;

import cn.hayye.springboot.swagger_demo.entity.AjaxResult;
import cn.hayye.springboot.swagger_demo.entity.Book;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/book")
@Api(value = "Book接口")
public class BookController {

    @RequestMapping(value = "/price",method = RequestMethod.GET)
    @ApiOperation(value="根据图书SN编码或书名获取图书价格", notes="返回JSON形式的图书属性包")
    @ApiResponses({
            @ApiResponse(code = 20000,message = "success"),
            @ApiResponse(code=50000,message = "异常信息")
    })
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query",name = "sn",value = "图书编号", required = false ,dataType = "String"),
            @ApiImplicitParam(paramType="query",name = "bookname",value = "书名", required = false ,dataType = "String")
    })
    public AjaxResult getBookPrice(@RequestParam(name = "sn",required = false) String sn,
                                   @RequestParam(name = "bookname",required = false)String bookname){
        if (sn!=null && !sn.equals("")){
            Book book = new Book(1,sn,"Java入门",88.88);
            return new AjaxResult.Builder().code(20000).message("ok").data(book).build();
        }
        if (bookname!=null && !bookname.equals("")){
            Book book = new Book(2,"0000000000",bookname,66.66);
            return new AjaxResult.Builder().code(20000).message("ok").data(book).build();
        }

        return new AjaxResult.Builder().code(20000).message("输入参数不能全为空！").data(null).build();
    }

    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public AjaxResult getAllBook(){
        List<Book> books = new ArrayList<>();
        Book book1 = new Book(1,"0000000000","Java入门",88.88);
        Book book2= new Book(2,"0000000001","Spring入门",66.66);
        books.add(book1);
        books.add(book2);
        return new AjaxResult.Builder().code(20000).message("输入参数不能全为空！").data(books).build();
    }
}
