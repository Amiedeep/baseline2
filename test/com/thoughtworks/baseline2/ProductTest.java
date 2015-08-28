package com.thoughtworks.baseline2;


import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ProductTest {

    Product product;

    @Test
    public void shouldReturnFalseWhenWhenICallIsImportedWithNull() {
        product = new Product(null);
        assertEquals(product.isImported(null), false);
    }

    @Test
    public void shouldReturnFalseWhenWhenICallIsImportedWithNotImportedInput() {
        product = new Product("1 bottle of perfume at 18.99");
        assertEquals(product.isImported("1 bottle of perfume at 18.99"), false);
    }
}