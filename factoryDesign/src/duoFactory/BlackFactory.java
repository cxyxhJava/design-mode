package duoFactory;

import entity.BlackHuman;
import entity.Human;

/**
 * Created by yangxb on 2017/12/18.
 */
public class BlackFactory extends AbstractFactory{


    @Override
    public Human createHuman() {
        return new BlackHuman();
    }
}
