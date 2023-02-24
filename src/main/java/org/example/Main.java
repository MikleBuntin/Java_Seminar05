package org.example;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        Map<Integer, String> names = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите номер Имя");
            String[] name = iScanner.nextLine().split(" "); // name[0] - number, name[1] - name.
            names.put(Integer.parseInt(name[0]), name[1]);
        }
        for (var el : names.entrySet()) {
            if (el.getValue().equals("Иванов")) {
                System.out.print(el.getKey() + ": " + el.getValue() + "\n");
            }


        }
        iScanner.close();
    }

}