package com.example.demo.Controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Day {
	@Value("${var}")
  private String name;
   @GetMapping("/")
   public String display()
   {
	   return "WELCOME TO THIS "+name; 
   }
   
}
