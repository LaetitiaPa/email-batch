package com.test.emailbatch.service;

import com.test.emailbatch.beans.LendingBean;
import com.test.emailbatch.proxies.ReminderProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

@Service
public class UpdateTagService {

    @Autowired
    ReminderProxy reminderProxy;



}
