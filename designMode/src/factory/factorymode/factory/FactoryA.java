package factory.factorymode.factory;


import factory.factorymode.product.ProductA;

public class FactoryA implements Factory{
    @Override
    public ProductA createPro() {
        return new ProductA();
    }
}
