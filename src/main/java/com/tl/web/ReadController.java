package com.tl.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author TL
 * @create 2020-05-31
 */
@Controller
public class ReadController {

    @GetMapping("read")
    public String read(){
        return "read";
    }
}
