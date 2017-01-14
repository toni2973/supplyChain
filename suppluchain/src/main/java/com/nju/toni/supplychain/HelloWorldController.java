package com.nju.toni.supplychain;

/**
 * Created by toni on 1/13/17.
 */

        import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String helloWorld(){
        return "helloWorld";
    }
}