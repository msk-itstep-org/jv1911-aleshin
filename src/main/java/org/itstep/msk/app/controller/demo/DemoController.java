package org.itstep.msk.app.controller.demo;

import org.itstep.msk.app.entity.User;
import org.itstep.msk.app.entity.enums.Role;
import org.itstep.msk.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.security.Principal;
import java.util.*;

@Controller
@RequestMapping("/")
public class DemoController {
    CharSequence charSequence = "123456";
    @Autowired
    BCryptPasswordEncoder passwordEncoder;

    @Autowired
    UserRepository userRepository;


    @GetMapping("/")
    public String demo(Model model ) {
        return "demo";
    }

    @GetMapping("/login")
    public String login(){
        User user = new User();
        user.setUsername("qwe");
        user.setPassword(passwordEncoder.encode(charSequence));
        user.getRoles().add(Role.ROLE_USER);
        user.setId(1);
        userRepository.save(user);
        userRepository.flush();
        return "login";
    }

    @GetMapping("/admin")
    public String admin(){
        return "admin";
    }

    @GetMapping("/user")
    public String user() {
        return "user";
    }

    @GetMapping("/registration") // http://localhost:9999/registration?same=true
    public String registration(@RequestParam(defaultValue = "false") String same, Model model) {
        model.addAttribute("same", same.equalsIgnoreCase("true"));
        return "registration";
    }

    @PostMapping("/registration")
    public String register(@ModelAttribute User user) throws Exception {
        User same = userRepository.findByUsername(user.getUsername());
        if (same != null) {
            return "redirect:/registration?same=true";
        }

        user.getRoles().add(Role.ROLE_USER);
        user.setPassword(
                passwordEncoder.encode(user.getPassword())
        );

        userRepository.save(user);
        userRepository.flush();
        return "redirect:/login";
    }


}
