package com.example.application_motivation_jules_g_2024.models;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Conversation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userName;
    private String userMessage;
    private String responseMessage;
    private LocalDateTime timestamp;

    public Conversation() {
        this.timestamp = LocalDateTime.now();
    }

    public Conversation(String userName, String userMessage, String responseMessage) {
        this.userName = userName;
        this.userMessage = userMessage;
        this.responseMessage = responseMessage;
        this.timestamp = LocalDateTime.now();
    }

    public Long getId() { return id; }
    public String getUserName() { return userName; }
    public String getUserMessage() { return userMessage; }
    public String getResponseMessage() { return responseMessage; }
    public LocalDateTime getTimestamp() { return timestamp; }

    public void setUserName(String userName) { this.userName = userName; }
    public void setUserMessage(String userMessage) { this.userMessage = userMessage; }
    public void setResponseMessage(String responseMessage) { this.responseMessage = responseMessage; }
}
