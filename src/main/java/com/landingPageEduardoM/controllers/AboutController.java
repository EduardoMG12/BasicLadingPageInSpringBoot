package com.landingPageEduardoM.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneOffset;

@Controller
public class AboutController {

    @GetMapping("about")
    public ModelAndView about(){
        var now = LocalDate.now(ZoneOffset.UTC);
        var bornDate = LocalDate.of(2002,11,12);
        var age = Period.between(now, bornDate).getYears();
        var modelAndView = new ModelAndView();
        modelAndView.addObject("age", age);
        modelAndView.setViewName("about.jsp");
        return modelAndView;
    }
}
