package com.test.emailbatch.service;
import com.test.emailbatch.beans.ReminderBean;
import com.test.emailbatch.proxies.ReminderProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SendEmailService{

    @Autowired
    private JavaMailSender javaMailSender;

    @Autowired
    ReminderProxy proxy;



}
