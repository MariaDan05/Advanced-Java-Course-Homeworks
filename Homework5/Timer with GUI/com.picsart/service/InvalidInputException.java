package com.picsart.service;

public class InvalidInputException extends RuntimeException{
    public InvalidInputException(String text) {
        super(text);
    }
}

