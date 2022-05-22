package cmposite;

/**
 * 组合模式将叶子对象和容器对象进行递归组合，形成树形结构以表示“部分-整体”的层次结构，使得用户对单个对象和组合对象的使用具有一致性，
 * 能够像处理叶子对象一样来处理组合对象，无需进行区分，从而使用户程序能够与复杂元素的内部结构进行解耦。
 *
 *         组合模式最关键的地方是叶子对象和组合对象实现了相同的抽象构建类，它既可表示叶子对象，
 *         也可表示容器对象，客户仅仅需要针对这个抽象构建类进行编程，这就是组合模式能够将叶子节点和对象节点进行一致处理的原因。
 *
 *
 */
public class Client {
    public static void main(String[] args) {
        /**
         * 我们先建立一个这样的文件系统
         *                  总文件
         *
         *   a.txt    b.jpg                   c文件夹
         *                      c_1.text  c_1.rmvb    c_1.jpg
         */
        //总文件夹
        Folder zwjj = new Folder("总文件夹");
        //向总文件夹中放入三个文件：1.txt、2.jpg、1文件夹
        TextFile aText= new TextFile("a.txt");
        ImagerFile bImager = new ImagerFile("b.jpg");
        Folder cFolder = new Folder("C文件夹");

        zwjj.add(aText);
        zwjj.add(bImager);
        zwjj.add(cFolder);

        //向C文件夹中添加文件：c_1.txt、c_1.rmvb、c_1.jpg
        TextFile cText = new TextFile("c_1.txt");
        ImagerFile cImage = new ImagerFile("c_1.jpg");
        VideoFile cVideo = new VideoFile("c_1.rmvb");

        cFolder.add(cText);
        cFolder.add(cImage);
        cFolder.add(cVideo);

        zwjj.display();


        System.out.println("-----------------------");
        cFolder.display();
    }

}
