package com.mycompany.restauranteuniversitario.food;

import com.mycompany.restauranteuniversitario.values.DishType;

public class Dish {

    private DishType type;
    private String name;
    private String ingredients; // TODO: Convertir a lista
    private int price;
    private int quantity;

    public Dish(DishType type, String name, String ingredients, int price, int quantity) {
        this.type = type;
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
        this.quantity = quantity;
    }

    public DishType getType() {
        return type;
    }

    public String getName() {
        return name;
    }
    
    public String printDishInfo() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }  
    
        
}
