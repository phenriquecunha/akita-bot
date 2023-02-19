package com.techbivix.slackbot.akita.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/slack")
public class AkitaController {
  @PostMapping("/interactivity")
  public ResponseEntity<Object> interactiveComponents(@RequestBody Object object) {
    return ResponseEntity.ok().body(new Object() {
      public final String text = "lista de links";
    });
  }

  @PostMapping(value = "/slash",
  consumes = {"application/x-www-form-urlencoded;charset=UTF-8"})
  public ResponseEntity<Object> slashCommands(Object object){
    return ResponseEntity.ok().body(new Object() {
      public final Object response_type = "in_channel";
      public final Object text = "lista de links";
    });
  }

}
