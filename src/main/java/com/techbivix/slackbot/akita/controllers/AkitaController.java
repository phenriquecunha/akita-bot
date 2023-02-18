package com.techbivix.slackbot.akita.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/slack")
public class AkitaController {
  @PostMapping("/interactivity")
  public ResponseEntity<Object> InteractiveComponents(){
    return ResponseEntity.ok().body(new Object(){String text = "lista de links";});
  }
  @PostMapping("/slash")
  public ResponseEntity<Object> slashCommands(){
    return ResponseEntity.ok().body(new Object(){String text = "lista de links";});
  }
}
