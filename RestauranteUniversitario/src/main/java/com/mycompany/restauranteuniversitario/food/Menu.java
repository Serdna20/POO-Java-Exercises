package com.mycompany.restauranteuniversitario.food;
import com.mycompany.restauranteuniversitario.values.DishType;
import java.util.ArrayList;

public class Menu {
    private ArrayList<Dish> dishList;

    public Menu() {
        this.dishList = new ArrayList<>();
    }    
    
    public Menu(ArrayList<Dish> dishList) {
        this.dishList = dishList;
    }
    
    public void addDish(Dish dish) {
        this.dishList.add(dish);
    }
    
    public ArrayList<String> getDishesPerType(DishType dishType) {
        // ArrayList<Dish> foundDishes = new ArrayList<>();
        ArrayList<String> foundDishes = new ArrayList<>();
        for (Dish dish : dishList) {
            if (dish.getType() == dishType && dish.getQuantity() > 0) {
                foundDishes.add(dish.getName());
            }
        }
        
        return foundDishes;
    }
    
    public void getMenu() {
        System.out.println("Menu disponible:");
        for (DishType dishType : DishType.values()) {
            checkDishAmount(""+dishType, getDishesPerType(dishType));
        }
        // checkDishAmount("Desayunos", getDishesPerType(DishType.BREAKFAST));
        // checkDishAmount("Almuerzos", getDishesPerType(DishType.LUNCH));
        // checkDishAmount("Cenas", getDishesPerType(DishType.DINNER));
    }
    
    void checkDishAmount(String output, ArrayList<String> arrayToPrint) {
        if (arrayToPrint.isEmpty()) {
            System.out.println("There's no "+output.toLowerCase());
        }
        else {
            System.out.println(output);
            System.out.println(arrayToPrint);
        }
    }
}
