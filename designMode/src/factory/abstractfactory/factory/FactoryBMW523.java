package factory.abstractfactory.factory;

import factory.abstractfactory.product.Aircondition;
import factory.abstractfactory.product.AirconditionB;
import factory.abstractfactory.product.Engine;
import factory.abstractfactory.product.EngineB;

public class FactoryBMW523 implements AbstractFactory {
    @Override
    public Engine createEngine() {
        return new EngineB();
    }

    @Override
    public Aircondition createAircondition() {

        return new AirconditionB();
    }
}
