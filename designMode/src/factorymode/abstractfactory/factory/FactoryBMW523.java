package factorymode.abstractfactory.factory;

import factorymode.abstractfactory.product.Aircondition;
import factorymode.abstractfactory.product.AirconditionB;
import factorymode.abstractfactory.product.Engine;
import factorymode.abstractfactory.product.EngineB;

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
