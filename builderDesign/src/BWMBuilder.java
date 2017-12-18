import java.util.List;

/**
 * Created by yangxb on 2017/12/18.
 */
public class BWMBuilder extends CarBuilder {

    BWM bwm = new BWM();

    @Override
    public void setSequence(List<String> sequence) {
        this.bwm.setSequence(sequence);
    }

    @Override
    public Icar getCar() {
        return this.bwm;
    }
}
