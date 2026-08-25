package com.coffeemachine.model;

public class Latte implements Beverage{
    private static final Recipe RECIPE = new Recipe(40, 150, 14);

    @Override
    public String name() {
        return "Latte";
    }

    @Override
    public Recipe recipe() {
        return RECIPE;
    }
}
