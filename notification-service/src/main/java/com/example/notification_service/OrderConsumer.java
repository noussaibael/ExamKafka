package com.example.notification_service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class OrderConsumer {

    private final NotificationService notificationService;

    public OrderConsumer(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @KafkaListener(topics = "order-topic", groupId = "notification-group")
    public void consumeOrderEvent(OrderEvent orderEvent) {
        System.out.println("Message reçu depuis Kafka: " + orderEvent);
        notificationService.sendNotification(orderEvent);
    }
}
