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
}