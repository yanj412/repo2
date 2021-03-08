package com.yanj.controller;

import com.yanj.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.util.Map;

@Controller
@SessionAttributes({"user","msg"})
public class zhujieController {

    @RequestMapping("/test_RequestParam")
    public String test_RequestParam(@RequestParam(name = "name",required = false) String uname){
        System.out.println(uname);
        return "success";
    }

    @RequestMapping("/test_RequestBody")
    public String test_RequestBody(@RequestBody(required = false)String body){
        System.out.println(body);
        return "success";
    }

    /**
     * 使用restful风格编码
     * 请求地址都是一样的， 但是请求方式不一样，get，post，put，delete等
     * 为了区分findAll，findById，出现了PathVariable注解，
     * /find  与   /find/{id}
     * @param id
     * @return
     */
    @RequestMapping("/test_PathVaribale/{id}")
    public String test_PathVaribale(@PathVariable("id") String id){
        System.out.println(id);
        return "success";
    }

    /*
     获取请求头的某个值
     */
    @RequestMapping("/test_RequestHeader")
    public String test_RequestHeader(@RequestHeader("accept")String xx){
        System.out.println(xx);
        return "success";
    }

    /**
     * 浏览器向服务器发送请求时，会在服务器创建一个session空间，然后 session会以cookie的形式，将值传递过来
     */
    @RequestMapping("/test_cookie")
    public String test_cookieValue(@CookieValue("JSESSIONID") String cookievalue ,@ModelAttribute("aaa") User user)
    {
        System.out.println(cookievalue);
        System.out.println(user.toString());
        return "success";
    }

    @RequestMapping("/test_modelattribute")
    public String test_modelattribute(@ModelAttribute("aaa") User user)
    {
        System.out.println(user);
        return "success";
    }

    /**
     * 先执行，在进入其他
     * @param uid
     * @param map
     */
    @ModelAttribute
    public void findone(String uid, Map<String, User> map){
         User user=new User();
         user.setUid(2);
         user.setName("小红");
         user.setAddress("地址");
         user.setSex("女性");
         map.put("aaa",user);
    }

    @RequestMapping("/test_sessionAttribute")
    public String testSessionAttribure(Model model){
        System.out.println("向request域中存入");
        model.addAttribute("user","小红");
        model.addAttribute("msg","打开窗户");
        return "success";
    }

    @RequestMapping("/get_sessionAttribute")
    public String getSessionAttribure(ModelMap modelMap){
        String user=(String)modelMap.get("user");
        System.out.println(user);
        return "success";
    }

    @RequestMapping("/delete_sessionAttribute")
    public String deleteSessionAttribure(SessionStatus sessionStatus){
        sessionStatus.setComplete();

        return "success";
    }



}
