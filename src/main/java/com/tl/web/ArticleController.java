package com.tl.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author TL
 * @create 2020-05-31
 */

@Controller
public class ArticleController {
    @RequestMapping("article")
    public String article() {
        System.out.println("博客访问");
        return "article";
    }
}
