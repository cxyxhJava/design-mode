/**
 * Created by yangxb on 2017/12/18.
 */
public class Benz extends Icar {
    @Override
    public void start() {
        System.out.println("benz 启动");
    }

    @Override
    public void stop() {
        System.out.println("benz 停止");
    }

    @Override
    public void engineBoom() {
        System.out.println("benz 引擎");
    }

}
