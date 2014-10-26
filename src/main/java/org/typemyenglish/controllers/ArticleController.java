package org.typemyenglish.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class ArticleController {

    @RequestMapping(value = "/", method = GET)
    String index() {
        return "index";
    }

    @RequestMapping(value = "/load-article", method = POST)
    String load(String url, Model model) {
        model.addAttribute("url", url);
        return "article";
    }
}