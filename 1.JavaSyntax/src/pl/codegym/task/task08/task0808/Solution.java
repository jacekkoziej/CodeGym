package pl.codegym.task.task08.task0808;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Używając ArrayList i LinkedList, przeprowadź 10000 wstawień, usunięć i wywołań get i set.


Requirements:
1. Program nie powinien wyświetlać tekstu na ekranie.
2. Program nie powinien czytać wartości z klawiatury.
3. Klasa Solution musi zawierać tylko 5 metod.
4. Metoda wstaw10000(List lista) musi wstawiać 10000 pozycji do listy.
5. Metoda get10000(List lista) powinna wywoływać get na liście 10000 razy.
6. Metoda set10000(List lista) powinna wywoływać set na liście 10000 razy.
7. Metoda usun10000(List lista) musi usuwać 10000 pozycji z listy.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // ArrayList
        ArrayList arrayList = new ArrayList();
        wstaw10000(arrayList);
        get10000(arrayList);
        set10000(arrayList);
        usun10000(arrayList);

        // LinkedList
        LinkedList linkedList = new LinkedList();
        wstaw10000(linkedList);
        get10000(linkedList);
        set10000(linkedList);
        usun10000(linkedList);
    }

    public static void wstaw10000(List lista) {
        for(int i = 0; i < 10000; i++){
            lista.add(1);
        }

    }

    public static void get10000(List lista) {
        for(int i = 0; i < 10000; i++){
            lista.get(i);
        }

    }

    public static void set10000(List lista) {
        for(int i = 0; i < 10000; i++){
            lista.set(i, 2);
        }

    }

    public static void usun10000(List lista) {
        for(int i = 0; i < 10000; i++){
            lista.clear();
        }

    }
}
