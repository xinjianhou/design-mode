package prototypemode;

import java.util.ArrayList;
import java.util.List;

public class DeepClone extends Prototype{

    @Override
    public Prototype clone() {
        Prototype prototype = null;
        try {
            prototype = (Prototype)super.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        prototype.list = (ArrayList<String>) this.list.clone();
        return prototype;
    }


    @Override
    public void show() {
        System.out.println("deep clone!");
    }
}
