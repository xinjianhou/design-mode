package prototypemode;

import java.util.ArrayList;
import java.util.List;

public abstract class Prototype implements Cloneable {
    protected ArrayList<String> list = new ArrayList<String>();

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public abstract void show();



}
