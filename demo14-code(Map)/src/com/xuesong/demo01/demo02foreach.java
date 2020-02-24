package com.xuesong.demo01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class demo02foreach {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("apple",123);
        map.put("banana",456);
        map.put("orange",789);
        //遍历key
        for(String s : map.keySet()){
            System.out.println(s);
        }

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> entry2 = iterator.next();
            String key = entry2.getKey();
            Integer value = entry2.getValue();
            System.out.println("key:"+key);
            System.out.println("value"+value);

        }


        //遍历key&value
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            String keys = entry.getKey();
            Integer values = entry.getValue();
            System.out.println(keys+"="+values);
        }
    }
}
