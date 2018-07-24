package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task makeTask(final String task) {
        switch (task) {
            case DRIVING:
                return new DrivingTask("Go to", "Airport", "Car");
            case PAINTING:
                return new PaintingTask("Paint", "Blue Ocean", "Bathroom");
            case SHOPPING:
                return new ShoppingTask("Buy fruit", "Orange", 1);
            default:
                return null;
        }
    }
}
