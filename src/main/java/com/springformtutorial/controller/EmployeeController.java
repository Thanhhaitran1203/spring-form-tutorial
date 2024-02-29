package com.springformtutorial.controller;

import com.springformtutorial.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @GetMapping("/create")
    public ModelAndView showForm( ){
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("employee",new Employee());
        return modelAndView;
    }
    @PostMapping("/employee")
    public ModelAndView submit(@ModelAttribute("employee") Employee employee){
        ModelAndView modelAndView = new ModelAndView("info");
        modelAndView.addObject("employee",employee);
        return modelAndView;
    }
}
