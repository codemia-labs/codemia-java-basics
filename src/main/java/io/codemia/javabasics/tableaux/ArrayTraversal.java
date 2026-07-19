package io.codemia.javabasics.tableaux;

public class ArrayTraversal {

    public static void run() {

        System.out.println("=== Array traversal ===");

        String[] languages = {
                "Java",
                "Spring",
                "Angular"
        };


        System.out.println("--- Using for loop ---");

        for (int i = 0; i < languages.length; i++) {

            System.out.println(languages[i]);

        }


        System.out.println("--- Using enhanced for loop ---");

        for (String language : languages) {

            System.out.println(language);

        }

        System.out.println();

    }

}