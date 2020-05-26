package com.test.emailbatch.proxies;

import com.test.emailbatch.beans.LendingBean;
import com.test.emailbatch.beans.ReminderBean;
import com.test.emailbatch.configuration.FeignClientConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.FeignClientProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@FeignClient(name = "library-api", url = "localhost:8088", configuration = FeignClientConfiguration.class)
public interface ReminderProxy {

    @RequestMapping(value = "/Reminders", method = RequestMethod.GET)
    List<ReminderBean> listReminder();

    @RequestMapping(value = "/Email", method = RequestMethod.GET)
    String findEmailByCustomerId(@RequestParam Long id);


    @RequestMapping(value = "/lendings", method = RequestMethod.GET)
    List<LendingBean> listLending();

    @RequestMapping(value = "/updates", method = RequestMethod.GET)
    void updateTag ();

    @RequestMapping(value = "/mail", method = RequestMethod.GET)
    void sendEmail ();

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    void addCustomerToReminderList();



}
