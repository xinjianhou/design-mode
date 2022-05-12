package factorymode.simplefactory.factory;

import factorymode.simplefactory.product.Product;
import factorymode.simplefactory.product.ProductA;
import factorymode.simplefactory.product.ProductB;

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
