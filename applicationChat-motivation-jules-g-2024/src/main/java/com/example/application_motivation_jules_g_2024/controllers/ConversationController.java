package com.example.application_motivation_jules_g_2024.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.application_motivation_jules_g_2024.models.Conversation;
import com.example.application_motivation_jules_g_2024.services.ConversationService;

@RestController
@RequestMapping("/api/conversations")
@CrossOrigin(origins = "*")
public class ConversationController {
    private final ConversationService conversationService;
    private final RestTemplate restTemplate;

    public ConversationController(ConversationService conversationService) {
        this.conversationService = conversationService;
        this.restTemplate = new RestTemplate();
    }

    @PostMapping("/new")
    public Conversation newConversation(@RequestParam String userName, @RequestParam String userMessage) {
        return conversationService.saveConversation(userName, userMessage);
    }

    @GetMapping("/user/{userName}")
    public List<Conversation> getUserConversations(@PathVariable String userName) {
        return conversationService.getConversationsByUser(userName);
    }

    @GetMapping("/users")
    public List<String> getAllUsers() {
        return conversationService.getAllUsers();
    }

    // cette partie ne fonctionne pas, pour la navigation nous allons donc utiliser la navigation avec admin.html...
    // @GetMapping("/admin")
    // public String showAdminPage(Model model) {
    //     return "admin";
    // }
}
