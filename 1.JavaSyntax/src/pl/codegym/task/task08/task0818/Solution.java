package pl.codegym.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Tylko dla bogaczy
*/

public class Solution {
    public static HashMap<String, Integer> utworzMap() {
        HashMap<String, Integer> mapa = new HashMap<>();
        mapa.put("Kowalsksi", 400);
        mapa.put("Różdal", 600);
        mapa.put("Bystomski", 855);
        mapa.put("Kowdal", 454);
        mapa.put("Koksolak", 1700);
        mapa.put("Koldak", 250);
        mapa.put("Marsek", 2800);
        mapa.put("Pendder", 65);
        mapa.put("Najman", 8000);
        mapa.put("Rozwadowski", 18000);

        return mapa;
    }

    public static void usunPozycjeZmap(HashMap<String, Integer> map) {
        map.entrySet()
                .removeIf(
                        entry -> (entry.getValue() < 500));

    }

    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = utworzMap();
        usunPozycjeZmap(hashMap);
        //hashMap.forEach((key, value) -> System.out.println(key + " " + value));
    }
}
