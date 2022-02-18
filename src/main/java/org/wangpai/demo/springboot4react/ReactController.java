package org.wangpai.demo.springboot4react;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReactController {
    @GetMapping("/index")
    public String index(Model model) {
        return "build/index";
    }
}