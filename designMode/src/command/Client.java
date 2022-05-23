package command;


/**
 *
 *  命令模式的本质是将请求封装成对象，将发出命令与执行命令的责任分开，命令的发送者和接收者完全解耦，发送者只需知道如何发送命令，
 *  不需要关心命令是如何实现的，甚至是否执行成功都不需要理会。命令模式的关键在于引入了抽象命令接口，发送者针对抽象命令接口编程，
 *  只有实现了抽象命令接口的具体命令才能与接收者相关联。另外命令可以像强对象一样可以被存储和传递，所以可支持撤销的操作
 *
 *         使用命令模式的优势在于降低了系统的耦合度，而且新命令可以很方便添加到系统中，也容易设计一个组合命令。
 *         但缺点在于会导致某些系统有过多的具体命令类，因为针对每一个命令都需要设计一个具体命令类。
 *         所以命令模式适用于以下场景：
 *      （1）需要将请求调用者和请求接收者解耦，使得调用者和接收者不直接交互。
 *      （2）系统需要在不同的时间指定请求、将请求排队和执行请求。
 *       (3）系统需要支持命令的撤销(Undo)操作和恢复(Redo)操作。
 *       (4）系统需要将一组操作组合在一起，即支持宏命令。
 *
 */
public class Client {

    public static void main(String[] args) {

            Television tv = new Television();
            Command openCommand,closeCommand,changeCommand;

            openCommand = new OpenTvCommand(tv);
            closeCommand = new CloseTvCommand(tv);
            changeCommand = new ChangeChannelCommand(tv);

            Controller control = new Controller(openCommand,closeCommand,changeCommand);

            control.open();           //打开电视机
            control.change();         //换频道
            control.change();
            control.ChannelUndo();
            control.ChannelUndo();
            control.ChannelUndo();
            control.close();         //关闭电视机

        }
}
