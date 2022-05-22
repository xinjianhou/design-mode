package proxy;

/**
 *  然后是抽象主题，送礼物接口：GiveGift.java
 */
public interface GiveGift {
    /**
     * 送花
     */
    void giveFlowers();

    /**
     * 送巧克力
     */
    void giveChocolate();

    /**
     * 送书
     */
    void giveBook();
}
