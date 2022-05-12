package buildermod.concretebuilder;

import buildermod.builder.MealBuilder;

public class MealBuilderA extends MealBuilder {

    @Override
    public void buildFood() {
        meal.setDrink("一杯可乐");
    }

    @Override
    public void buildDrink() {
        meal.setFood("一盒薯条");
    }
}
