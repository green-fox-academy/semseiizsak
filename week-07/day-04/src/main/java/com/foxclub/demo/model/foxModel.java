package com.foxclub.demo.model;

import com.foxclub.demo.model.enums.Drink;
import com.foxclub.demo.model.enums.Food;
import com.foxclub.demo.model.enums.Tricks;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class foxModel {

    public String name;
    public Food food;
    public Drink drink;
    public Tricks trick;

    public foxModel(String name){
        this.name = name;
        food = Food.PIZZA;
        drink = Drink.BEER;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public Tricks getTrick() {
        return trick;
    }

    public void setTrick(Tricks trick) {
        this.trick = trick;
    }
}
