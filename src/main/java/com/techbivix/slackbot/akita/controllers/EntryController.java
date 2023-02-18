package com.techbivix.slackbot.akita.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntryController {
  @GetMapping("/")
  ResponseEntity<String> home(){
    return ResponseEntity.ok().body("Tá funfando fiote!");
  }
}
