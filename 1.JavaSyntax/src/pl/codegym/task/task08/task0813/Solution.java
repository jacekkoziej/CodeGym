package pl.codegym.task.task08.task0813;

import java.util.Set;
import java.util.HashSet;

/*
20 wyrazów, które zaczynają się na literę „L”
Musisz utworzyć Set<String> i dodać 20 wyrazów, które zaczynają się na literę „L”.


Requirements:
1. Nie zmieniaj sygnatury metody utworzSet().
2. Program nie powinien wyświetlać tekstu na ekranie.
3. Program nie powinien czytać wartości z klawiatury.
4. Metoda utworzSet() musi tworzyć i zwracać set (HashSet).
5. Set zwrócony przez metodę utworzSet() musi zawierać 20 słów, które zaczynają się literą „L”.
*/

public class Solution {
    public static Set<String> utworzSet() {
        //tutaj wpisz swój kod
        HashSet<String> set = new HashSet<String>();
        for (int i = 0; i < 20; i++) {
            String j = Integer.toString(i);
            set.add("Lowel" + j);
        }

        return set;
    }

    public static void main(String[] args) {

    }
}
