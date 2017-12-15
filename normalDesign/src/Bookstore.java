import impl.JavaBook;
import impl.NoverBookImpl;
import myInterface.Ibook;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangxb on 2017/11/28.
 */
public class Bookstore {

    List ibooks = new ArrayList<Ibook>();

   /* protected volatile List<Service> upServerList = Collections
            .synchronizedList(new ArrayList<Service>());*/


    public Bookstore() {
        ibooks.add(new JavaBook("think in java",47.89,"frank"));
        ibooks.add(new JavaBook("think in java2",47.89,"frank2"));

        ibooks.add(new NoverBookImpl("霸道总裁",47.89,"frank2","面向妹子"));
    }

    public List<Ibook> getAllbooks(){
       return ibooks;
   }

}
