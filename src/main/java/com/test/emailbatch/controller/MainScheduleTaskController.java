package com.test.emailbatch.controller;

import com.test.emailbatch.proxies.ReminderProxy;
import com.test.emailbatch.service.SendEmailService;
import com.test.emailbatch.service.UpdateTagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableScheduling
public class MainScheduleTaskController {

    @Autowired
    SendEmailService emailService;

    @Autowired
    ReminderProxy reminderProxy;

// Récupérer un utilisateur + envoie mail (peu importe l'état) + corps mail, à la date prévue
// plusieurs Utilisateurs
    // Plusieurs utilisateurs en retard

    @Scheduled(cron = "0 0/1 * 1/1 * ?")
    public void sendMail(){
        try {
            reminderProxy.updateTag();
            reminderProxy.addCustomerToReminderList();
            reminderProxy.sendEmail();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
