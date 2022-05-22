package proxy;

/**
 *代理模式的设计动机是通过代理对象来访问真实对象，通过建立一个对象代理类，
 * 由代理对象控制原对象的引用，从而实现对真实对象的操作。
 * 在代理模式中，代理对象主要起到一个中介的作用，用于协调与连接调用者(即客户端)和被调用者(即目标对象)，
 * 在一定程度上降低了系统的耦合度，同时也保护了目标对象。
 * 但缺点是在调用者与被调用者之间增加了代理对象，可能会造成请求的处理速度变慢，
 *
 */
public class Client {
    public static void main(String[] args) {
        BeautifulGirl mm = new BeautifulGirl("大美女！！！");

        HerChum chum = new HerChum(mm);

        chum.giveBook();
        chum.giveChocolate();
        chum.giveFlowers();
    }

}
