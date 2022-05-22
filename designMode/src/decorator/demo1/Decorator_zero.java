package decorator.demo1;

public class Decorator_zero extends Decorator{
    public Decorator_zero(Human human) {
        super(human);
    }


    public void turnOffPC(){

        System.out.println("关掉电脑。。");
    }
    @Override
    public void goHome() {
        super.goHome();
        this.turnOffPC();
    }
}
