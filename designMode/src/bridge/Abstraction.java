package bridge;

/**
 * Abstraction 抽象类：
 */
public abstract class Abstraction {

    public Implementor getImplementor() {
        return implementor;
    }

    private Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public void operation() {
        implementor.operationImpl();
    }

}
