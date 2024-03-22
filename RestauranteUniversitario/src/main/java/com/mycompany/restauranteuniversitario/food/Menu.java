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
            if (dish.getType() == dishType) {
                foundDishes.add(dish.getName());
            }
        }
        
        return foundDishes;
    }
    
    public void getMenu() {
        System.out.println("Menu disponible:");
        checkDishAmount("Desayunos", getDishesPerType(DishType.BREAKFAST));
        checkDishAmount("Almuerzos", getDishesPerType(DishType.LUNCH));
        checkDishAmount("Cenas", getDishesPerType(DishType.DINNER));
    }
    
    void checkDishAmount(String output, ArrayList<String> arrayToPrint) {
        if (arrayToPrint.size()>0) {
            System.out.println(output);
            System.out.println(arrayToPrint);
        }
        else {
            System.out.println("No hay "+output);
        }
    }
}
