package com.example.java;

import java.util.ArrayList;
import java.util.List;

import com.example.java.Olive;
import com.example.java.OlivePress;

public class Main {

    public static void main(String[] args) {

        List<Olive> olives = new ArrayList<>();
        olives.add(new Olive(OliveName.KALAMATA, 0x2E0854, 3));
        olives.add(new Olive(OliveName.LIGURIAN, 0x000000, 2));
        olives.add(new Olive(OliveName.LIGURIAN, 0x2E0854, 3));

        OlivePress press = new OlivePress();
        int totalOil = press.getOil(olives);
        System.out.println("Total olive oil: " + totalOil);
        
    }
    
}
