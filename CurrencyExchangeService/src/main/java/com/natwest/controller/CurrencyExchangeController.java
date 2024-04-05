package com.natwest.controller;


import com.natwest.entity.User;
import com.natwest.exception.InsufficeintBalanceException;
import com.natwest.service.CurrencyExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CurrencyExchangeController {

    @Autowired
    CurrencyExchangeService currencyExchangeService;

    @PostMapping("/user")
    public ResponseEntity<User> postUser(@RequestBody User user){
        return new ResponseEntity<>(currencyExchangeService.addUser(user), HttpStatus.OK);
    }


    @GetMapping("/withdraw/{amount}")
    public ResponseEntity<Boolean> withdraw(@RequestBody List<User> users, @PathVariable BigDecimal amount) throws InsufficeintBalanceException {
            return new ResponseEntity<>(currencyExchangeService.withdraw(users.get(0),users.get(1),amount),HttpStatus.OK);

    }


}
