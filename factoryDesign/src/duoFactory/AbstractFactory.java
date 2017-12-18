package duoFactory;

import entity.Human;

/**
 * Created by yangxb on 2017/12/14.
 */
public abstract class AbstractFactory {

    /**
     * 传入类的类型在创建对应的人类
     * @return
     */
    public  abstract Human  createHuman();
}
