package com.aws.example.resource;

import model.MessageModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class HelloResource {

    @GetMapping("/hello")
    public ResponseEntity<MessageModel> helloMessage() {
        return new ResponseEntity<>(new MessageModel("Hello"), HttpStatus.OK);
    }

    @GetMapping("/goodbye")
    public ResponseEntity<MessageModel> goodbyeMessage() {
        return new ResponseEntity<>(new MessageModel("Goodbye"), HttpStatus.OK);
    }

}
