package decorator.demo1;

public class Decorator_two extends Decorator{
    public Decorator_two(Human human) {
        super(human);
    }


    public void openDoor(){
        System.out.println("打开房门。。。。");
    }

    @Override
    public void goHome(){
        super.goHome();
        this.openDoor();
    }
}
