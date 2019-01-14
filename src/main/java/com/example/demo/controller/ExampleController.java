package com.example.demo.controller;

import com.example.demo.model.Account;
import com.example.demo.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class ExampleController {

    @Autowired
    private ExampleService exampleService;

    public ExampleController(ExampleService exampleService) {
        this.exampleService = exampleService;
    }

    @GetMapping("/{accountId}")
    public Optional<Account> getAccountData(@PathVariable String accountId) {
        return exampleService.getAccountData(accountId);
    }

    @PostMapping("")
    public void addAccount(@RequestBody Account account) {
        exampleService.addAccount(account);
    }

    @GetMapping("")
    public Iterable getAllAccounts() {
        return exampleService.getAllAccounts();
    }
}
