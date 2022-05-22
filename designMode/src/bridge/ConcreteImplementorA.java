package bridge;

/**
 *
 * ConcreteImplementor 接口实现类：
 */
public class ConcreteImplementorA implements Implementor{
    @Override
    public void operationImpl() {
        System.out.println("impl A");
    }
}
