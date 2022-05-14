package singleton.lazysingleton.withsynchronized;

/**
 *
 * 线程安全：如果程序每次运行结果都和单线程运行的结果是一样的，而且其他的变量的值也和预期的是一样的，就是线程安全的。
 * 在方法调用上加了同步，虽然线程安全了，但是每次都要同步，会影响性能，毕竟99%的情况下是不需要同步的。
 */
public class Singleton {
    private Singleton() {}

    private static Singleton singleton = null;

    public static final synchronized Singleton getInstance(){
        if (singleton == null){
            singleton = new Singleton();
        }
    return singleton;
    }
}
