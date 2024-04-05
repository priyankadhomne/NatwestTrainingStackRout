package org.example.service;

import org.example.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountService {

    @Autowired
    AccountDao accountDao;
    public void CreateAccountInService() {
        accountDao.createAccount();
        System.out.println("Business logic");
    }
}
