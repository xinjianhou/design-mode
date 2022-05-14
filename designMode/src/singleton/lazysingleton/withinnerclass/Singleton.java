package singleton.lazysingleton.withinnerclass;

/**
 * 利用了类加载机制来保证初始化 instance 时只有一个线程，所以也是线程安全的，同时没有性能损耗，这种比其他两种都好一些，既实现了线程安全，又避免了同步带来的性能影响。
 */
public class Singleton {

    private Singleton(){}

    private static class LazyHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static final Singleton  getInstance(){
        return LazyHolder.INSTANCE;
    }
}
