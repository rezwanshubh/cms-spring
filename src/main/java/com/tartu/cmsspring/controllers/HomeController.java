package com.tartu.cmsspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class HomeController {

    @RequestMapping("/index")
    @ResponseBody
    public ModelAndView index() {
        return new ModelAndView("index");
    }

    @RequestMapping("/welcome")
    public String welcome() {
        return "index";
    }
}
