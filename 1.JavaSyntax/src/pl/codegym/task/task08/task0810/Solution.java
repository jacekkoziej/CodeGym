package pl.codegym.task.task08.task0810;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* 
Czas na 10000 wywołań get
Zmierz, ile czasu zajmuje przeprowadzenie 10000 wywołań get i set na każdej liście.
Metoda getCzasGetWms musi zwracać czas jej przeprowadzenia w milisekundach.


Requirements:
1. Program powinien wyświetlać liczby na ekranie.
2. Metoda main powinna wywoływać metodę getCzasGetWms tylko dwa razy.
3. Metoda main powinna wywoływać metodę wypełniającą tylko dwa razy.
4. Metoda zapelnij(List lista) musi wstawiać 10000 pozycji do listy.
5. Metoda get10000(List lista) powinna wywoływać get na liście 10000 razy.
6. Metoda getCzasGetWms musi wywoływać metodę get10000(List lista) tylko raz.
7. Metoda getCzasGetWms powinna zwracać czas (w milisekundach) przeprowadzenia 10000 wywołań get na liście.
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getCzasGetWms(zapelnij(new ArrayList())));
        System.out.println(getCzasGetWms(zapelnij(new LinkedList())));
    }

    public static List zapelnij(List lista) {
        for (int i = 0; i < 10000; i++) {
            lista.add(new Object());
        }
        return lista;
    }

    public static long getCzasGetWms(List lista) {
        Date getStart = new Date();

        get10000(lista);

        Date getKoniec = new Date();

        return getKoniec.getTime() - getStart.getTime();
    }

    public static void get10000(List lista) {
        if (lista.isEmpty()) return;
        int x = lista.size() / 2;

        for (int i = 0; i < 10000; i++) {
            lista.get(x);
        }
    }
}
