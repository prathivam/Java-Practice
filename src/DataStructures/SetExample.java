package DataStructures;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {
    public SetExample(){
        HashSet<Integer> hashArray = new HashSet<Integer>();
        TreeSet<Integer> treeArray = new TreeSet<Integer>();
        LinkedHashSet<Integer> linkedArray = new LinkedHashSet<Integer>();

        hashArray.add(1);
        hashArray.add(10);
        hashArray.add(20);
        hashArray.add(3);

        treeArray.add(1);
        treeArray.add(10);
        treeArray.add(5);
        treeArray.add(3);

        linkedArray.add(20);
        linkedArray.add(1);
        linkedArray.add(5);
        linkedArray.add(30);

        System.out.println("\n Hash Set  = " + hashArray);
        System.out.println("\n Tree Set = " + treeArray);
        System.out.println("\n Linked Hash Set = " + linkedArray);
    }
}
