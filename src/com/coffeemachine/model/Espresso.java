package com.coffeemachine.model;

public class Espresso implements Beverage{
    private static final Recipe RECIPE = new Recipe(50, 0, 18);

    @Override
    public String name() {
        return "Espresso";
    }

    @Override
    public Recipe recipe() {
        return RECIPE;
    }
}
