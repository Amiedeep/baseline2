package com.thoughtworks.baseline2;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ProductTest {

    Product product;

    @Before
    public void setUp() {
        product = new Product("1 book at 12.49");
    }

    @Test
    public void shouldReturnFalseWhenICallIsImportedWithNull() {
        assertEquals(product.isImported(null), false);
    }

    @Test
    public void shouldReturnFalseWhenICallIsImportedWithNotImportedInput() {
        assertEquals(product.isImported("1 bottle of perfume at 18.99"), false);
    }

    @Test
    public void shouldReturnTrueWhenICallIsImportedWithImportedInput() {
        assertEquals(product.isImported("1 imported bottle of perfume at 27.99"), true);
    }

    @Test
    public void shouldReturnFalseWhenICallIsExemptedWithNull() {
        assertEquals(product.isExempted(null), false);
    }

    @Test
    public void shouldReturnFalseWhenICallIsExemptedWithNotExemptedInputItem() {
        assertEquals(product.isExempted("1 bottle of perfume at 18.99"), false);
    }

    @Test
    public void shouldReturnTrueWhenICallIsExemptedWithFoodInputItem() {
        assertEquals(product.isExempted("1 imported box of chocolates at 10.00"), true);
    }

    @Test
    public void shouldReturnTrueWhenICallIsExemptedWithSomeMedicalInputItem() {
        assertEquals(product.isExempted("1 packet of headache pills at 9.75"), true);
    }

    @Test
    public void shouldReturnTrueWhenICallIsExemptedWithSomeBookInputItem() {
        assertEquals(product.isExempted("1 book at 12.49"), true);
    }

    @Test
    public void shouldReturnFalseWhenICallIsFoodWithNonFoodInputItem() {
        assertEquals(product.isFood("1 imported box of something at 10.00"), false);
    }

    @Test
    public void shouldReturnFalseWhenICallIsFoodWithNullInputItem() {
        assertEquals(product.isFood(null), false);
    }

    @Test
    public void shouldReturnFalseWhenICallIsFoodWithChocolateFoodInputItem() {
        assertEquals(product.isFood("1 box of imported chocolates at 11.25"), true);
    }

    @Test
    public void shouldReturnFalseWhenICallIsMedicalProductWithNonMedicalInputItem() {
        assertEquals(product.isMedicalProduct("1 imported box of something at 10.00"), false);
    }

    @Test
    public void shouldReturnFalseWhenICallIsMedicalProductWithNullAsInputItem() {
        assertEquals(product.isMedicalProduct(null), false);
    }

    @Test
    public void shouldReturnTrueWhenICallIsMedicalProductSomeMedicalProductAsInputItem() {
        assertEquals(product.isMedicalProduct("1 packet of headache pills at 9.75"), true);
    }

    @Test
    public void shouldReturnFalseWhenICallIsBookWithNonBookInputItem() {
        assertEquals(product.isBook("1 imported box of something at 10.00"), false);
    }

    @Test
    public void shouldReturnFalseWhenICallIsBookWithNullAsInputItem() {
        assertEquals(product.isBook(null), false);
    }

    @Test
    public void shouldReturnTrueWhenICallIsBookWithSomeBookAsInputItem() {
        assertEquals(product.isBook("1 book at 12.49"), true);
    }

}