package com.example.controller;
import com.example.domain.Good;
import com.example.domain.Role;
import com.example.repos.GoodRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
@Controller
@RequestMapping("/good")
public class GoodController {
    @Autowired
    private GoodRepo goodRepo;

    @GetMapping
    public String goodList(Model model) {
        model.addAttribute("goods", goodRepo.findAll());
        return "good";
    }

    @GetMapping("{good}")
    public String userEditForm(@PathVariable Good good,
                               Model model) {
        model.addAttribute("good", good);
        return "good";
    }

    @PostMapping
    public String goodSave(
            @RequestParam String goodName,
            @RequestParam Map<String, String> form,
            @RequestParam("goodId") Good good
    ) {
        good.setGoodName(goodName);

        Set<String> roles = Arrays.stream(Role.values())
                .map(Role::name)
                .collect(Collectors.toSet());
        goodRepo.save(good);
        return "redirect:/good";
    }
}
