package com.powek.web;

import com.powek.export.domain.Account;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @RequestMapping("/login")
    public Account login(String loginName, String pwd) {
        Account account = new Account();
        account.setLoginName(loginName);
        account.setPassword(pwd);
        return account;
    }
}
