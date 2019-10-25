package com.atguigu.thymleaf1;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Map;

@Controller
public class hellocontroller {

    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    @RequestMapping("/success")
    public String success(){
        return "success";
    }
   @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
