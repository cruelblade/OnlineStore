package com.gorodovikov.OnlineStore.controllers;

import com.gorodovikov.OnlineStore.dao.StoreDAO;
import com.gorodovikov.OnlineStore.models.Product;
import com.gorodovikov.OnlineStore.services.StoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/store")
public class StoreController {

    private final StoreService storeService;

    @GetMapping()
    public String index (Model model){
        model.addAttribute("products", storeService.findAllProducts());
        return "store/index";
    }

    @GetMapping("/template")
    public String template (Model model){
        model.addAttribute("products", storeService.findAllProducts());
        return "store/template";
    }
}
