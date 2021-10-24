package com.surendiran.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@Controller
public class WebController {

    //create a mapping for "/hello"
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("today", new Date());
        return "index";
    }
}
