package com.thoughtworks.baseline2;

public class Product {

    public boolean isImported(String input) {
        if(input == null) {
            return false;
        }
        return input.contains("imported");
    }

    public boolean isExempted(String input) {
        return isFood(input) || isMedicalProduct(input);
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
        return 0.0;
    }
}
