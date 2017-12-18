package factory;

import entity.BlackMan;
import entity.Human;
import entity.YellowMan;

/**
 * Created by yangxb on 2017/12/18.
 */
public class ManFacotry implements HumanFactory {


    @Override
    public Human createYellow() {
        return new YellowMan();
    }

    @Override
    public Human createBlack() {
        return new BlackMan();
    }
}
