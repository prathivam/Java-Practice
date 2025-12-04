package DataStructures;

import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapExample {
    public MapExample(){
        HashMap<String, String> hashExample = new HashMap<String, String>();
        hashExample.put("food", "Apple");
        hashExample.put("car", "BMW");
        hashExample.put("juice", "Watermelon Juice");

        System.out.println("\n Get Food Hash Map = " + hashExample.get("food"));
        System.out.println("\n Hash Map Size = " + hashExample.size());
        System.out.println("\n Full Hash Map = "+ hashExample);

        TreeMap<String, String> treeExample = new TreeMap<String, String>();
        treeExample.put("Skynet", "yes");
        treeExample.put("resistance", "yes");
        treeExample.put("jumanji", "yes");

        System.out.println("\n Tree Example = " + treeExample.get("Skynet"));
        System.out.println("\n Tree Example Full= " + treeExample);

        LinkedHashMap<String , Integer> linkedHashExample = new LinkedHashMap<String, Integer>();
        linkedHashExample.put("SRK", 1);
        linkedHashExample.put("Amir", 2);
        linkedHashExample.put("Salman", 3);

        System.out.println("Linked Hash Map Size = "+ linkedHashExample.size());
        System.out.println("Linked Hash Map Item = "+ linkedHashExample.get("SRK"));
        System.out.println("Full Linked Hash Map = " + linkedHashExample);
    }
}
