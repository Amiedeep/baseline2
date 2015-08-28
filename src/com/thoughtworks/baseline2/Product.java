package com.thoughtworks.baseline2;

import static java.lang.Math.round;

public class Product {

    private String input;
    private double salesTax;
    private double price;

    public Product(String input) {
        this.input = input;
        parsePrice(input);
    }

    private void parsePrice(String input) {
        String[] inputarray = input.split(" ");
        price = Double.parseDouble(inputarray[inputarray.length-1]);
    }

    public boolean isImported(String input) {
        if(input == null) {
            return false;
        }
        return input.contains("imported");
    }

    public boolean isExempted(String input) {
        return isFood(input) || isMedicalProduct(input) || isBook(input);
    }

    public boolean isFood(String input) {
        if(input == null) {
            return false;
        }
        return input.contains("chocolate");
    }

    public boolean isMedicalProduct(String input) {
        if(input == null) {
            return false;
        }
        return input.contains("headache pills");
    }

    public boolean isBook(String input) {
        if(input == null) {
            return false;
        }
        return input.contains("book");
    }

    public double calculateTax() {
        int interestRate;
        if(!isExempted(input)) {
            interestRate = 10;
            addTax(interestRate);
        }
        if(isImported(input)) {
            interestRate = 5;
            addTax(interestRate);
        }
        return salesTax;
    }

    private void addTax(int interestRate) {
        salesTax += roundamount((price * interestRate) / 100);
    }

    private double roundamount(double amount) {
        return (double)round(amount * 100) / 100;
    }
}
