/**
 * @program: Singleton
 * @description: TODO
 * @author: Zll
 * @create: 2020-09-24 21:03
 **/
public class SingleObject1 {
    private SingleObject1(){
    }

    public static SingleObject1 singleObject1 = new SingleObject1();

    public static SingleObject1 getInstance(){
        return singleObject1;
    }

    public void ShowMessage(){
        System.out.println("这是饿汉模式");
    }
}
