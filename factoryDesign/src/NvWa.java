import entity.BlackHuman;
import entity.YellowHuman;
import factory.HumanFactory;

/**
 * Created by yangxb on 2017/12/14.
 */
public class NvWa {

    public static void main(String[] args){
        //通过工厂创建,对于使用着来说  不需要知道创建过程,由工厂代劳,解耦
        //扩展性,只需要增加不同的人种,就可以拓展
        //基本用法,主类存放基础公共方法,子类实现自己的特有方法

        //创建工厂

        HumanFactory humanFactory = new HumanFactory();

        //创建黄种人
        YellowHuman yellowHuman =  humanFactory.createHuman(YellowHuman.class);

        yellowHuman.getColor();
        yellowHuman.talk();

        BlackHuman blackHuman = humanFactory.createHuman(BlackHuman.class);

        blackHuman.getColor();
        blackHuman.talk();







    }




}
