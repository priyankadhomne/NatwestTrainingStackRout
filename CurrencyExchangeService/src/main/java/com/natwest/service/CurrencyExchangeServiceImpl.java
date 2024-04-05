package com.natwest.service;


import com.natwest.entity.CurrencyType;
import com.natwest.entity.User;
import com.natwest.exception.InsufficeintBalanceException;
import com.natwest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Currency;

import static com.natwest.entity.CurrencyType.AUD;
import static com.natwest.entity.CurrencyType.INR;

@Service
public class CurrencyExchangeServiceImpl implements CurrencyExchangeService {

    @Autowired
    UserRepository userRepository;


    @Override
    public boolean withdraw(User sourceUser, User targetUser, BigDecimal amount) throws InsufficeintBalanceException {
        User su = userRepository.findById(sourceUser.getEmailAddress()).get();
        User tu = userRepository.findById(targetUser.getEmailAddress()).get();

        CurrencyType targetCurrencyType = targetUser.getCurrencyType();
        CurrencyType sourceCurrencyType=sourceUser.getCurrencyType();

        BigDecimal amt = checkCurrency(sourceCurrencyType,targetCurrencyType, amount);
        BigDecimal bal = sourceUser.getBalance();

        double compare = bal.compareTo(amt);
        if (compare >= 0) {
            sourceUser.setBalance(bal.subtract(amt));
            targetUser.setBalance(deposit(targetUser, amt));

            userRepository.save(sourceUser);
//            userRepository.save(targetUser);
            return true;
        } else throw new InsufficeintBalanceException("Your bank balance in not sufficient for withdraw");
    }

    @Override
    public BigDecimal deposit(User user, BigDecimal amount) {
        user.setBalance(user.getBalance().add(amount));
        userRepository.save(user);
        return user.getBalance();
    }

    public BigDecimal europianCurrencyExchange(CurrencyType targetCurrency,BigDecimal amount){
        switch(targetCurrency){
                case INR:
                    return amount.multiply(BigDecimal.valueOf(83.2));
                case AUD:
                    return amount.multiply(BigDecimal.valueOf(1.66));
                case JPY:
                    return amount.multiply(BigDecimal.valueOf(163.30));
                case USD:
                    return amount.multiply(BigDecimal.valueOf(1.08));
                default:
                    return amount;
            }
    }

    public BigDecimal checkCurrency(CurrencyType targetCurrency, CurrencyType sourceCurrency,BigDecimal amount){
        switch (sourceCurrency) {
            case EUR:
                return europianCurrencyExchange(targetCurrency,amount);
            case AUD:
                return australianCurrencyExchange(targetCurrency,amount);
            case JPY:
                return japanieseCurrencyExchange(targetCurrency,amount);
            case USD:
                return USCurrencyExchange(targetCurrency,amount);
            case INR:
                return indianCurrencyExchange(targetCurrency,amount);
            default:
                return amount;
        }
    }

    public BigDecimal australianCurrencyExchange(CurrencyType targetCurrency,BigDecimal amount){
        switch(targetCurrency){
            case INR:
                return amount.multiply(BigDecimal.valueOf(53.13));
            case EUR:
                return amount.multiply(BigDecimal.valueOf(0.60));
            case JPY:
                return amount.multiply(BigDecimal.valueOf(98.27));
            case USD:
                return amount.multiply(BigDecimal.valueOf(0.65));
            default:
                return amount;
        }
    }

    public BigDecimal japanieseCurrencyExchange(CurrencyType targetCurrency,BigDecimal amount){
        switch(targetCurrency){
            case INR:
                return amount.multiply(BigDecimal.valueOf(0.55));
            case EUR:
                return amount.multiply(BigDecimal.valueOf(0.0061));
            case AUD:
                return amount.multiply(BigDecimal.valueOf(0.010 ));
            case USD:
                return amount.multiply(BigDecimal.valueOf(0.0066));
            default:
                return amount;
        }
    }

    public BigDecimal USCurrencyExchange(CurrencyType targetCurrency,BigDecimal amount){
        switch(targetCurrency){
            case INR:
                return amount.multiply(BigDecimal.valueOf(83.37));
            case EUR:
                return amount.multiply(BigDecimal.valueOf(0.93));
            case AUD:
                return amount.multiply(BigDecimal.valueOf(1.54));
            case JPY:
                return amount.multiply(BigDecimal.valueOf(151.35));
            default:
                return amount;
        }
    }

    public BigDecimal indianCurrencyExchange(CurrencyType targetAccountCurrency, BigDecimal amount) {
        switch (targetAccountCurrency) {
            case EUR:
                return amount.multiply(BigDecimal.valueOf(90.19));
            case AUD:
                return amount.multiply(BigDecimal.valueOf(52.42));
            case JPY:
                return amount.multiply(BigDecimal.valueOf(0.55));
            case USD:
                return amount.multiply(BigDecimal.valueOf(83.2));
            default:
                return amount;
        }
    }


    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

}