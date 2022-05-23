package mediator;

//首先是抽象中介者:Mediator.java
public abstract class Mediator {
    //申明一个联络方法
    public abstract void constact(String message,Person person);
}
