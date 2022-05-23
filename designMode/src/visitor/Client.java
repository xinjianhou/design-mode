package visitor;

/**
 *
 * 访问者模式适用于数据结构相对稳定的系统，将数据结构与基于数据的操作进行分离，
 * 使得添加作用于这些数据结构的新操作变得简单，并且不需要改变各数据结构，
 * 为不同类型的数据结构提供多种访问操作方式，这样是访问者模式的设计动机。
 *
 *         除了使新增访问操作变得更加简单，
 *         也能够在不修改现有类的层次结构下，
 *         定义该类层次结构的操作，并将有关元素对象的访问行为集中到一个访问者对象中，而不是分散搞一个个的元素类中。
 *
 *        但访问者模式的缺点在于让增加新的元素类变得困难，
 *        每增加一个新的元素类都意味着要在抽象访问者角色中增加一个新的抽象操作，并在每一个具体访问者类中增加相应的具体操作，违背了“开闭原则”的要求；
 *
 *         所以访问者模式适用于对象结构中很少改变，
 *         但经常需要在此对象结构上定义新的操作的系统，使得算法操作的增加变得简单；
 *         或者需要对一个对象结构中进行很多不同并且不相关的操作，并且需要避免让这些操作污染这些对象，也不希望在增加新操作时修改这些类的场景
 */
public class Client {
    public static void main(String[] args) {
        Medicine a = new MedicineA("板蓝根", 11.0);
        Medicine b = new MedicineB("感康", 14.3);

        Presciption presciption = new Presciption();
        presciption.addMedicine(a);
        presciption.addMedicine(b);

        Visitor charger = new Charger();
        charger.setName("张三");

        Visitor workerOfPharmacy = new WorkerOfPharmacy();
        workerOfPharmacy.setName("李四");

        presciption.accept(charger);
        System.out.println("-------------------------------------");
        presciption.accept(workerOfPharmacy);
    }
}
