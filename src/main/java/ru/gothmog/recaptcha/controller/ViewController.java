package ru.gothmog.recaptcha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.gothmog.recaptcha.model.User;

@Controller
public class ViewController {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("user", new User());
        return "index";
    }
}
