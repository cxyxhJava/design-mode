package entity;

/**
 * Created by yangxb on 2017/12/14.
 */
public class BlackHuman implements Human {

 

    @Override
    public void getColor() {
        System.out.println("我是黑人");

    }

    @Override
    public void talk() {
        System.out.println("黑人说话");
    }

    @Override
    public void nengli() {
        System.out.println("黑人独特能力");
    }
}
