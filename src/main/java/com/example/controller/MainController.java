package com.example.controller;
import com.example.domain.*;
import com.example.repos.CartRepo;
import com.example.repos.GoodRepo;
import com.example.repos.OrdersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.io.IOException;
import java.util.Map;
@Controller
public class MainController {
    @Autowired
    private GoodRepo goodRepo;
    @Value("${download.path}")
    private String downloadPath;
    @Autowired
    private CartRepo cartRepo;
    @Autowired
    private OrdersRepo ordersRepo;
    @GetMapping("/")
    public String catalog(Model model) {
        Iterable<Good> goods = goodRepo.findAll();
        model.addAttribute("goods", goods);
        return "catalog";
    }
    @GetMapping("/confirm")
    public String confirm(Model model) {
        Iterable<Good> goods = goodRepo.findAll();
        model.addAttribute("goods", goods);
        return "confirm";
    }
    @GetMapping("/homePage")
    public String homePage(
            @AuthenticationPrincipal User user,
            Model model) {
        Iterable<Cart> carts = cartRepo.findAll();
        Iterable<Good> goods = goodRepo.findAll();
        Iterable<Orders> orders = ordersRepo.findAll();
        model.addAttribute("goods", goods);
        model.addAttribute("orders", orders);
        model.addAttribute("carts", carts);
        model.addAttribute("user", user);
        return "homePage";
    }
    @PostMapping("/") public String addCart(
            @AuthenticationPrincipal User user,
            @RequestParam Integer goodId, Map<String, Object> model) throws IOException {
        Cart cart = new Cart(user.getId(), goodId);
        cartRepo.save(cart);
        return "catalog";
    }
    @PostMapping("/homePage")
    public String addInf(
            @AuthenticationPrincipal User user,
            @RequestParam String text,
            @RequestParam String firstname, String secondname,
            String email, Long phone, Map<String, Object> model
    ) throws IOException {
        user.setinf(firstname, secondname, email, phone);
        return "homePage";
    }

}
