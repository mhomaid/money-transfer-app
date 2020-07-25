package com.yama.money.transfer.core.api;

import com.yama.money.transfer.core.api.model.Account;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class AccountController {

    @GetMapping("/account/retrieve/{accountId}")
    @ResponseBody
    public Account getAccountInfo (@PathVariable String accountId){
        Account account = new Account();
        if(account.getAccountId().equals(accountId)){
            return account;
        }
        return account;
    }

    @PostMapping("/account/add/{account}")
    @ResponseBody
    public String addNewAccount(@PathVariable String account){
        return "Status Success";
    }

    @PutMapping("/account/update/{accountId}")
    @ResponseBody
    public String updateNewAccount(@PathVariable() String account){
        return "AccountController Updated, Status -> Success";
    }

    @DeleteMapping("/account/delete/{accountId}")
    @ResponseBody
    public String deleteNewAccount(@PathVariable String account){
        return "AccountController deleted, Status -> Success";
    }
}
