package com.infnet.tp5.utils;

import java.util.Scanner;

public class utils {
    public static int lerInt(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido, tente novamente");
            }
        }
    }
    public static double lerDouble(Scanner scanner) {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido, tente novamente");
            }
        }
    }
}
