package com.greenfox.firstwebshop.controller;

import com.greenfox.firstwebshop.model.ItemList;
import com.greenfox.firstwebshop.model.ShopItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
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
        model.addAttribute("itemList", priceAscending());
        return "index";
    }

    private List<ShopItem> priceAscending() {
        return itemList.getItemList()
                .stream()
                .sorted(Comparator.comparingDouble(ShopItem::getPrice))
                .collect(Collectors.toList());
    }

    @GetMapping("/contains-nike")
    public String containsNike(Model model){
        model.addAttribute("itemList", containsNike());
        return "index";
    }

    private List<ShopItem> containsNike() {
        return itemList.getItemList()
                .stream()
                .filter(s -> s.getName().contains("Nike") || s.getDescription().contains("Nike"))
                .collect(Collectors.toList());
    }





    @GetMapping("/most-expensive-available")
    public String mostExpensiveAvailable(Model model){

        model.addAttribute("itemList", itemList.getItemList());
        return "index";
    }

    private List<ShopItem> organisePriceDescending() {
        return itemList.getItemList()
                .stream()
                .sorted((ShopItem item1, ShopItem item2) -> item2.getPrice().compareTo(item1.getPrice()))
                .collect(Collectors.toList());
    }


    //SEARCH

    @PostMapping("/search")
    public String search(@RequestParam String search, Model model) {
        model.addAttribute("itemList", searchFuntion(search));
        return "index";
    }

    private List<ShopItem> searchFuntion(String search) {
        return itemList.getItemList()
                .stream()
                .filter(s -> s.getName().contains(search) || s.getDescription().contains(search))
                .collect(Collectors.toList());

    }

}
