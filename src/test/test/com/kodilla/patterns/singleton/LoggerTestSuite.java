package com.kodilla.patterns.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class LoggerTestSuite {
    @Test
    public void getLastLogTest(){
        //Given
        Logger.getLoggerInstance().log("First log");
        Logger.getLoggerInstance().log("Second log");
        Logger.getLoggerInstance().log("Last log");
        //When
        final String lastLogTest = Logger.getLoggerInstance().getLastLog();
        //Then
        assertEquals("Last log", lastLogTest);
    }
}