package week11;

import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Set;


public class Homework11 {
    public static void main(String[] args) {

//
//        HashMap<String, Integer> test = new HashMap<String, Integer>();
//        test.put("A", 1);
//        test.put("B", 2);
//        test.put("A", 2);
//        test.put("C", 3);
//        System.out.println(test);
////
//        Set<String> test2 = test.keySet();
//
//        for (String key : test2) {
//            System.out.println("key is " + key + " value is " + test.get(key));
//        }
//
//        System.out.println(test.get("E"));

//    HashMap<HashMap, Integer> doubleMap = new HashMap<HashMap, Integer>();
//    doubleMap.put(test, 3);
//    System.out.println(doubleMap);
//
//    Map<Map<String, Integer>, String> mapofMaps = new HashMap<Map<String, Integer>, String>();
//    Map<String, Integer> test3 = new HashMap<String, Integer>();
//    test3.put("hi", 100);
//    mapofMaps.put(test, "one");
//    mapofMaps.put(test3, "two");
//        System.out.println(mapofMaps);

        Set<Integer> treeSet = new TreeSet<>();

        treeSet.add(5);
        treeSet.add(6);
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(6);
        treeSet.add(10);


        Map<String, Integer> treeMap = new TreeMap<>();

        for (int element : treeSet)
        {
            treeMap.put(element + "", element);
        }

        System.out.println(treeMap);
        System.out.println(treeSet);
    }
}