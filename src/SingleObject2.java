/**
 * @program: Singleton
 * @description: TODO
 * @author: Zll
 * @create: 2020-09-24 21:19
 **/
public class SingleObject2 {
    private SingleObject2(){
    }

    public static SingleObject2 singleObject3 = null;

    public static SingleObject2 getInstance(){
        if (singleObject3==null){
            singleObject3 = new SingleObject2();
        }
        return singleObject3;
    }

    public void ShowMessage(){
        System.out.println("这是懒汉模式");
    }
}
