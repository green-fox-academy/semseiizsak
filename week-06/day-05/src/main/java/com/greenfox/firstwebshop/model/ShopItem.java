package com.greenfox.firstwebshop.model;

public class ShopItem {
    private String name;
    private String description;
    private Integer price;
    //private String currency;
    private Integer quantityOfStock;

    //constructor

    public ShopItem(String name, String description, Integer price, Integer quantityOfStock) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantityOfStock = quantityOfStock;
    }

    //getters

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getQuantityOfStock() {
        return quantityOfStock;
    }

    //setters

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setQuantityOfStock(Integer quantityOfStock) {
        this.quantityOfStock = quantityOfStock;
    }

}
