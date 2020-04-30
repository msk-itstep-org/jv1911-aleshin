package org.itstep.msk.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class DemoController {

    @Autowired
    PasswordEncoder passwordEncoder;

    @GetMapping("/")
    public String demo(Model model) {
        String a = passwordEncoder.encode("123");

        model.addAttribute("rd", passwordEncoder.matches("123",a));
        return "demo";
    }

}
