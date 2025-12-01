package DataStructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class DSExamples {
    public DSExamples(){
//        Dynamic Size ArrayList
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Pigeon");
        animals.add("Fox");

        System.out.println("\n ArrayList items = " + animals);

//        HashSet - No Duplicates
        HashSet<String> companies = new HashSet<String>();
        companies.add("Microsoft");
        companies.add("Google");

        System.out.println(companies);

//        Hash Map - Key Value Paris
        HashMap<String, String> cities = new HashMap<String, String>();
        cities.put("India", "Delhi");
        cities.put("USA", "Washington DC");
        cities.put("England", "London");
    }
}