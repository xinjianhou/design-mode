package state;

/**
 *
 * 状态模式，就是允许对象在内部状态发生改变时改变它的行为，对象看起来就好像修改了它的类，也就是说以状态为原子来改变它的行为，而不是通过行为来改变状态。
 *
 *         当对象的行为取决于它的属性时，我们称这些属性为状态，那该对象就称为状态对象。
 *         对于状态对象而言，它的行为依赖于它的状态，比如要预订房间，只有当该房间空闲时才能预订，
 *         想入住该房间也只有当你预订了该房间或者该房间为空闲时。对于这样的一个对象，当它的外部事件产生互动的时候，
 *         其内部状态就会发生变化，从而使得他的行为也随之发生变化。
 */
public class Client {
    public static void main(String[] args) {
        //有3间房
        Room[] rooms = new Room[3];
        //初始化
        for(int i = 0 ; i < rooms.length ; i++){
            rooms[i] = new Room();
        }
        //第一间房
        rooms[0].bookRoom();    //预订
        rooms[0].checkInRoom();   //入住
        rooms[0].bookRoom();    //预订
        System.out.println(rooms[0]);
        System.out.println("---------------------------");

        //第二间房
        rooms[1].checkInRoom();
        rooms[1].bookRoom();
        rooms[1].checkOutRoom();
        rooms[1].bookRoom();
        System.out.println(rooms[1]);
    }

}
