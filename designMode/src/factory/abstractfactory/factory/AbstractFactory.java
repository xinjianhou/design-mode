package factory.abstractfactory.factory;

import factory.abstractfactory.product.Aircondition;
import factory.abstractfactory.product.Engine;

public interface AbstractFactory {
    public Engine createEngine();

    public Aircondition createAircondition();
}
