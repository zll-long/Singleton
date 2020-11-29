/**
 * @program: Singleton
 * @description: TODO
 * @author: Zll
 * @create: 2020-09-24 21:24
 **/
public class SingleTest2 {
    public static void main(String[] args) {
        SingleObject2 singleObject3 = SingleObject2.getInstance();
        SingleObject2 singleObject4 = SingleObject2.getInstance();
        singleObject3.ShowMessage();
        System.out.println("单例模式：\n"+(singleObject3==singleObject4));
    }
}
