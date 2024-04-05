package com.natwest.service;

import com.natwest.entity.CurrencyType;
import com.natwest.entity.User;
import com.natwest.exception.InsufficeintBalanceException;
import com.natwest.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class CurrencyExchangeServiceImplTest {

    @Mock
    UserRepository userRepository;
    @InjectMocks
    CurrencyExchangeServiceImpl currencyExchangeService;

    @Mock
    User user;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void withdraw() throws InsufficeintBalanceException {
        User su=new User("abc@123.gmail.com", CurrencyType.EUR, BigDecimal.valueOf(1200.0));
        User tu=new User("xyz@123.gmail.com",CurrencyType.INR,BigDecimal.valueOf(1000.0));
//        CurrencyExchangeServiceImpl csi=new CurrencyExchangeServiceImpl();

//        when(csi.checkCurrency(CurrencyType.USD,CurrencyType.INR,BigDecimal.valueOf(1)))
//                .thenReturn(BigDecimal.valueOf(83.2));
        su.setBalance(su.getBalance().subtract(BigDecimal.valueOf(1)));
        tu.setBalance(tu.getBalance().add(BigDecimal.valueOf(83.2)));
//        when(userRepository.save(su)).thenReturn(su);
//        when(userRepository.save(tu)).thenReturn(tu);
//        when(su.setBalance(su.getBalance().subtract(BigDecimal.valueOf(1)))).thenReturn(true);
        assertEquals(BigDecimal.valueOf(1199.0),su.getBalance());
        assertEquals(BigDecimal.valueOf(1083.2),tu.getBalance());
        assertTrue(currencyExchangeService.withdraw(su,tu,BigDecimal.valueOf(1)));
    }

    @Test
    void deposit() {
        User tu=new User("xyz@123.gmail.com",CurrencyType.INR,BigDecimal.valueOf(1000.0));
//        tu.setBalance(tu.getBalance().add(BigDecimal.valueOf(83.2)));
//        assertEquals(BigDecimal.valueOf(1083.2),tu.getBalance());
        assertEquals(currencyExchangeService.deposit(tu,BigDecimal.valueOf(83.2)),BigDecimal.valueOf(1083.2));
    }

    @Test
    void europianCurrencyExchange() {
        BigDecimal amount=BigDecimal.valueOf(2);
        assertEquals(currencyExchangeService.europianCurrencyExchange(CurrencyType.USD,amount),BigDecimal.valueOf(2.16));
        assertEquals(currencyExchangeService.europianCurrencyExchange(CurrencyType.INR,amount),BigDecimal.valueOf(166.4));
        assertEquals(currencyExchangeService.europianCurrencyExchange(CurrencyType.AUD,amount),BigDecimal.valueOf(3.32));
        assertEquals(currencyExchangeService.europianCurrencyExchange(CurrencyType.JPY,amount),BigDecimal.valueOf(326.6));
        assertEquals(currencyExchangeService.europianCurrencyExchange(CurrencyType.EUR,amount),BigDecimal.valueOf(2));

    }

    @Test
    void checkCurrency() {
    }

    @Test
    void australianCurrencyExchange() {
        BigDecimal amount=BigDecimal.valueOf(1);
        assertEquals(currencyExchangeService.australianCurrencyExchange(CurrencyType.INR,amount),BigDecimal.valueOf(53.13));
        assertEquals(currencyExchangeService.australianCurrencyExchange(CurrencyType.EUR,amount),BigDecimal.valueOf(1.20));
        assertEquals(currencyExchangeService.australianCurrencyExchange(CurrencyType.USD,amount),BigDecimal.valueOf(0.65));
        assertEquals(currencyExchangeService.australianCurrencyExchange(CurrencyType.JPY,amount),BigDecimal.valueOf(98.27));
        assertEquals(currencyExchangeService.australianCurrencyExchange(CurrencyType.AUD,amount),BigDecimal.valueOf(1));
    }

    @Test
    void japanieseCurrencyExchange() {

        BigDecimal amount=BigDecimal.valueOf(3);
        assertEquals(currencyExchangeService.japanieseCurrencyExchange(CurrencyType.INR,amount),BigDecimal.valueOf(1.65));
        assertEquals(currencyExchangeService.japanieseCurrencyExchange(CurrencyType.EUR,amount),BigDecimal.valueOf(0.0183));
        assertEquals(currencyExchangeService.japanieseCurrencyExchange(CurrencyType.USD,amount),BigDecimal.valueOf(0.0198));
        assertEquals(currencyExchangeService.japanieseCurrencyExchange(CurrencyType.JPY,amount),BigDecimal.valueOf(3));
        assertEquals(currencyExchangeService.japanieseCurrencyExchange(CurrencyType.AUD,amount),BigDecimal.valueOf(0.030));

    }

    @Test
    void USCurrencyExchange() {
        BigDecimal amount=BigDecimal.valueOf(3);
        assertEquals(currencyExchangeService.USCurrencyExchange(CurrencyType.INR,amount),BigDecimal.valueOf(250.11));
        assertEquals(currencyExchangeService.USCurrencyExchange(CurrencyType.EUR,amount),BigDecimal.valueOf(2.79));
        assertEquals(currencyExchangeService.USCurrencyExchange(CurrencyType.USD,amount),BigDecimal.valueOf(3));
        assertEquals(currencyExchangeService.USCurrencyExchange(CurrencyType.JPY,amount),BigDecimal.valueOf(454.05));
        assertEquals(currencyExchangeService.USCurrencyExchange(CurrencyType.AUD,amount),BigDecimal.valueOf(4.62));

    }

    @Test
    void indianCurrencyExchange() {
        BigDecimal amount=BigDecimal.valueOf(4);
        assertEquals(currencyExchangeService.indianCurrencyExchange(CurrencyType.INR,amount),BigDecimal.valueOf(4));
        assertEquals(currencyExchangeService.indianCurrencyExchange(CurrencyType.EUR,amount),BigDecimal.valueOf(360.76));
        assertEquals(currencyExchangeService.indianCurrencyExchange(CurrencyType.USD,amount),BigDecimal.valueOf(332.8));
        assertEquals(currencyExchangeService.indianCurrencyExchange(CurrencyType.JPY,amount),BigDecimal.valueOf(2.20));
        assertEquals(currencyExchangeService.indianCurrencyExchange(CurrencyType.AUD,amount),BigDecimal.valueOf(209.68));

    }

    @Test
    void addUser() {
    }
}