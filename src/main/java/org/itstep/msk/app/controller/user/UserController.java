package org.itstep.msk.app.controller.user;

import org.itstep.msk.app.entity.Account;
import org.itstep.msk.app.entity.User;
import org.itstep.msk.app.repository.AccountRepository;
import org.itstep.msk.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    UserRepository userRepository;

    @GetMapping("/")
    public String user(Principal principal, Model model){
        User user = userRepository.findByUsername(principal.getName());
        List<Account> account = accountRepository.findByOwner(user);
//        System.out.println(account.size());
        model.addAttribute("accounts", account);
        return "/user/user";
    }
}
