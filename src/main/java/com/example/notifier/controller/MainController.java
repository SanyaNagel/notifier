package com.example.notifier.controller;

import com.example.notifier.handlers.MainControllerHandler;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/settings")
public class MainController {

    @Autowired
    MainControllerHandler mainControllerHandler;

    @PostMapping("/update/params/{NameAdmin}")
    public ResponseEntity<String> createRoom(@PathVariable("NameAdmin") String name, Model model){
        LogManager.getRootLogger().debug("Принят запрос на создание комнаты "+name);
        return new ResponseEntity("настройки приняты", HttpStatus.OK);
    }
}
