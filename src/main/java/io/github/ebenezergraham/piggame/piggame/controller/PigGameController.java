package io.github.ebenezergraham.piggame.piggame.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PigGameController {

        @Value("${spring.application.name}")
        String appName;
        public void log(){
            System.out.println(appName);
        }

        @GetMapping("/")
        public String homePage(Model model) {
            model.addAttribute("appName", appName);
            return "index";
        }
}
