package mediator;

/**
 *中介者模式通过中介者对象来封装一系列的对象交互，将对象间复杂的关系网状结构变成结构简单的以中介者为核心的星形结构，
 * 对象间一对多的关联转变为一对一的关联，简化对象间的关系，便于理解；各个对象之间的关系被解耦，
 * 每个对象不再和它关联的对象直接发生相互作用，而是通过中介者对象来与关联的对象进行通讯，使得对象可以相对独立地使用，提高了对象的可复用和系统的可扩展性。
 *
 *         在中介者模式中，中介者类处于核心地位，它封装了系统中所有对象类之间的关系，
 *         除了简化对象间的关系，还可以对对象间的交互进行进一步的控制。
 *
 *
 */
public class Client {

    public static void main(String[] args) {
        //一个房主、一个租房者、一个中介机构
        MediatorStructure mediator = new MediatorStructure();

        //房主和租房者只需要知道中介机构即可
        HouseOwner houseOwner = new HouseOwner("张三", mediator);
        Tenant tenant = new Tenant("李四", mediator);

        //中介结构要知道房主和租房者
        mediator.setHouseOwner(houseOwner);
        mediator.setTenant(tenant);

        tenant.constact("听说你那里有三室的房主出租.....");
        houseOwner.constact("是的!请问你需要租吗?");
    }

}
