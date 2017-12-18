package factory;

import entity.BlackWoman;
import entity.Human;
import entity.YellowWoman;

/**
 * Created by yangxb on 2017/12/18.
 */
public class WomanFactory implements HumanFactory {
    @Override
    public Human createYellow() {
        return new YellowWoman();
    }

    @Override
    public Human createBlack() {
        return new BlackWoman();
    }
}
