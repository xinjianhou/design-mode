package factory.abstractfactory.factory;

import factory.abstractfactory.product.Aircondition;
import factory.abstractfactory.product.AirconditionA;
import factory.abstractfactory.product.Engine;
import factory.abstractfactory.product.EngineA;

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
