package com.coffeemachine.service;

import com.coffeemachine.model.Beverage;
import com.coffeemachine.model.Inventory;

public class CoffeMachine {
    private final Inventory inventory;

    public CoffeMachine(Inventory inventory){
        if(inventory == null){
            throw new IllegalArgumentException("O estoque não pode ser nulo.");
        }
        this.inventory = inventory;
    }

    public String brew(Beverage beverage){
        inventory.consume(beverage.recipe());
        return String.format("%s preparado com sucesso!", beverage.name());
    }
}
