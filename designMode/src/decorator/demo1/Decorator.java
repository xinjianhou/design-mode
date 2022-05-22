package decorator.demo1;

/**
 *
 *  装饰器模式可以动态给对象添加一些额外的职责从而实现功能的拓展，
 *  在运行时选择不同的装饰器，从而实现不同的行为；比使用继承更加灵活，
 *  通过对不同的装饰类进行排列组合，创造出很多不同行为，得到功能更为强大的对象；
 *  符合“开闭原则”，被装饰类与装饰类独立变化，用户可以根据需要增加新的装饰类和被装饰类，
 *  在使用时再对其进行组合，原有代码无须改变。
 */
public class Decorator implements Human{

    private Human human;

    public Decorator(Human human){
        this.human= human;
    }
    @Override
    public void goHome() {

        human.goHome();
    }
}
