package factory;

import entity.Human;

/**
 * Created by yangxb on 2017/12/18.
 */
public interface HumanFactory {

    Human createYellow();

    Human createBlack();
}
