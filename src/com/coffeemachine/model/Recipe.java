package com.coffeemachine.model;

public record Recipe(int waterMl, int milkMl, int coffeeGrams) {
    public Recipe {
        if (waterMl < 0 || milkMl < 0 || coffeeGrams < 0){
            throw new IllegalArgumentException("Quantidades de ingredientes não podem ser negativas.");
        }
    }
}
