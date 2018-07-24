package com.kodilla.patterns.factory.tasks;

import org.junit.Test;

import static org.junit.Assert.*;

public class TaskFactoryTestSuite {

    @Test
    public void testFactoryDriving(){
        //Given
        final TaskFactory driving = new TaskFactory();
        final Task drivingTask = driving.makeTask(TaskFactory.DRIVING);
        //When
        drivingTask.executeTask();
        //Then
        assertEquals("Go to Airport Car", drivingTask.getTaskName());
        assertEquals(true, drivingTask.isTaskExecuted());
    }

    @Test
    public void testFactoryPainting(){
        //Given
        final TaskFactory painting = new TaskFactory();
        final Task paintingTask = painting.makeTask(TaskFactory.PAINTING);
        //When
        paintingTask.executeTask();
        //Then
        assertEquals("Paint Blue Ocean Bathroom", paintingTask.getTaskName());
        assertEquals(true, paintingTask.isTaskExecuted());
    }

    @Test
    public void testFactoryShopping(){
        //Given
        final TaskFactory shopping = new TaskFactory();
        final Task shoppingTask = shopping.makeTask(TaskFactory.SHOPPING);
        //When
        shoppingTask.executeTask();
        //Then
        assertEquals("Buy fruit Orange "+ 1.0, shoppingTask.getTaskName());
        assertEquals(true, shoppingTask.isTaskExecuted());
    }

}