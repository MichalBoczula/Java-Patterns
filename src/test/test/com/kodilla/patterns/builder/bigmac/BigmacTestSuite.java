package com.kodilla.patterns.builder.bigmac;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BigmacTestSuite {
    @Test
    public void testBuildNewBigmac() {
        //Given
        final Bigmac testBigmac = new Bigmac.BigmacBuilder()
                .bun("normal")
                .sauce("spicy")
                .ingredients("salad")
                .ingredients("tomato")
                .ingredients("cucumber")
                .burgers(3)
                .build();
        //When & Then
        assertEquals(3, testBigmac.getIngredients().size());
        assertEquals((Integer) 3, testBigmac.getBurgers());
        assertEquals("normal", testBigmac.getBun());
        assertEquals("spicy", testBigmac.getSauce());
    }

}