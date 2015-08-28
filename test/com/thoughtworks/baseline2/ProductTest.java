package com.thoughtworks.baseline2;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ProductTest {

    Product product;

    @Test
    public void shouldReturnFalseWhenICallIsImportedWithNull() {
        product = new Product();
        assertEquals(product.isImported(null), false);
    }

    @Test
    public void shouldReturnFalseWhenICallIsImportedWithNotImportedInput() {
        product = new Product();
        assertEquals(product.isImported("1 bottle of perfume at 18.99"), false);
    }

    @Test
    public void shouldReturnTrueWhenICallIsImportedWithImportedInput() {
        product = new Product();
        assertEquals(product.isImported("1 imported bottle of perfume at 27.99"), true);
    }

    @Test
    public void shouldReturnFalseWhenICallIsExemptedWithNull() {
        product = new Product();
        assertEquals(product.isExempted(null), false);
    }

    @Test
    public void shouldReturnFalseWhenICallIsExemptedWithNotExemptedInputItem() {
        product = new Product();
        assertEquals(product.isExempted("1 bottle of perfume at 18.99"), false);
    }

    @Test
    public void shouldReturnFalseWhenICallIsFoodWithNonFoodInputItem() {
        product = new Product();
        assertEquals(product.isFood("1 imported box of something at 10.00"), false);
    }

    @Test
    public void shouldReturnFalseWhenICallIsFoodWithNullInputItem() {
        product = new Product();
        assertEquals(product.isFood(null), false);
    }

    @Test
    public void shouldReturnFalseWhenICallIsFoodWithChocolateFoodInputItem() {
        product = new Product();
        assertEquals(product.isFood("1 box of imported chocolates at 11.25"), true);
    }

    @Test
    public void shouldReturnFalseWhenICallIsMedicalProductWithNonMedicalInputItem() {
        product = new Product();
        assertEquals(product.isMedicalProduct("1 imported box of something at 10.00"), false);
    }

    @Test
    public void shouldReturnFalseWhenICallIsMedicalProductWithNullAsInputItem() {
        product = new Product();
        assertEquals(product.isMedicalProduct(null), false);
    }

    @Test
    public void shouldReturnTrueWhenICallIsMedicalProductSomeMedicalProductAsInputItem() {
        product = new Product();
        assertEquals(product.isMedicalProduct("1 packet of headache pills at 9.75"), true);
    }

    @Test
    public void shouldReturnFalseWhenICallIsBookWithNonBookInputItem() {
        product = new Product();
        assertEquals(product.isMedicalProduct("1 imported box of something at 10.00"), false);
    }
}