package com.coffeemachine;

import com.coffeemachine.exception.InsufficientIngredientsException;
import com.coffeemachine.model.*;
import com.coffeemachine.service.CoffeMachine;

public class Main {
    static void main(String[] args) {
        Inventory inventory = new Inventory(100,100,30);
        CoffeMachine machine = new CoffeMachine(inventory);

        Beverage espresso = new Espresso();
        Beverage cappuccino = new Cappuccino();
        Beverage latte = new Latte();

        prepareBeverage(machine, espresso);
        prepareBeverage(machine, cappuccino);
        prepareBeverage(machine, latte);
    }

    private static void prepareBeverage(CoffeMachine machine, Beverage beverage){
        try {
            String result = machine.brew(beverage);
            System.out.println(" Sucesso: " + result);
        } catch (InsufficientIngredientsException e) {
            System.err.println("Falha ao preparar " + beverage.name() + ": " + e.getMessage());
        }
    }
}
