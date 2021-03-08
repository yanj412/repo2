package com.yanj.controller;


import com.yanj.domain.Account;
import com.yanj.domain.Account_2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class helloController {


    @RequestMapping(path = "/hello",method = RequestMethod.GET )
    public String  sayHello(){
        System.out.println("你好啊");
        return "success";
    }

    @RequestMapping(path = "/haha")
    public String sayHaha(String name,String key){
        System.out.println("两个参数"+name+",,,"+key);
        return "haha";
    }

    @RequestMapping(path = "/haha_account")
    public String sayHaha2(Account account){
        System.out.println("Account"+account.toString());
        return "haha";
    }

    @RequestMapping(path = "/haha_account_list")
    public String sayHaha3(Account_2 account){
        System.out.println("Account"+account.toString());
        return "haha";
    }

    //获取封装的数据，封装的数据对象
    @RequestMapping("/fenzhuang")
    public String fenzhuang(Account_2 account_2){
        System.out.println(account_2);
        return "success";
    }

    //获取原生的servlet
    @RequestMapping("oldservlet")
    public String fenzhuang(HttpServletRequest request, HttpServletResponse response){
        System.out.println("执行了。。");
        System.out.println(request);

        HttpSession httpSession=request.getSession();
        System.out.println(httpSession);

        ServletContext servletContext=httpSession.getServletContext();

        System.out.println(response);
        return "success";
    }





}
