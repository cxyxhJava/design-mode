import entity.Human;
import factory.ManFacotry;
import factory.WomanFactory;

/**
 * Created by yangxb on 2017/12/18.
 */
public class NvWa {


    public static void main(String[] args){

        //抽象工厂,用来生产同一类产品的不同产品族,比如人里面黑人,白人,黄种人等.
        // 产品等级拓展还是方便的 比如正价一个性别为阴阳,只要再加一个工厂类就可以了(横向拓展方便,纵向不方便)

        WomanFactory womanFactory = new WomanFactory();
        Human  blackWoman =  womanFactory.createBlack();
        blackWoman.getColor();
        blackWoman.setSexs();

        ManFacotry manFacotry = new ManFacotry();

        Human yellowMan = manFacotry.createYellow();

        yellowMan.setSexs();
        yellowMan.getColor();


    }
}
