package com.example.api_motivation_jules_g_2024.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.api_motivation_jules_g_2024.models.Quote;

@Repository
public interface QuoteRepository extends JpaRepository<Quote, Long> {
}
