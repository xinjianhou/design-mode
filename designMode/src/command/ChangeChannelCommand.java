package command;

public class ChangeChannelCommand implements Command{

    private Television tv;

    public ChangeChannelCommand(Television tv){
        this.tv = tv;
    }

    public void execute(int i) {
        tv.changeChannel(i);
    }

}
