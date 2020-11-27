package com.lagou.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

/**
 * @author lyj
 * @Title: DemoController
 * @ProjectName springmvc-demo
 * @Description: TODO
 * @date 2020/6/9 21:21
 */
@Controller
@RequestMapping("/demo")
public class DemoController {
    /**
     * http://localhost:8080/demo/handle01
     */
    @RequestMapping("/handle01")
    public ModelAndView handle01(){
        Date date=new Date();

        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("date",date);
        modelAndView.setViewName("success");
        return modelAndView;
    }
}