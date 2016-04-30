package com.example.controller;

import com.example.config.ImageServiceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private ImageServiceConfig imageServiceConfig;

    @RequestMapping(value = "/host")
    ResponseEntity<?> getHost() {
        return new ResponseEntity(imageServiceConfig.getHost(), HttpStatus.OK);
    }

    @RequestMapping(value = "/port")
    ResponseEntity<?> getPort() {
        return new ResponseEntity(imageServiceConfig.getPort(), HttpStatus.OK);
    }
}


