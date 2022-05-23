package visitor;

//具体访问者：划价员、Charger.java
public class Charger extends Visitor{
    public void visitor(Medicine m) {
        System.out.println("划价员：" + name +"买药" + m.getName() +"划价:" + m.getPrice());
    }


}
