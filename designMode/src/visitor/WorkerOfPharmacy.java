package visitor;

//具体访问者：药房工作者、WorkerOfPharmacy.java
public class WorkerOfPharmacy extends Visitor{

    public void visitor(Medicine m) {
        System.out.println("药房工作者：" + name + "拿药 ：" + m.getName());
    }


}
