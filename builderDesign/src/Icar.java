import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangxb on 2017/12/18.
 */
public abstract class Icar {
    private List<String> sequence = new ArrayList<>();
   abstract   void start();
    abstract void stop();
    abstract void engineBoom();
    void run(){

        for (String s : sequence) {
            if (s.equals("start")){
                this.start();
            }else if (s.equals("stop")){
                this.stop();
            }else if (s.equals("boom")){
                this.engineBoom();
            }else {
                System.out.println("不存在的操作处理");
            }
        }


    }
   final void setSequence(List<String> sequence){
        this.sequence = sequence;
   }



}
