package com.fan.java;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shkstart
 * @date 2018/10/3 - 20:04
 */
public class DebugTest {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println("i = " + i);
        }
        Map<String,String> map = new HashMap<>();
        map.put("name","Tom");
        map.put("age","12");
        map.put("school","Tsinghua");
        map.put("major","computer");

        String age = map.get("age");//alt + enter
        System.out.println("age = " + age);

        map.remove("major");
        System.out.println(map);
    }
}
