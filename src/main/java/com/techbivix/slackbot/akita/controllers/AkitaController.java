package com.techbivix.slackbot.akita.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AkitaController {
//  @PostMapping("/interactivity")
//  public ResponseEntity<Object> InteractiveComponents(@RequestBody Object object) {
//    return ResponseEntity.ok().body(new Object() {
//      public final String text = "lista de links";
//    });
//  }

  @PostMapping("/**")
  public ResponseEntity<Object> slashCommands(@RequestBody Object object) {
    return ResponseEntity.status(200).body(new Object() {
      public final Object response_type = "in_channel";
      public final Object text = "lista de links";
    });
  }

}
