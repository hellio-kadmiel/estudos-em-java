package application;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {


    List<Integer> integerList = new ArrayList<Integer>();
            integerList.add(10);
            integerList.add(20);
            List <? extends Number> numberList = integerList;
            Number x = numberList.get(0);
            // Covarincia, quando a referência é de um tipo mais genérico, mas o objeto é de um tipo mais específico.
            numberList.add(20.0); // Compile error

        List<Object> myObjs= new ArrayList<Object>();
        myObjs.add("Hello");
        myObjs.add("Alex");
        List<? super Number> myStrs = myObjs;
        myStrs.add(1);
        myObjs.add(3.10);
        // Contravariancia, quando a referência é de um tipo mais específico, mas o objeto é de um tipo mais genérico.
        Number x = myStrs.get(0); // Compile error



    }


}
