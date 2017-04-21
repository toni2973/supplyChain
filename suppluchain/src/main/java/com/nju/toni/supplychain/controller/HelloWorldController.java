package com.nju.toni.supplychain.controller;

/**
 * Created by toni on 1/13/17.
 */

//        import com.nju.toni.supplychain.entity.User;
        import org.apache.catalina.servlet4preview.http.HttpServletRequest;
        import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
        import org.springframework.web.bind.annotation.ResponseBody;
        import org.springframework.web.servlet.ModelAndView;

        import javax.servlet.http.HttpServletResponse;
        import java.util.HashMap;
        import java.util.Map;

@Controller
public class HelloWorldController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String helloWorld(){
        return "helloWorld";
    }


    @RequestMapping(value = "login",method = RequestMethod.POST)
    @ResponseBody
    public  String login(){

        return "login";
    }
    @RequestMapping(value = "login.do",method = RequestMethod.POST)
    protected ModelAndView handleRequestInternal(HttpServletRequest request,
                                                 HttpServletResponse response) throws Exception {
        //不应该是这样写，但是这样看起来比较容易理解
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = getUser(username, password);
        //保存相应的参数，通过ModelAndView返回
        Map model=new HashMap();
        if(user !=null){
            model.put("user", user);
            return new ModelAndView("loginsuucce");
        }else{
            model.put("error", "用户名或密码输入错误！！！");
            return new ModelAndView("error");
        }
    }
    //为了方便直接写的验证方法
    public User getUser(String username,String password){
        if(username.equals("test") && password.equals("test")){
            return new User(username,password);
        }else{
            return null;
        }
    }
}