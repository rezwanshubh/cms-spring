package com.tartu.cmsspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
@RequestMapping("/welcome")
public class WelcomeController {

    @RequestMapping("/w")
    public String welcome() {
        //map.put("currentDate", new Date());
        return "welcome";
    }
}
