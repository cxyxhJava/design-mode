/**
 * Created by yangxb on 2017/12/18.
 */
public class BWM extends Icar {
    @Override
    void start() {
        System.out.println("BWM 启动");
    }

    @Override
    void stop() {
        System.out.println("BWM 停下");
    }

    @Override
    void engineBoom() {
        System.out.println("BWM 引擎");
    }
}
