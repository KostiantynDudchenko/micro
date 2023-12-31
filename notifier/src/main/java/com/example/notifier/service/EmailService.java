package com.example.notifier.service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailService {

    private final JavaMailSender emailSender;

    public EmailService(JavaMailSender emailSender) {

        this.emailSender = emailSender;
    }

    public void sendSimpleMessage(String subject, String text) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("noreply@baeldung.com");
        message.setTo("---");
        message.setSubject(subject);
        message.setText(text);
        emailSender.send(message);
    }
}
