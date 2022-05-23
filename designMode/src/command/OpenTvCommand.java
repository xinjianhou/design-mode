package command;

public class OpenTvCommand implements Command{
    private Television tv;

    public OpenTvCommand(Television tv){
        this.tv = tv;
    }

    public void execute(int i) {
        tv.open();
    }
}
