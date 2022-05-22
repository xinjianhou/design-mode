package decorator.demo1;

public class Decorator_one extends Decorator{

    public Decorator_one(Human human) {
        super(human);
    }

    public void drive(){

        System.out.println("开车。。");
    }

    @Override
    public void goHome(){
        super.goHome();
        this.drive();

    }
}
