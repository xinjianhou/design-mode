package mediator;

//抽象人类
public abstract class Person {

    protected String name;
    protected Mediator mediator;

    public Person(String name, Mediator mediator) {
       this.mediator = mediator;
       this.name = name;
    }
    public abstract void getMessage(String message);

    public abstract void constact(String message);
}
