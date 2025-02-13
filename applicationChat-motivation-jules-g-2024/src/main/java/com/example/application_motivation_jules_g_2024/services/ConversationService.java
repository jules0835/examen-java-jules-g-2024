package com.example.application_motivation_jules_g_2024.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.application_motivation_jules_g_2024.models.Conversation;
import com.example.application_motivation_jules_g_2024.repository.ConversationRepository;

@Service
public class ConversationService {
    private final ConversationRepository conversationRepository;
    private final RestTemplate restTemplate;

    public ConversationService(ConversationRepository conversationRepository) {
        this.conversationRepository = conversationRepository;
        this.restTemplate = new RestTemplate();
    }

    public Conversation saveConversation(String userName, String userMessage) {
        String quote = restTemplate.getForObject("http://localhost:8080/api/quotes/get", String.class);
        Conversation conversation = new Conversation(userName, userMessage, quote);
        return conversationRepository.save(conversation);
    }

    public List<Conversation> getConversationsByUser(String userName) {
        return conversationRepository.findByUserName(userName);
    }

    public List<String> getAllUsers() {
        return conversationRepository.findAll().stream()
                .map(Conversation::getUserName)
                .distinct()
                .collect(Collectors.toList());
    }
}
