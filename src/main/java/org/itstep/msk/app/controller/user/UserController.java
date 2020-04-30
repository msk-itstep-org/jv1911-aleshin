package org.itstep.msk.app.controller.user;

import org.itstep.msk.app.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/")
    public String user(@ModelAttribute User user, Model model){
        model.addAttribute("user", user);
        return "/user/user";
    }
}
