package com.thoughtworks.baseline2;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BaselineTest {

    Baseline baseline;
    @Test
    public void shouldReturnZeroWhenExemptedAndNotImportedItemIsPassed() {
        baseline = new Baseline();
        baseline.initialiseProduct("1 book at 12.49");
        assertEquals(baseline.calculateTaxAndMakeReceipt(), 0.0);
    }
}