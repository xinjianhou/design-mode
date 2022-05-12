package factorymode.factorymode.factory;

import factorymode.factorymode.product.ProductB;

public class FactoryB implements Factory{
    @Override
    public ProductB createPro() {
        return new ProductB();
    }
}
