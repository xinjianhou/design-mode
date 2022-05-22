package factory.factorymode.custom;


import factory.factorymode.factory.Factory;
import factory.factorymode.factory.FactoryA;
import factory.factorymode.factory.FactoryB;
import factory.factorymode.product.Product;

public class Customer {

    public static void main(String[] args) {
        Factory factoryA = new FactoryA();
        Product pa= factoryA.createPro();


        Factory factoryB = new FactoryB();

        Product pb= factoryB.createPro();




    }

}
