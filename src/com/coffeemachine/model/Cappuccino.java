package com.coffeemachine.model;

public class Cappuccino implements Beverage{
    private static final Recipe RECIPE = new Recipe(50, 100, 18);

    @Override
    public String name() {
        return "Cappuccino";
    }

    @Override
    public Recipe recipe() {
        return RECIPE;
    }
}
