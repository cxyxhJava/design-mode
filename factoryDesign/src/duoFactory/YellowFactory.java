package duoFactory;

import entity.Human;
import entity.YellowHuman;

/**
 * Created by yangxb on 2017/12/18.
 */
public class YellowFactory extends AbstractFactory {

    @Override
    public Human createHuman() {
        return new YellowHuman();
    }
}
