package com.thoughtworks.baseline2;

public class Product {

    private boolean isImported;

    public Product(String input) {
        isImported = isImported(input);
    }

    public boolean isImported(String input) {
        if(input == null) {
            return false;
        }
        return input.contains("imported");
    }

    public double calculateTax() {
        return 0.0;
    }
}
