# Introduction

Bienvenue dans le premier chapitre de **Codemia Java Basics**.

Cette introduction a pour objectif de présenter le langage Java, son environnement de développement et l'organisation du projet avant de commencer les premiers exemples pratiques.

---

## Sommaire

- [Présentation de Java](#présentation-de-java)
- [L'écosystème Java](#lécosystème-java)
- [Installation de l'environnement](#installation-de-lenvironnement)
- [Structure du projet](#structure-du-projet)
- [Premier programme Java](#premier-programme-java)
- [Exécuter les exemples](#exécuter-les-exemples)

---

# Présentation de Java

Java est un langage de programmation orienté objet créé par Sun Microsystems en 1995 et aujourd'hui maintenu par Oracle et la communauté Java.

Il est utilisé dans de nombreux domaines :

- applications backend avec Spring Boot ;
- applications d'entreprise ;
- applications Android ;
- outils et plateformes distribuées.

Java est connu pour sa portabilité grâce au principe :

> "Write once, run anywhere"

Un programme Java compilé peut être exécuté sur différentes plateformes disposant d'une machine virtuelle Java.

---

# L'écosystème Java

Pour développer en Java, plusieurs éléments sont nécessaires :

## JDK

Le **Java Development Kit (JDK)** contient les outils nécessaires pour développer des applications Java :

- compilateur Java (`javac`) ;
- outils de développement ;
- environnement d'exécution.

## JVM

La **Java Virtual Machine (JVM)** est la machine virtuelle qui exécute le bytecode Java généré après compilation.

Le fonctionnement général est :

```
Code Java (.java)
        |
        v
Compilation (javac)
        |
        v
Bytecode (.class)
        |
        v
JVM
        |
        v
Exécution du programme
```

---

# Installation de l'environnement

Pour suivre cette formation, vous aurez besoin de :

- Java JDK 21 ou supérieur ;
- IntelliJ IDEA ou un autre IDE Java.

Java 21 est utilisé dans ce projet car il s'agit d'une version LTS (Long Term Support).

---

# Structure du projet

Chaque chapitre de cette formation possède sa propre organisation.

Exemple :

```
src/main/java/io/codemia/javabasics

├── introduction
│   ├── Main.java
│   └── README.md
│
├── variables
│   ├── Main.java
│   └── README.md
```

Chaque chapitre contient :

- un `README.md` pour la partie théorique ;
- une ou plusieurs classes Java pour les exemples pratiques.

---

# Premier programme Java

Le premier programme Java affiche généralement un message dans la console.

Exemple :

```java
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
    }

}
```

La méthode `main` représente le point d'entrée d'une application Java.

---

# Exécuter les exemples

Chaque chapitre possède sa propre classe `Main` afin de pouvoir exécuter les exemples de manière indépendante.

Pour lancer un exemple :

1. Ouvrir le projet avec IntelliJ IDEA.
2. Naviguer vers le chapitre souhaité.
3. Exécuter la classe `Main`.

---

## Navigation
- [Accueil](../../../../../../../README.md)
- Chapitre suivant : [Variables](../variables/README.md)
