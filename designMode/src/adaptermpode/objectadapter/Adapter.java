package adaptermpode.objectadapter;

// 适配器类，直接关联被适配类，同时实现标准接口
public class Adapter implements Target{
    private Adaptee adaptee ;

    public Adapter (Adaptee adaptee) {
        this.adaptee = adaptee;
    }


    @Override
    public void request() {
        this.adaptee.specificRequest();
    }
}
