package com.coffeemachine.exception;

public class InsufficientIngredientsException extends RuntimeException {
    public InsufficientIngredientsException(String message) {
        super(message);
    }
}