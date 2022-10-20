package TestMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> listStudent = new HashMap<>();
        listStudent.put("Smith", 30);
        listStudent.put("Anderson", 31);
        listStudent.put("Lewis", 29);
        listStudent.put("Cook", 29);
        listStudent.put("Cook1", 39);
        System.out.println("Display 'entries' in HashMap");
        System.out.println(listStudent +"\n");
        Map<String, Integer> treeMap = new TreeMap<>(listStudent);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        Map<String, Integer> LinkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        LinkedHashMap.put("Smith" , 30);
        LinkedHashMap.put("Anderson" , 31);
        LinkedHashMap.put("Lewis" , 29);
        LinkedHashMap.put("Cook" , 29);
        LinkedHashMap.put("Cook1" , 39);
        System.out.println("\nThe age for " + "Lewis is :" + LinkedHashMap.get("Lewis"));
        System.out.println(LinkedHashMap);
        System.out.println("\nThe age for CooK is :" + listStudent.get("Cook"));
    }


}
