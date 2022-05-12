package factorymode.simplefactory.custom;

import factorymode.simplefactory.factory.Factory;
import factorymode.simplefactory.product.Product;
import factorymode.simplefactory.product.ProductA;

public class Customer {

    public static void main(String[] args) {
        Factory factory = new Factory();
        Product pa= factory.createPro(110);
        Product pb= factory.createPro(911);


    }

}
