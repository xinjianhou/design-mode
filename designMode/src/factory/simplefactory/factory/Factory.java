package factory.simplefactory.factory;

import factory.simplefactory.product.Product;
import factory.simplefactory.product.ProductA;
import factory.simplefactory.product.ProductB;

public class Factory {

    public Product createPro(int type){
        switch (type) {

            case 110:
                return new ProductA();

            case 911:
                return new ProductB();

            default: break;

        }
        return null;
    }
}
