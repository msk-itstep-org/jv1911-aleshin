package org.itstep.msk.app.controller.security;


import org.itstep.msk.app.entity.User;
import org.itstep.msk.app.entity.enums.Role;
import org.itstep.msk.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SecurityController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @GetMapping("/registration")
    public String registration (){
        return "/security/registration";
    }

    @PostMapping("/registration")
    public String registration(@ModelAttribute User user){
        User u = userRepository.findByUsername(user.getUsername());
        if(u != null){
            return "redirect:/registration";
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.getRoles().add(Role.ROLE_USER);
        userRepository.saveAndFlush(user);
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String login(){
        return "/security/login";
    }
    }
