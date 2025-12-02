package DataStructures;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public ArrayListExample(){
        List<String> food = new ArrayList<String>();
        food.add("Burger");
        food.add("Pizza");

        food.add(0, "Fries");
        food.addFirst("Taco");

        System.out.println("ArrayList last element = " + food.getLast());
    }
}
