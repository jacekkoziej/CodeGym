package pl.codegym.task.task08.task0809;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* 
Czas na 10000 wstawień
Czas na 10000 wstawień
Zmierz, ile czasu zajmuje przeprowadzenie 10000 wstawień do każdej listy.
Metoda getCzasWstawienWms musi zwracać czas jej przeprowadzenia w milisekundach.


Requirements:
1. Program powinien wyświetlać liczby na ekranie.
2. Metoda main powinna wywoływać metodę getCzasWstawienWms tylko dwa razy.
3. Metoda wstaw10000(List lista) musi wstawiać 10000 pozycji do listy.
4. Metoda getCzasWstawienWms powinna wywoływać metodę wstaw10000 tylko raz.
5. Metoda getCzasWstawienWms powinna zwracać czas (w milisekundach) przeprowadzenia 10000 wstawień do listy.
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getCzasWstawienWms(new ArrayList()));
        System.out.println(getCzasWstawienWms(new LinkedList()));
    }

    public static long getCzasWstawienWms(List lista) {
        Date czasStartu = new Date();
        wstaw10000(lista);

        Date czasKonca = new Date();
        return czasKonca.getTime() - czasStartu.getTime();

    }

    public static void wstaw10000(List lista) {
        for (int i = 0; i < 10000; i++) {
            lista.add(0, new Object());
        }
    }
}
