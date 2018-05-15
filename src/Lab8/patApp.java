package Lab8;

import jdk.nashorn.internal.ir.CatchNode;

public class patApp {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.setName("Safe");
        d1.setAge(5);
        System.out.println(d1.toString()+" "+d1.getClass().getSimpleName());

        Cat d2 = new Cat();
        d2.setName("Pee");
        d2.setAge(3);
        System.out.println(d2.toString()+" "+d2.getClass().getSimpleName());







    }//main
}//class