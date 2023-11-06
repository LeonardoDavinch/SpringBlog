package com.prof.blog.controlers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Головна");
        return "home";
    }
    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "Сторінка про мене");
        return "about";
    }

}