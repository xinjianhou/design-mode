package factory.factorymode.factory;

import factory.factorymode.product.ProductB;

public class FactoryB implements Factory{
    @Override
    public ProductB createPro() {
        return new ProductB();
    }
}
