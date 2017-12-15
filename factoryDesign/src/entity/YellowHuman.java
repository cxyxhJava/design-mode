package entity;

/**
 * Created by yangxb on 2017/12/14.
 */
public class YellowHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("黄忠人");
    }

    @Override
    public void talk() {
        System.out.println("黄种人说话");
    }
    @Override
    public void nengli() {
        System.out.println("黄种人独特能力");
    }
}
