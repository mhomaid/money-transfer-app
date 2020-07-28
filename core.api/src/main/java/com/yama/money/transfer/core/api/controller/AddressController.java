package com.yama.money.transfer.core.api.controller;

import com.yama.money.transfer.core.api.model.Account;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class AddressController {

    @GetMapping("/address/retrieve/{accountId}")
    @ResponseBody
    public Account getAddresss(@PathVariable String accountId){
        Account account = new Account();
        if(account.getAccountId().equals(accountId)){
            return account;
        }
        return account;
    }

    @PostMapping("/address/add/{addressId}")
    @ResponseBody
    public String updateAddress(@PathVariable String addressId){
        return "Status Success";
    }

    @PutMapping("/address/update/{addressId}")
    @ResponseBody
    public String updateNewAccount(@PathVariable() String address){
        return "AccountController Updated, Status -> Success";
    }

    @DeleteMapping("/address/delete/{addressId}")
    @ResponseBody
    public String deleteNewAccount(@PathVariable String address){
        return "AccountController deleted, Status -> Success";
    }
}
