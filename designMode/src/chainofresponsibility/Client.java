package chainofresponsibility;

/**
 *  职责链可以将请求的处理者组织成一条链，并将请求沿着链传递，如果某个处理者能够处理请求则处理，否则将该请求交由上级处理。客户端只需将请求发送到职责链上，
 *  无须关注请求的处理细节，通过职责链将请求的发送者和处理者解耦了，这也是职责链的设计动机。
 *
 *        职责链模式可以简化对象间的相互连接，因为客户端和处理者都没有对方明确的信息，同时处理者也不知道职责链中的结构，处理者只需保存一个指向后续者的引用，而不需要保存所有候选者的引用。
 *
 *         另外职责链模式增加了系统的灵活性，我们可以任意增加或更改处理者，甚至更改处理者的顺序，不过有可能会导致一个请求无论如何也得不到处理，因为它可能被放置在链末端。
 *
 *
 * 所以责任链模式有以下几个优点：
 *
 * （1）降低耦合度，将请求的发送者和接收者解耦。反映在代码上就是不需要在类中写很多丑陋的 if….else 语句，
 *  如果用了职责链，相当于我们面对一个黑箱，只需将请求递交给其中一个处理者，然后让黑箱内部去负责传递就可以了。
 * （2）简化了对象，使得对象不需要链的结构。
 * （3）增加系统的灵活性，通过改变链内的成员或者调动他们的次序，允许动态地新增或者删除处理者
 * （4）增加新的请求处理类很方便。
 * 但是责任链模式也存在一些缺点：
 *
 * （1）不能保证请求一定被成功处理
 * （2）系统性能将受到一定影响，并且可能会造成循环调用。
 * （3）可能不容易观察运行时的特征，而且在进行代码调试时不太方便，有碍于除错。
 */
public class Client {
    public static void main(String[] args) {
        Leader instructor = new Instructor("陈毅");       //辅导员
        Leader departmentHead = new DepartmentHead("王明");    //系主任
        Leader dean = new Dean("张强");      //院长
        Leader president = new President("王晗");     //校长

        instructor.setSuccessor(departmentHead);       //辅导员的后续者是系主任
        departmentHead.setSuccessor(dean);             //系主任的后续者是院长
        dean.setSuccessor(president);                  //院长的后续者是校长

        //请假3天的请假条
        LeaveNode leaveNode1 = new LeaveNode("张三", 3);
        instructor.handleRequest(leaveNode1);

        //请假9天的请假条
        LeaveNode leaveNode2 = new LeaveNode("李四", 9);
        instructor.handleRequest(leaveNode2);

        //请假15天的请假条
        LeaveNode leaveNode3 = new LeaveNode("王五", 15);
        instructor.handleRequest(leaveNode3);

        //请假20天的请假条
        LeaveNode leaveNode4 = new LeaveNode("赵六", 20);
        instructor.handleRequest(leaveNode4);
    }
}
