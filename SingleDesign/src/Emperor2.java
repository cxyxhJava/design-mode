/**
 * Created by yangxb on 2017/11/28.
 */
public class Emperor2 {
    private Emperor2 emperor2 = null;


    private Emperor2() {

    }

    public Emperor2 getInstence(){
        if (emperor2==null){
            emperor2 = new Emperor2();
        }
        return emperor2;
    }

}

class Emperor3{

}