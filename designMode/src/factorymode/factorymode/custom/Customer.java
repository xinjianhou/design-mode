package factorymode.factorymode.custom;


import factorymode.factorymode.factory.Factory;
import factorymode.factorymode.factory.FactoryA;
import factorymode.factorymode.factory.FactoryB;
import factorymode.factorymode.product.Product;
import factorymode.factorymode.product.ProductA;

public class Customer {

    public static void main(String[] args) {
        Factory factoryA = new FactoryA();
        Product pa= factoryA.createPro();


        Factory factoryB = new FactoryB();

        Product pb= factoryB.createPro();




    }

}
