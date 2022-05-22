package flyweight;

/**
 *
 * 享元模式通过共享技术有效地支持细粒度、状态变化小的对象复用，当系统中存在有多个相同的对象，那么只共享一份，
 * 不必每个都去实例化一个对象，极大地减少系统中对象的数量。比如说一个文本系统，每个字母定一个对象，那么大小写字母一共就是52个，
 * 那么就要定义52个对象。如果有一个1M的文本，那么字母是何其的多，如果每个字母都定义一个对象那么内存早就爆了。那么如果要是每个字母都共享一个对象，那么就大大节约了资源。
 *
 *         在了解享元模式之前我们先要了解两个概念：内部状态、外部状态。
 *
 * 内部状态：在享元对象内部不随外界环境改变而改变的共享部分。
 * 外部状态：随着环境的改变而改变，不能够共享的状态就是外部状态。
 *         由于享元模式区分了内部状态和外部状态，所以我们可以通过设置不同的外部状态使得相同的对象可以具备一些不同的特性，
 *         而内部状态设置为相同部分。在我们的程序设计过程中，我们可能会需要大量的细粒度对象来表示对象，
 *         如果这些对象除了几个参数不同外其他部分都相同，这个时候我们就可以利用享元模式来大大减少应用程序当中的对象。如何利用享元模式呢？这里我们只需要将他们少部分的不同的部分当做参数移动到类实例的外部去，然后再方法调用的时候将他们传递过来就可以了。这里也就说明了一点：内部状态存储于享元对象内部，而外部状态则应该由客户端来考虑
 */
public class Client {
    public static void main(String[] args) {
        Shape shape1 = FlyweightFactory.getShape("红色");
        shape1.draw();

        Shape shape2 = FlyweightFactory.getShape("灰色");
        shape2.draw();

        Shape shape3 = FlyweightFactory.getShape("绿色");
        shape3.draw();

        Shape shape4 = FlyweightFactory.getShape("红色");
        shape4.draw();

        Shape shape5 = FlyweightFactory.getShape("灰色");
        shape5.draw();

        Shape shape6 = FlyweightFactory.getShape("灰色");
        shape6.draw();

        System.out.println("一共绘制了"+FlyweightFactory.getSum()+"中颜色的圆形");

    }
}
