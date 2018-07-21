package com.kodilla.patterns.singleton;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class SettingsFileEngineTestSuite {
    @BeforeClass
    public static void openSettingsFile() {
        SettingsFileEngine.getSettingsFileEngineInstance().open("myapp.settings");
    }

    @AfterClass
    public static void closeSettingsFile() {
        SettingsFileEngine.getSettingsFileEngineInstance().close();
    }

    @Test
    public void testGetFileName() {
        //Given
        //When
        String fileName = SettingsFileEngine.getSettingsFileEngineInstance().getFileName();
        System.out.println("Opened: " + fileName);
        //Then
        assertEquals("myapp.settings", fileName);
    }

    @Test
    public void testLoadSettings() {
        //Given
        //When
        boolean result = SettingsFileEngine.getSettingsFileEngineInstance().loadSettings();
        //Then
        assertTrue(result);
    }

    @Test
    public void testSaveSettings() {
        //Given
        //When
        boolean result = SettingsFileEngine.getSettingsFileEngineInstance().saveSettings();
        //Then
        assertTrue(result);
    }
}