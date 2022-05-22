package decorator.demo1;

/**
 *
 * 1）Decorator 抽象类持有Human接口，方法全部委托给该接口调用，目的是交给该接口的实现类进行调用。
 *
 * （2）Decorator 抽象类的子类，即具体装饰者，里面都有一个构造方法调用 super(human)，
 * 这里就体现了抽象类依赖于子类实现，即抽象依赖于实现的原则。因为构造函数的参数都是 Human 类型，
 * 只要是该 Human 的实现类都可以传递进去，即表现出 Decorator dt = new Decorator_two(new Decorator_one(new Decorator_zero(human))) 这种结构的样子，
 * 所以当调用 dt.goHome() 的时候，又因为每个具体装饰者类中，都先调用 super.goHome() 方法，
 * 而该 super 已经由构造函数传递并指向了具体的某一个装饰者类，那么最终调用的就是装饰类的方法，然后才调用自身的装饰方法，即表现出一种装饰、链式的类似于过滤的行为。
 *
 * （3）具体被装饰者类，可以定义初始的状态或者初始的自己的装饰，后面的装饰行为都在此基础上一步一步进行点缀、装饰。
 *
 * （4）装饰者模式的设计原则为：对扩展开放、对修改关闭，这句话体现在如果想扩展被装饰者类的行为，
 * 无须修改装饰者抽象类，只需继承装饰者抽象类，实现额外的一些装饰或者叫行为即可对被装饰者进行包装。
 * 所以：扩展体现在继承、修改体现在子类中，而不是具体的抽象类，这充分体现了依赖倒置原则，这是自己理解的装饰者模式
 */
public class DecoratorTest {

    public static void main(String[] args) {
        Human peter = new Peter();
        Decorator decorator = new Decorator_two(new Decorator_one(new Decorator_zero(peter)));
        decorator.goHome();
    }
}
