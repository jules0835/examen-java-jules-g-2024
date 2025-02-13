package com.example.api_motivation_jules_g_2024.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api_motivation_jules_g_2024.models.Quote;
import com.example.api_motivation_jules_g_2024.services.QuoteService;

@RestController
@RequestMapping("/api/quotes")
@CrossOrigin(origins = "*")
public class QuoteController {

    @Autowired
    private QuoteService quoteService;

    @GetMapping("/get")
    public Quote getRandomQuote() {
        return quoteService.getRandomQuote();
    }

    @PostMapping("/add")
    public Quote addQuote(@RequestBody Quote quote) {
            System.out.println("---------------------------------------------------------------------");

      System.out.println(quote);
        return quoteService.addQuote(quote);
    }
}
