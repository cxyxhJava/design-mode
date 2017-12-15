import myInterface.Ibook;

import java.util.List;

/**
 * Created by yangxb on 2017/11/28.
 */
public class Main {
    public static void main(String[] args){

        Bookstore bookstore = new Bookstore();

        List<Ibook> bookes = bookstore.getAllbooks();

        for (Ibook booke : bookes) {
            System.out.println( booke.getClass());
           System.out.println(booke.toString());
           System.out.println("--------------------");
        }

    }
}
