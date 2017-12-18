import java.util.List;

/**
 * Created by yangxb on 2017/12/18.
 */
public class BeanzBuild extends CarBuilder {

    Benz benz = new Benz();

    @Override
    public void setSequence(List<String> sequence) {
        this.benz.setSequence(sequence);
    }

    @Override
    public Icar getCar() {
        return this.benz;
    }
}
