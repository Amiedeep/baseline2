package com.thoughtworks.baseline2;

import java.util.ArrayList;
import java.util.Scanner;

public class Baseline {

    Scanner scanner;

    public Baseline() {
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Baseline baseline = new Baseline();
        baseline.readInputAndCalculateTax();
    }

    private void readInputAndCalculateTax() {
        System.out.println("Enter input items");
        String input = "";
        while(true) {
            input = scanner.nextLine();
            if(input.equals("")) {
                break;
            }
        }
    }
}
