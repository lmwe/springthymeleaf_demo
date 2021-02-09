package com.lmlm.controller;

import com.lmlm.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

/**
 * @ClassName TestController
 * @Author: lmlm
 * @Description TODO
 * @date 2021/2/8 15:46
 * @Version 1.0
 */
@Controller
public class TestController {

    @RequestMapping("/hello")
    public String index(Model model){
        model.addAttribute("message","欢迎来到浮山县");
        return "index01";
    }
    @RequestMapping("findOne")
    public String findOne(Model model){
        User user = new User();
        user.setId(1L);
        user.setName("张三");
        user.setAge(18);

        Map<String,Object> map = new HashMap<>();
        map.put("id",2L);
        map.put("name","李四");
        map.put("age",35);


        model.addAttribute("user",user);
        model.addAttribute("map",map);
        return "index02";
    }
    @RequestMapping("/findAll")
    public String findAll(Model model){
        User user = new User();
        user.setId(1L);
        user.setName("张三");
        user.setAge(18);

        User user1 = new User();
        user1.setId(2L);
        user1.setName("李四");
        user1.setAge(19);

        User user2 = new User();
        user2.setId(3L);
        user2.setName("王五");
        user2.setAge(20);

        List<User> list = new ArrayList<>();
        list.add(user);
        list.add(user1);
        list.add(user2);
        model.addAttribute("list",list);
        return "index03";
    }
    @RequestMapping("/index04")
    public String index04(Model model){
        model.addAttribute("message","欢迎来到南位村");
        return "index04";
    }
    @RequestMapping("/index05")
    public String index05(Model model){
        model.addAttribute("flag","yes");
        model.addAttribute("menu","admin");
        model.addAttribute("manager","manager");
        return "index05";
    }
    @RequestMapping("/index06")
    public String index06(Model model){
        model.addAttribute("number",123.456);
        model.addAttribute("date",new Date());
        String str="Thymeleaf是Web和独立环境的现代服务器端Java模板引擎，能够处理HTML，XML，JavaScript，CSS甚至纯文本。\\r\\n\" + \n" +
                "\t  \t\t\"Thymeleaf的主要目标是提供一种优雅和高度可维护的创建模板的方式。为了实现这一点，它建立在自然模板的概念上，将其逻辑注入到模板文件中，不会影响模板被用作设计原型。这改善了设计的沟通，弥补了设计和开发团队之间的差距。\\r\\n\" + \n" +
                "\t  \t\t\"Thymeleaf也从一开始就设计了Web标准 - 特别是HTML5 - 允许您创建完全验证的模板，如果这是您需要的\\r\\n\" \n";
        model.addAttribute("str",str);
        return "index06";
    }
}
