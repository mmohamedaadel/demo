package com.example.demo.service;

import com.example.demo.model.Account;
import com.example.demo.repository.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ExampleService {

    @Autowired
    private AccountRepo accountRepo;

    public ExampleService(AccountRepo accountRepo) {
        this.accountRepo = accountRepo;
    }

    public Optional<Account> getAccountData(String accountId) {
        Optional optional =  accountRepo.findById(accountId);
        return optional;
    }

    public void addAccount(Account account) {

        accountRepo.save(account);
    }

    public Iterable getAllAccounts() {

        return accountRepo.findAll();
    }
}
