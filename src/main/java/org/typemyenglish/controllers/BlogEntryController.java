package org.typemyenglish.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BlogEntryController {

    @RequestMapping("/")
    String index() {
        return "index";
    }

}