/**
 * Created by yangxb on 2017/12/18.
 */
public class client {
    public static void main(String[] args){


        //不同的方法运行数据,获得不同的对象结果,需要增加产品,只需要在directer类添加不同的顺序即可,
        // 获取到的都是抽象类,不对实际类型进行操作.符合依赖倒置原则,面向接口开发,这样添加更多品牌汽车,在Icar不需要变化的情况下,调用者可以完全不用更改代码

        Directer directer = new Directer();
        System.out.println("BenzB");
       Icar benzB =  directer.createBeazB();
       benzB.run();
        System.out.println("BenzA");
        Icar benzA =  directer.createBenzA();
        benzA.run();
        System.out.println("BWNB");
        Icar bwmB =  directer.crrateBMWB();
        bwmB.run();
        System.out.println("BWNA");
        Icar bwmA =  directer.createBMWA();
        bwmA.run();

    }
}
