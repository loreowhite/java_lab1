package com.example.demo.controller;

import com.example.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static java.awt.SystemColor.text;

@Controller
public class PostsCreateController {
    @Autowired
    private PostService postService;

    @RequestMapping(path = "/new", method = RequestMethod.GET)
    public String createForm(Model model) {
        model.addAttribute("appName", "Мое супер приложение");
        return "create";
    }

    @RequestMapping(path = "/new", method = RequestMethod.POST)
    public String doCreate(@ModelAttribute("text") String text){
        postService.create(text);
        return "redirect:/";
    }
}