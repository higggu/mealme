package com.example.mealme.controller.meal;

import com.example.mealme.service.meal.MealService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/meal/*")
@RequiredArgsConstructor
public class MealController {
    private final MealService mealService;

    @GetMapping("/myPage")
    public void myPage(){}
}