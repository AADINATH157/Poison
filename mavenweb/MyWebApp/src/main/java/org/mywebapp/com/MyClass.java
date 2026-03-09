package org.mywebapp.com;

import java.util.*;

public class MyClass {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        list.add("Maven");
        list.add("Plugin");

        for(String s : list){
            System.out.println(s);
        }
    }
}