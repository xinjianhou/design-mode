package factory.simplefactory.custom;

import factory.simplefactory.factory.Factory;
import factory.simplefactory.product.Product;

public class Customer {

    public static void main(String[] args) {
        Factory factory = new Factory();
        Product pa= factory.createPro(110);
        Product pb= factory.createPro(911);


    }

}
