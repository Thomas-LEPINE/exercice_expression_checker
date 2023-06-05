import car.Car;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("");
    }

    public boolean testChaine(final String chaine) {
        Deque<Character> symbol = new ArrayDeque<>();
        for (char c : chaine.toCharArray()) {
            switch (c) {
                case '(':
                case '[':
                    symbol.push(c);
                    break;
                case ')':
                    if (!symbol.pop().equals('(')) {
                        return false;
                    }
                    break;
                case ']':
                    if (!symbol.pop().equals('[')) {
                        return false;
                    }
                    break;
            }
        }

        return symbol.isEmpty();
    }
}