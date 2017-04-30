/*
* Created at 14:49 on 30.04.17
*/
package com.example.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zzhao
 */
@RestController
public class GreetingsController {

  @Value("${greeting:hello}")
  private String greeting;

  @GetMapping("hi")
  public String greeting() {
    return this.greeting;
  }
}
