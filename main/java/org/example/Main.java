package org.example;

import java.util.HashMap;
import java.util.Map;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Map<Integer,Integer > userMap = new HashMap<>();
        userMap.put(1, 2);
        userMap.put(3, null);
        userMap.put(null, 4);

        for(Map.Entry<Integer, Integer>s : userMap.entrySet()){

            try{
                System.out.println(s.getKey() + s.getValue());
            }
            catch (NullPointerException e){
                System.out.println("計算できません");
            }
        }
    }
}