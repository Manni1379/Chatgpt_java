package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;

@Controller
public class CalendarController {

    @GetMapping("/calendar")
    public String showCalendar(Model model) {
        LocalDate currentDate = LocalDate.now();
        model.addAttribute("currentDate", currentDate);
        return "calendar";
    }
}

