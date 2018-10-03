package com.fan.java;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shkstart
 * @date 2018/10/3 - 13:02
 */
public class Hello {
    //模板1:psvm
    public static void main(String[] args) {
        //模板2:sout
        System.out.println("hello!!");
        //soutp
        System.out.println("args = [" + args + "]");
        //soutm
        System.out.println("Hello.main");
        int num1 = 10;
        System.out.println("num1 = " + num1);

        // 模板3 for i
        String[] arr = new String[]{"Tom", "Jerry", "Hanmeimei", "Lilei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);//arr[i].sout
        }

        //变形iter
        for (String s : arr) {
            System.out.println(s);
        }

        //变形itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //模板list
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);

        //list.for
        for (Object o : list) {

        }

        //变形list.fori
        for (int i = 0; i < list.size(); i++) {

        }

        // 变形list.forr
        for (int i = list.size() - 1; i >= 0; i--) {

        }


    }

    public void method(){
        List<Integer> list = new ArrayList<>();
        list.add(123);
        list.add(345);
        list.add(567);

        // 模板 ifn (if null)
       if (list == null) {
            
        }

        //模板inn (if not null)
        if (list != null) {
            
        }

        //list.nn
        if (list != null) {

        }

        //list.null
        if (list == null) {

        }

    }
}


