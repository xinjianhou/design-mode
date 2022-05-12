package factorymode.abstractfactory.factory;

import factorymode.abstractfactory.product.Aircondition;
import factorymode.abstractfactory.product.AirconditionA;
import factorymode.abstractfactory.product.Engine;
import factorymode.abstractfactory.product.EngineA;

public class FactoryBMW320 implements AbstractFactory{
    @Override
    public Engine createEngine() {
        return new EngineA();
    }

    @Override
    public Aircondition createAircondition() {
        return new AirconditionA();
    }
}
