package com.nju.toni.supplychain.controller;

import com.nju.toni.supplychain.entity.Audit;
import com.nju.toni.supplychain.service.AdminService;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by toni on 3/23/17.
 */
@Controller
public class AdminController {
    @Autowired
    private AdminService adminService;

    @RequestMapping("addAdmin")
    public ModelAndView register(String username,String password){
        Boolean result=adminService.addAdmin(username,password);
        if (result)return new ModelAndView("success.jsp");
        return new ModelAndView("fail.jsp");
    }
    @RequestMapping("addAuthentication")
    public ModelAndView addAuthentication(HttpServletRequest request, HttpServletResponse response){
        return new ModelAndView("");
    }
    @RequestMapping(value = "addAudit",method = RequestMethod.POST)
    public ModelAndView addAudit(Audit audit){

        return new ModelAndView("dd");
    }



}
