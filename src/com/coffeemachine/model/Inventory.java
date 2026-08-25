package com.coffeemachine.model;

import com.coffeemachine.exception.InsufficientIngredientsException;

public class Inventory {

    private int waterMl;
    private int milkMl;
    private int coffeeGrams;

    public Inventory(int waterMl, int milkMl, int coffeeGrams) {
        this.waterMl = Math.max(0, waterMl);
        this.milkMl = Math.max(0, milkMl);
        this.coffeeGrams = Math.max(0, coffeeGrams);
    }

    public void consume(Recipe recipe){
        validateAvailability(recipe);

        this.waterMl -= recipe.waterMl();
        this.milkMl -= recipe.milkMl();
        this.coffeeGrams -= recipe.coffeeGrams();
    }

    private void validateAvailability(Recipe recipe) {
        if (this.waterMl < recipe.waterMl()){
            throw new InsufficientIngredientsException(
                    String.format("Água insuficiente. Necessário: %dml, Disponível: %dml", recipe.waterMl(), this.waterMl)
            );
        }
        if (this.milkMl < recipe.milkMl()) {
            throw new InsufficientIngredientsException(
                    String.format("Leite insuficiente. Necessário: %dml, Disponível: %dml", recipe.milkMl(), this.milkMl)
            );
        }
        if (this.coffeeGrams < recipe.coffeeGrams()) {
            throw new InsufficientIngredientsException(
                    String.format("Café insuficiente. Necessário: %dg, Disponível: %dg", recipe.coffeeGrams(), this.coffeeGrams)
            );
        }
    }

    public void addWater(int amount){
        if(amount > 0) this.waterMl += amount;
    }
    public void addMilk(int amount){
        if(amount > 0) this.milkMl += amount;
    }
    public void addCoffee(int amount){
        if(amount > 0) this.coffeeGrams += amount;
    }

    public int getWaterMl() {
        return waterMl;
    }
    public int getMilkMl() {
        return milkMl;
    }
    public int getCoffeeGrams() {
        return coffeeGrams;
    }
}
