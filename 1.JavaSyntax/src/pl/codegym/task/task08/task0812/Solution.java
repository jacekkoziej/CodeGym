package pl.codegym.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
1. Utwórz listę liczb.
2. Za pomocą klawiatury dodaj do listy 10 liczb.
3. Wyświetl długość najdłuższej sekwencji powtarzających się w liście liczb.

Przykład dla listy: 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
3

Wartość to 3, ponieważ najdłuższa sekwencja powtarzających się liczb to trzy czwórki.


Requirements:
1. Program musi wyświetlać liczbę na ekranie.
2. Program powinien czytać wartości z klawiatury.
3. W metodzie main zadeklaruj zmienną ArrayList z elementami Integer i natychmiast ją zainicjalizuj.
4. Program powinien dodawać do kolekcji 10 liczb zgodnie z warunkami.
5. Program powinien wyświetlać długość najdłuższej sekwencji powtarzających się w liście liczb.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();
            int j = Integer.parseInt(s);
            arrayList.add(j);
        }
        int counter = 1;
        int maxOccurences = 1;
        for (int k = 1; k < arrayList.size(); k++) {
            if (arrayList.get(k).equals(arrayList.get(k - 1))) {
                counter++;
                if (counter > maxOccurences) {
                    maxOccurences = counter;
                }
            } else {
                counter = 1;
            }
        }
        System.out.println(maxOccurences);
//
    }
}
