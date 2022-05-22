package strategy;

/**
 *   将类中经常改变或者可能改变的部分提取为作为一个抽象策略接口类，然后在类中包含这个对象的实例，这样类实例在运行时就可以随意调用实现了这个接口的类的行为。
 *
 *         比如定义一系列的算法，把每一个算法封装起来，并且使它们可相互替换，使得算法可独立于使用它的客户而变化，这就是策略模式。
 *
 */
public class Zhaoyun {
    public static void main(String[] args) {
        Context context;

        System.out.println("----------刚到吴国使用第一个锦囊---------------");
        context = new Context(new BackDoor());
        context.operate();
        System.out.println("\n");

        System.out.println("----------刘备乐不思蜀使用第二个锦囊---------------");
        context.setStrategy(new GivenGreenLight());
        context.operate();
        System.out.println("\n");

        System.out.println("----------孙权的追兵来了，使用第三个锦囊---------------");
        context.setStrategy(new BlackEnemy());
        context.operate();
        System.out.println("\n");
    }

}
