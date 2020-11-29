/**
 * @program: Singleton
 * @description: TODO
 * @author: Zll
 * @create: 2020-09-24 21:06
 **/
public class SingleTest1 {

    public static void main(String[] args) {
        SingleObject1 singleObject1 = SingleObject1.singleObject1;
//        SingleObject1 singleObject1 = new SingleObject1();
        singleObject1.ShowMessage();
        SingleObject1 singleObject2 = SingleObject1.getInstance();
//        SingleObject1 singleObject2 = new SingleObject1();
        System.out.println("单例模式：\n"+(singleObject1==singleObject2));
    }
}
