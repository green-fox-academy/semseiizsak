package com.greenfox.bankofsimba.controller;

import com.greenfox.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class LionKingBankController {

    private List<BankAccount> bankAccountList = new ArrayList<>();

    public LionKingBankController() {
        bankAccountList.add(new BankAccount("Simba" , "+", 2000.00, "Zebra", "lion", true));
        bankAccountList.add(new BankAccount("Zordon" , "+", 18.05, "Mice", "lion", false));
        bankAccountList.add(new BankAccount("Zazu" , "+", 1520.50, "Insect", "hornbill", false));
        bankAccountList.add(new BankAccount("Rafiki" , "+", 300.00, "Banana", "mandrill", false));
        bankAccountList.add(new BankAccount("Timon" , "+", 1100.05, "Bugs", "meerkat", false));
        bankAccountList.add(new BankAccount("Pumba" , "+", 900.50, "Bugs", "warhog", false));
    }

    @RequestMapping( path = "/show" , method = RequestMethod.GET)
    public String showAccount(Model model) {
        model.addAttribute("bankAccountList" , bankAccountList);
        return "index";
    }

    @GetMapping("/enjoy")
    public String enjoyText(){
        return "enjoy";
    }

    @RequestMapping("/account-table")
    public String accountTable(Model model){
        model.addAttribute("bankAccountList" , bankAccountList);
        return "account-table";
    }


}

