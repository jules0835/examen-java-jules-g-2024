package com.example.api_motivation_jules_g_2024.services;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api_motivation_jules_g_2024.models.Quote;
import com.example.api_motivation_jules_g_2024.repository.QuoteRepository;

@Service
public class QuoteService {

    @Autowired
    private QuoteRepository quoteRepository;

    private final Random random = new Random();

    public Quote getRandomQuote() {
        List<Quote> quotes = quoteRepository.findAll();
        if (quotes.isEmpty()) {
            return new Quote("Aucune citation trouve !");
        }
        return quotes.get(random.nextInt(quotes.size()));
    }

    public Quote addQuote(Quote quote) {
        return quoteRepository.save(quote);
    }
}
