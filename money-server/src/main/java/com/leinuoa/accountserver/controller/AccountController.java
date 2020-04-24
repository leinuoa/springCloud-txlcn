package com.leinuoa.accountserver.controller;

import com.leinuoa.accountserver.model.AccountEntity;
import com.leinuoa.accountserver.service.AccountService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @RequestMapping("/add")
    public String createAccount(@RequestBody AccountEntity accountEntity){
        return accountService.createAccount(accountEntity);
    }
}
