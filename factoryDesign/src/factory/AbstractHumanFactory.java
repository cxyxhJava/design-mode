package factory;

import entity.Human;

/**
 * Created by yangxb on 2017/12/14.
 */
public abstract class AbstractHumanFactory {

    /**
     * 传入类的类型在创建对应的人类
     * @param c
     * @param <T>
     * @return
     */
    public  abstract <T extends Human> T createHuman(Class<T> c);
}
