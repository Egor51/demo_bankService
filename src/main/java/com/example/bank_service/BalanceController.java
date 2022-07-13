package com.example.bank_service;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;


    @AllArgsConstructor
    @RestController("/balance")
    public class BalanceController {

        private BankService bankService;

        @GetMapping("/{accountId}")
        public BigDecimal getBalance(@PathVariable Long accountId){
            return bankService.grtBalance(accountId);
        }

        @PostMapping("/add")
        public BigDecimal addMoney(@RequestBody TransferBalance transferBalance ){
            return bankService.addMoney(transferBalance.getTo(),transferBalance.getAmount());
        }

        @PostMapping("/transfer")
        public void transfer(@RequestBody TransferBalance transferBalance){
            bankService.makeTransfer(transferBalance);
        }
    }


