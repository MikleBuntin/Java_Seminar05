package org.example;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
//        Scanner iScanner = new Scanner(System.in);
//        Map<Integer, String> names = new HashMap<>();
//        for (int i = 0; i < 3; i++) {
//            System.out.println("Введите номер Имя");
//            String[] name = iScanner.nextLine().split(" "); // name[0] - number, name[1] - name.
//            names.put(Integer.parseInt(name[0]), name[1]);
//        }
//        for (var el : names.entrySet()) {
//            if (el.getValue().equals("Иванов")) {
//                System.out.print(el.getKey() + ": " + el.getValue() + "\n");
//            }
//        }
//        iScanner.close();
        System.out.print(IsIzomorph());
    }


        public static Boolean IsIzomorph() {
            Map<Character, Character> pairs = new HashMap<>();
            String s1 = "adda";
            String s2 = "agga";
            if (s1.length() != s2.length())
                return false;
            if (s1.equals(s2))
                return true;
            pairs.put(s1.charAt(0), s2.charAt(0));
            for (int i = 0; i < s1.length(); i++){
                for (int j = 0; j < pairs.size(); j++){
                    if (pairs.containsKey(s1.charAt(i))) {
                        if (s2.charAt(i) != pairs.get(s1.charAt(i))) {
                            return false;
                        }
                    }
                }
                pairs.put(s1.charAt(i), s2.charAt(i));
            }
            return true;
    }
}