package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите примерный расход (кг) см. на упаковке: ");
        double rashod = scanner.nextDouble();
        System.out.print("Введите среднюю толщину желаемого слоя штукатурки (мм) : ");
        double tolshina_sloya = scanner.nextDouble();
        System.out.print("Введите площадь штукатуриваемых стен (м.кв.): ");
        double ploshad_sten = scanner.nextDouble();
        // Calculate the number of bags required
        double plasterNeeded = rashod * tolshina_sloya * ploshad_sten;
        double bagsRequired = Math.ceil(plasterNeeded / 25);
        // Display the result
        System.out.println("You will need " + bagsRequired + " bags of plaster.");

        scanner.close();
    }
}
