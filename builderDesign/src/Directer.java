import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangxb on 2017/12/18.
 */
public class Directer {
    BWMBuilder bwmBuilder = new BWMBuilder();

    BeanzBuild beanzBuild = new BeanzBuild();

    public Icar createBMWA(){
        return createA(bwmBuilder);
    }
    public Icar crrateBMWB(){
        return createB(bwmBuilder);
    }

    public Icar createBenzA(){
        return createA(beanzBuild);
    }
    public Icar createBeazB(){
        return createB(beanzBuild);
    }

    private Icar createA(CarBuilder carBuilder){
        List<String> sequence = new ArrayList<>();
        sequence.add("start");
        sequence.add("stop");
        carBuilder.setSequence(sequence);
        return carBuilder.getCar();

    }
    private Icar createB(CarBuilder carBuilder){
        List<String> sequence = new ArrayList<>();
        sequence.add("start");
        sequence.add("boom");
        sequence.add("stop");
        carBuilder.setSequence(sequence);
        return carBuilder.getCar();
    }



}
