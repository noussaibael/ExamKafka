package com.example.notification_service;

import com.example.notification_service.OrderEvent;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public void sendNotification(OrderEvent orderEvent) {
        System.out.println("Envoi d'une notification à l'utilisateur : " + orderEvent.getUserEmail());
        System.out.println("Détails de la commande : " + orderEvent.getOrderId() + ", Statut : " + orderEvent.getOrderStatus());

        //email-service

    }
}

