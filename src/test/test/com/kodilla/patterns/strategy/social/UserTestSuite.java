package com.kodilla.patterns.strategy.social;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        final Millenials millenials = new Millenials("Millenial");
        final YGeneration yGeneration = new YGeneration("YGeneration");
        final ZGeneration zGeneration = new ZGeneration("ZGeneration");
        //When & Then
        assertEquals("Facebook", millenials.getSocialPublisher().share());
        assertEquals("Snapchat", yGeneration.getSocialPublisher().share());
        assertEquals("Twitter", zGeneration.getSocialPublisher().share());
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        final Millenials millenials = new Millenials("Millenial");
        final YGeneration yGeneration = new YGeneration("YGeneration");
        final ZGeneration zGeneration = new ZGeneration("ZGeneration");
        //When
        millenials.setSocialPublisher(new SnapchatPublisher());
        yGeneration.setSocialPublisher(new FacebookPublisher());
        zGeneration.setSocialPublisher(new FacebookPublisher());
        //Then
        assertEquals("Snapchat", millenials.getSocialPublisher().share());
        assertEquals("Facebook", yGeneration.getSocialPublisher().share());
        assertEquals("Facebook", zGeneration.getSocialPublisher().share());
    }
}