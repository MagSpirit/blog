package com.tl.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author TL
 * @create 2020-05-31
 */
@Controller
public class LinkController {

    @GetMapping("link")
    public String link(){
        return "link";
    }

}
