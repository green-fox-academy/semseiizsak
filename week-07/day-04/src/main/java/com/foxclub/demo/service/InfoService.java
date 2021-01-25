package com.foxclub.demo.service;

import com.foxclub.demo.model.enums.Drink;
import com.foxclub.demo.model.enums.Food;
import com.foxclub.demo.model.foxModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class InfoService {

    public List<foxModel> foxModelList = new ArrayList<>();

    public List<foxModel> getFoxModelList(){
        return foxModelList;
    }

    public foxModel getFox(String name) {
        return foxModelList.stream().filter(p -> p.getName().equals(name)).findFirst().orElse(null);
    }

    public List<String> getDrinkList() {
        return Arrays.stream(Drink.values())
                .map(Enum::toString)
                .map(s -> s.toLowerCase())
                .collect(Collectors.toList());
    }


    public List<String> getFoodList() {
        return Arrays.stream(Food.values())
                .map(Enum::toString)
                .map(s -> s.toLowerCase())
                .collect(Collectors.toList());
    }
}