package com.natwest.exceptionhandler;

import com.natwest.exception.InsufficeintBalanceException;
import com.natwest.service.CurrencyExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @Autowired
    CurrencyExchangeService currencyExchangeService;

    @ExceptionHandler(InsufficeintBalanceException.class)
    public ResponseEntity<ErrorInfo> insufficeintBalance(InsufficeintBalanceException e){
        ErrorInfo errorInfo=new ErrorInfo(e.getMessage(), HttpStatus.BAD_REQUEST);
        return new ResponseEntity<>(errorInfo,HttpStatus.BAD_REQUEST);
    }
}
