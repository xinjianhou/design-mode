package factorymode.abstractfactory.factory;

import factorymode.abstractfactory.product.Aircondition;
import factorymode.abstractfactory.product.Engine;

public interface AbstractFactory {
    public Engine createEngine();

    public Aircondition createAircondition();
}
