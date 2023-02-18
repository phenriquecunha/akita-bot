package com.techbivix.slackbot.akita.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient("https://hooks.slack.com/services/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")
public interface WebHook {
  @PostMapping("/")
  public String alert();

}
