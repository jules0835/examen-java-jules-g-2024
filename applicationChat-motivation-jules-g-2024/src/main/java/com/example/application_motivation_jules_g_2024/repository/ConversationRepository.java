package com.example.application_motivation_jules_g_2024.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.application_motivation_jules_g_2024.models.Conversation;

public interface ConversationRepository extends JpaRepository<Conversation, Long> {
    List<Conversation> findByUserName(String userName);
}
