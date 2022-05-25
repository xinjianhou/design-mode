package memento;

/**
 *
 * 备忘录模式提供了一种恢复状态的机制，在不破坏封装的前提下，捕获对象的内部状态，并保存在该对象之外，保证该对象能够恢复到某个历史状态；备忘录模式将保存的细节封装在备忘录中，
 * 除了创建它的创建者之外其他对象都不能访问它，并且实现了即使要改变保存的细节也不影响客户端。但是备忘录模式都是多状态和多备份的，会早用较多的内存，消耗资源。
 *
 * 、优点：
 *
 * （1）实现了信息的封装，用户不需要关心状态的保存细节，窄接口保证了只有发起者才能访问备忘录对象的状态；
 *
 * （2）简化了原发器，把备忘录对象保存到原发器对象之外，这样原发器角色就不需要对各个备份的状态进行管理。
 *
 * 2、缺点：
 *
 *         在实际应用中，备忘录模式都是多状态和多备份的，每保存一次对象状态都需要消耗一定的系统资源，
 *         如果需要保存的原发器类的成员变量太多，就不可避免需要占用大量的内存存储空间，消耗资源。
 *
 * 3、适用场景：
 *
 * （1）如果有需要提供回滚操作的需求，使用备忘录模式非常适合，比如jdbc的事务操作，文本编辑器的Ctrl+Z恢复等。
 *
 * （2）保存一个对象在某一个时刻的全部状态或部分状态，这样以后需要时它能够恢复到先前的状态，实现撤销操作。防止外界对象破坏一个对象历史状态的封装性。
 */
public class Client {
    public static void main(String[] args) {
        //打BOSS之前：血、蓝全部满值
        Role role = new Role(100, 100);
        System.out.println("----------大战BOSS之前----------");
        role.display();

        //保持进度
        Caretaker caretaker1 = new Caretaker();
        caretaker1.setMemento(role.saveMemento());

        //大战BOSS，快come Over了
        role.setBloodFlow(20);
        role.setMagicPoint(20);
        System.out.println("----------大战BOSS----------");
        role.display();
        //保持进度
        Caretaker caretaker2 = new Caretaker();
        caretaker2.setMemento(role.saveMemento());

        //恢复存档
        role.restoreMemento(caretaker1.getMemento());
        System.out.println("----------恢复----------");
        role.display();

        //恢复存档
        role.restoreMemento(caretaker2.getMemento());
        System.out.println("----------恢复战后----------");
        role.display();

    }

}
