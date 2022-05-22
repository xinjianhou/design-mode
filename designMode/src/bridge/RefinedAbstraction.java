package bridge;

import java.util.Random;

/**
 * RefinedAbstraction 抽象类的具体实现：
 */
public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    public void refinedOperation() {
        Random ran=new Random();
        System.out.println(String.format("%s 添加%s",getImplementor().getClass().getSimpleName(),ran.nextBoolean()?"太多":"正常"));
    }

}
