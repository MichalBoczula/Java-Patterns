package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private final String bun;
    private final String sauce;
    private final Integer burgers;
    private final List<String> ingredients;

    static class BigmacBuilder {
        private String bun;
        private String sauce;
        private Integer burgers;
        private List<String> ingredientsList = new ArrayList<>();

        BigmacBuilder bun(String bun) {
            this.bun = bun;
            return this;
        }

        BigmacBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        BigmacBuilder burgers(Integer burgers) {
            this.burgers = burgers;
            return this;
        }

        BigmacBuilder ingredients(String ingredient) {
            this.ingredientsList.add(ingredient);
            return this;
        }

        Bigmac build() {
            return new Bigmac(bun, sauce, burgers, ingredientsList);
        }
    }

    private Bigmac(String bun, String sauce, Integer burgers, List<String> ingredients) {
        this.bun = bun;
        this.sauce = sauce;
        this.burgers = burgers;
        this.ingredients = ingredients;
    }

    String getBun() {
        return bun;
    }

    String getSauce() {
        return sauce;
    }

    Integer getBurgers() {
        return burgers;
    }

    List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", sauce='" + sauce + '\'' +
                ", burgers=" + burgers +
                ", ingredients=" + ingredients +
                '}';
    }
}
