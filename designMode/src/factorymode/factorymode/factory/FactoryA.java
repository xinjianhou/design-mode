package factorymode.factorymode.factory;


import factorymode.factorymode.product.ProductA;

public class FactoryA implements Factory{
    @Override
    public ProductA createPro() {
        return new ProductA();
    }
}
