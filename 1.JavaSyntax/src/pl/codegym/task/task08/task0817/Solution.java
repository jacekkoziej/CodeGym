package pl.codegym.task.task08.task0817;

import java.util.*;

/* 
Powtórzenia nie są potrzebne
*/

public class Solution {
    public static HashMap<String, String> utworzMap() {
        HashMap<String, String> mapa = new HashMap<>();
        mapa.put("Kowalsksi", "Jan");
        mapa.put("Różdal", "Gosia");
        mapa.put("Bystomski", "Basia");
        mapa.put("Kowdal", "Janina");
        mapa.put("Koksolak", "Jarek");
        mapa.put("Koldak", "Jan");
        mapa.put("Marsek", "Marek");
        mapa.put("Pendder", "Jan");
        mapa.put("Najman", "Bożena");
        mapa.put("Rozwadowski", "Jacek");

        return mapa;
    }

    public static void usunPowtorzoneImiona(Map<String, String> mapa) {
        //tutaj wpisz swój kod
        HashMap<String, String> kopiaPierwsza = new HashMap<String, String>(mapa);
        HashMap<String, String> kopiaDruga = new HashMap<String, String>(mapa);

        for (Map.Entry<String, String> para1 : kopiaPierwsza.entrySet()) {
            String imie1 = para1.getValue();
            String nazwisko1 = para1.getKey();

            for (Map.Entry<String, String> para2 : kopiaDruga.entrySet()) {
                String imie2 = para2.getValue();
                String nazwisko2 = para2.getKey();

                if (imie2.equals(imie1) && !nazwisko2.equals(nazwisko1)) {
                    usunElementZMapPoWartosci(mapa, imie2);
                }
            }
        }
    }

    public static void usunElementZMapPoWartosci(Map<String, String> mapa, String wartosc) {
        HashMap<String, String> kopia = new HashMap<String, String>(mapa);
        for (Map.Entry<String, String> para : kopia.entrySet()) {
            if (para.getValue().equals(wartosc))
                mapa.remove(para.getKey());
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> hashMap = utworzMap();
        usunPowtorzoneImiona(hashMap);
    }
}
