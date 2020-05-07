package org.itstep.msk.app.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping("/")
    public String demo() {
        return "index";
    }

}
