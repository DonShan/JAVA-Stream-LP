package com.company.Don;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;


public class Main {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Krish", 90);
        map.put("Amal", 20);
        map.put("kumar", 85);
        map.put("Hasini", 65);


        List<Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        Collections.sort(entries, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));


//        for (Entry<String, Integer> entry : entries) {
//         System.out.println(entry.getKey() + "   " + entry.getValue()); }


        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        System.out.println("==============================>");
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).filter(e->e.getValue()>60).forEach(System.out::println);

    }
}
