package com.example.newpage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class NewpageController {
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
