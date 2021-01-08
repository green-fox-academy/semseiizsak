package com.greenfox.firstwebshop.controller;

import com.greenfox.firstwebshop.model.ItemList;
import com.greenfox.firstwebshop.model.ShopItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Controller
public class webshopDefaultController {

    ItemList itemList = new ItemList();

    @GetMapping("/")
    public String webshop(Model model){
        model.addAttribute("itemList", itemList.getItemList());
        return "index";
    }

    @GetMapping("/only-available")
    public String onlyAvailable(Model model){
        List<ShopItem> availableItemList = itemList.getItemList().stream()
                .filter(item -> item.getQuantityOfStock()>0)
                .collect(Collectors.toList());
        model.addAttribute("itemList", availableItemList);
        return "index";
    }

    @GetMapping("/cheapest-first")
    public String cheapestFirst(Model model){
        List<ShopItem> cheapestFirstItemList = itemList.getItemList().stream()
                .sorted()
                .collect(Collectors.toList());
        model.addAttribute("itemList", cheapestFirstItemList);
        return "index";
    }

    @GetMapping("/contains-nike")
    public String containsNike(Model model){
        model.addAttribute("itemList", itemList.getItemList());
        return "index";
    }

    @GetMapping("/average-stock")
    public String averageStock(Model model){

        model.addAttribute("itemList", itemList.getItemList());
        return "index";
    }

    @GetMapping("/most-expensive-available")
    public String mostExpensiveAvailable(Model model){

        model.addAttribute("itemList", itemList.getItemList());
        return "index";
    }
}
