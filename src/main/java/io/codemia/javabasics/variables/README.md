# Variables

Les variables sont l'un des concepts fondamentaux de tout langage de programmation.

Elles permettent de stocker des informations en mémoire afin de pouvoir les réutiliser, les modifier ou les manipuler pendant l'exécution d'un programme.

Sans variables, un programme serait limité à des valeurs écrites directement dans le code, ce qui le rendrait difficile à maintenir et à faire évoluer.

---

## Sommaire

- [Déclaration d'une variable](#déclaration-dune-variable)
- [Initialisation](#initialisation)
- [Réaffectation](#réaffectation)
- [Convention de nommage](#convention-de-nommage)
- [Les constantes](#les-constantes)
- [Le mot-clé var](#le-mot-clé-var)
- [Bonnes pratiques](#bonnes-pratiques)
- [Erreurs fréquentes](#erreurs-fréquentes)
- [À retenir](#à-retenir)

---

# Déclaration d'une variable

Déclarer une variable consiste à indiquer au programme qu'une valeur sera stockée en mémoire.

Une variable possède :

- un type ;
- un nom ;
- une valeur (après initialisation).

La syntaxe générale est :

```java
type nomVariable;
```

Exemple :

```java
int age;
String nom;
double prix;
```

Dans cet exemple, les variables existent mais elles ne possèdent pas encore de valeur.

---

# Initialisation

L'initialisation consiste à donner une première valeur à une variable.

```java
int age = 25;
String nom = "Alice";
```

Il est également possible de séparer la déclaration et l'initialisation :

```java
int age;

age = 25;
```

Une variable locale doit obligatoirement être initialisée avant d'être utilisée.

---

# Réaffectation

Une variable peut changer de valeur pendant l'exécution du programme.

Exemple :

```java
int age = 25;

age = 26;
```

Après la réaffectation, la variable contient la nouvelle valeur.

Les variables classiques peuvent donc évoluer au cours de l'exécution.

---

# Convention de nommage

En Java, les variables utilisent généralement la convention **camelCase**.

Exemples recommandés :

```java
String firstName;
int studentAge;
double averageScore;
```

À éviter :

```java
String FirstName;
int student_age;
double AverageScore;
```

Un bon nom de variable doit être :

- explicite ;
- compréhensible ;
- représentatif de la donnée stockée.

---

# Les constantes

Une constante est une variable dont la valeur ne peut pas être modifiée après son initialisation.

En Java, on utilise le mot-clé `final`.

Exemple :

```java
final double PI = 3.14159265359;
```

Toute tentative de modification provoquera une erreur de compilation :

```java
PI = 3.14; // Erreur
```

Par convention, les constantes utilisent généralement des lettres majuscules :

```java
final int MAX_USERS = 100;
```

---

# Le mot-clé var

Depuis Java 10, il est possible d'utiliser le mot-clé `var` afin de laisser le compilateur déterminer automatiquement le type d'une variable.

Exemple :

```java
var ville = "Paris";
var population = 2102650;
```

Le compilateur déduit automatiquement :

```java
String ville;
int population;
```

`var` ne rend pas Java dynamiquement typé.

Le type reste connu lors de la compilation.

---

# Bonnes pratiques

- Utiliser des noms de variables explicites.
- Initialiser une variable dès que possible.
- Utiliser `final` lorsqu'une valeur ne doit pas changer.
- Utiliser `var` uniquement lorsque le type reste évident à la lecture.
- Éviter les noms trop courts comme `a`, `x` ou `data` sauf dans des contextes très limités.

---

# Erreurs fréquentes

## Utiliser une variable non initialisée

❌ Exemple incorrect :

```java
int age;

System.out.println(age);
```

Une variable locale doit avoir une valeur avant d'être utilisée.

---

## Modifier une constante

❌ Exemple incorrect :

```java
final int AGE = 25;

AGE = 30;
```

Une constante ne peut pas être modifiée après son initialisation.

---

# À retenir

Dans ce chapitre, vous avez appris :

- ce qu'est une variable ;
- comment déclarer une variable ;
- comment initialiser et modifier sa valeur ;
- comment créer une constante avec `final` ;
- comment utiliser `var` ;
- les conventions de nommage en Java.

---

## Navigation

⬅️ [Introduction](../introduction/README.md)

➡️ Prochain chapître :[Type primitif](../types/README.md)