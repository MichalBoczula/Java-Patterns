package com.kodilla.patterns.builder.pizza;

import java.util.ArrayList;
import java.util.List;

class Pizza {
    private final String bottom;
    private final String sauce;
    private final List<String> ingredients;

    static class PizzaBuilder {
        private String bottom;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        PizzaBuilder bottom(String bottom) {
            this.bottom = bottom;
            return this;
        }

        PizzaBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        PizzaBuilder ingredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        Pizza build() {
            return new Pizza(bottom, sauce, ingredients);
        }
    }

    private Pizza(final String bottom, final String sauce, List<String> ingredients) {
        this.bottom = bottom;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    String getBottom() {
        return bottom;
    }

    String getSauce() {
        return sauce;
    }

    List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "bottom='" + bottom + '\'' +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
