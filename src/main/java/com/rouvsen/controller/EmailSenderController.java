package com.rouvsen.controller;

import com.rouvsen.service.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailSenderController {

    @Autowired
    private EmailSenderService senderService;

    @GetMapping("/")
    public String greet(){
        return "Hi, maybe you wanted to go to localhost:8181/send";
    }

    @GetMapping("/send")
    public String sendEmail(){
        senderService.sendEmail(
                "to who? example@gmail.com",
                "subject? example",
                "message? example"
        );
        return "Mail sent successfully..";
    }

}
