package pl.codegym.task.task08.task0815;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* 
Spis ludności
*/

public class Solution {
    public static HashMap<String, String> utworzMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Kowalski", "Jan");
        map.put("Różal", "Gosia");
        map.put("Bytomski", "Basia");
        map.put("Kowal", "Janina");
        map.put("Kokolak", "Jarek");
        map.put("Kolak", "Arek");
        map.put("Marek", "Marek");
        map.put("Pender", "Jan");
        map.put("Najman", "Bożena");
        map.put("Rozwadowski", "Jacek");

        return map;
    }

    public static int getLicznikTakichSamychImion(HashMap<String, String> map, String imie) {
        return Collections.frequency(new ArrayList<>(map.values()), imie);
    }

    public static int getLicznikTakichSamychNazwisk(HashMap<String, String> map, String nazwisko) {
        if (map.containsKey(nazwisko)) {
            return 1;
        }
        return 0;


    }

    public static void main(String[] args) {
        HashMap<String, String> map = utworzMap();
        String name = "Jan";
        String surname = "Kowalski";
        int namesCount = getLicznikTakichSamychImion(map, name);
        int surnamesCount = getLicznikTakichSamychNazwisk(map, surname);
//        System.out.println("names count: " + namesCount + " for name " + name);
//        System.out.println("surnames count: " + surnamesCount + " for surname " + surname);
    }
}
