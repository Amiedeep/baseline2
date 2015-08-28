package com.thoughtworks.baseline2;

import java.util.ArrayList;
import java.util.Scanner;

public class Baseline {

    private Scanner scanner;
    private ArrayList<Product> products;
    private double totalTax;

    public Baseline() {
        scanner = new Scanner(System.in);
        products = new ArrayList<>();
    }

    public static void main(String[] args) {
        Baseline baseline = new Baseline();
        baseline.readInputAndInitialiseProducts();
        baseline.calculateTaxAndMakeReceipt();
    }

    private void readInputAndInitialiseProducts() {
        System.out.println("Enter input items");
        String input = "";
        while(true) {
            input = scanner.nextLine();
            if(input.equals("")) {
                break;
            }
            initialiseProduct(input);
        }
    }

    public double calculateTaxAndMakeReceipt() {
        for(Product product : products) {
            totalTax += product.calculateTax();
        }
        return totalTax;
    }

    public void initialiseProduct(String input) {
        products.add(new Product(input));
    }
}
