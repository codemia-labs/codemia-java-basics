package io.codemia.javabasics.boucles;

public class ForEachLoop {

    public static void run() {

        System.out.println("=== Boucle foreach ===");

        String[] languages = {"Java", "Spring", "Angular"};

        for (String language : languages) {
            System.out.println(language);
        }

        System.out.println();

    }

}