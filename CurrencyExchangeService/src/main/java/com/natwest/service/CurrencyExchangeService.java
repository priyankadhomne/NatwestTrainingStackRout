package com.natwest.service;


import com.natwest.entity.User;
import com.natwest.entity.CurrencyType;
import com.natwest.exception.InsufficeintBalanceException;

import java.math.BigDecimal;

public interface CurrencyExchangeService {

    User addUser(User user);

    boolean withdraw(User sourceUser,User targetUser, BigDecimal amount) throws InsufficeintBalanceException;
    BigDecimal deposit(User user,BigDecimal amount);


}
