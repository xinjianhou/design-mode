package builder.customer;

import builder.concretebuilder.MealBuilderA;
import builder.director.KFCWaiter;
import builder.product.Meal;

public class Client {
    public static void main(String[] args) {
        KFCWaiter waiter = new KFCWaiter();
        waiter.setMealBuilder(new MealBuilderA());
        Meal mealA = waiter.construct();
        System.out.println(mealA.getDrink());
        System.out.println(mealA.getFood());
    }
}
