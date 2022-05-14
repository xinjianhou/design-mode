package prototypemode;

/**
 *
 * 二、原型模式的优点与适用场景：
 * （1）原型模式比 new 方式创建对象的性能要好的多，因为 Object 类的 clone() 方法是一个本地方法，直接操作内存中的二进制流，特别是复制大对象时，性能的差别非常明显；
 *
 * （2）简化对象的创建；
 *
 *   所以原型模式适合在重复地创建相似对象的场景使用，比如在一个循环体内创建对象，假如对象创建过程比较复杂或者循环次数很多的话，使用原型模式不但可以简化创建过程，而且也可以提供系统的整体性能。
 *
 *
 *   注意事项：
 * （1）使用原型模式复制对象不会调用类的构造函数，对象是通过调用 Object 类的 clone() 方法来完成的，它直接在内存中复制数据。不但构造函数不会执行，甚至连访问权限都对原型模式无效。单例模式中，需要将构造函数的访问权限设置为 private，但是 clone() 方法直接无视构造方法的权限，所以单例模式与原型模式是冲突的，在使用时需要注意。
 *
 * （2）深拷贝与浅拷贝。Object 类的 clone() 方法只会拷贝对象中的基本的数据类型（8种基本数据类型 byte,char,short,int,long,float,double,boolean 和对应的封装类），对于数组、容器对象、引用对象等都不会拷贝，这就是浅拷贝。如果要实现深拷贝，必须将原型模式中的数组、容器对象、引用对象等另行拷贝。
 *
 * 浅拷贝：只克隆对象中的基本数据类型，而不会克隆数组、容器、引用对象等。换言之，浅复制仅仅复制所考虑的对象，而不复制它所引用的对象。如果变量为String字符串，则拷贝其引用地址，但是在修改的时候，它会从字符串池中重新生成一个新的字符串，原有的字符串对象保持不变。
 * 深拷贝：把要克隆的对象所引用的对象都克隆了一遍。
 */
public class Client {
    public static void main(String[] args) {
        ShallowClone cp = new ShallowClone();
        ShallowClone clonecp = (ShallowClone) cp.clone();
        clonecp.show();
        System.out.println(clonecp.list == cp.list);

        DeepClone cp2 = new DeepClone();
        DeepClone clonecp2 = (DeepClone) cp2.clone();
        clonecp2.show();
        System.out.println(clonecp2.list == cp2.list);
    }

}
