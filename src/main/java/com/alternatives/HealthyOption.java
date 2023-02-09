package com.alternatives;

import java.util.ArrayList;

public class HealthyOption {
    private String uId;
    private FruitSchema[] fruitSchema;

    public HealthyOption(String uId, FruitSchema[] fruitSchema) {
        this.uId = uId;
        this.fruitSchema = fruitSchema;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public FruitSchema[] getFruitSchema() {
        return fruitSchema;
    }

    public void setFruitSchema(FruitSchema[] fruitSchema) {
        this.fruitSchema = fruitSchema;
    }
}

class Fruit {
    String name;
    Nutritions nutritions;

    public Fruit(String name, Nutritions nutritions) {
        this.name = name;
        this.nutritions = nutritions;
    }
}

class Nutritions {
    double carbohydrates;
    double protein;
    double fat;
    double calories;
    double sugar;

    public Nutritions(double carbohydrates, double protein, double fat, double calories, double sugar) {
        this.carbohydrates = carbohydrates;
        this.protein = protein;
        this.fat = fat;
        this.calories = calories;
        this.sugar = sugar;
    }
}
class FruitSchema{
    double index;
    double totalCalorie;
    double userTargetedCalorie;
    Fruit[] fruit;

    public FruitSchema(double index, double totalCalorie, double userTargetedCalorie, Fruit[] fruit) {
        this.index = index;
        this.totalCalorie = totalCalorie;
        this.userTargetedCalorie = userTargetedCalorie;
        this.fruit = fruit;
    }
}

