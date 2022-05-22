package builder.concretebuilder;

import builder.builder.MealBuilder;

public class MealBuilderB extends MealBuilder {
    @Override
    public void buildFood() {
        meal.setDrink("一杯柠檬果汁");
    }

    @Override
    public void buildDrink() {
        meal.setFood("三个鸡翅");
    }
}
