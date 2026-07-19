# Tableaux

Les tableaux permettent de stocker plusieurs valeurs du même type dans une seule structure.

Un tableau possède une taille fixe et chaque élément est accessible grâce à un index.

---

## Sommaire

- [Déclaration d'un tableau](#déclaration-dun-tableau)
- [Initialisation](#initialisation)
- [Accès aux éléments](#accès-aux-éléments)
- [Parcours d'un tableau](#parcours-dun-tableau)
- [Modification](#modification)
- [Tableaux multidimensionnels](#tableaux-multidimensionnels)
- [À retenir](#à-retenir)

---

# Déclaration d'un tableau

Un tableau se déclare avec le type suivi de `[]`.

Syntaxe :

```java
type[] nomTableau;
```
Exemple
```java
int[] numbers;
```
La déclaration indique qu'une variable pourra contenir un tableau.

---
# Initialisation

L'initialisation crée le tableau en mémoire.

Exemple :
```java
int[] numbers = new int[5];
```
Il est aussi possible d'initialiser directement avec des valeurs :
```java
int[] ages = {20, 25, 30};
```
---
# Accès aux éléments

Les éléments d'un tableau sont accessibles avec un index.

Important :

- le premier index est 0 ;
- le dernier index est taille - 1.

Exemple :
```java
int[] numbers = {10, 20, 30};

System.out.println(numbers[0]);
```
Résultat :
```java
10
```
---
# Parcours d'un tableau

Un tableau peut être parcouru avec une boucle classique :
```java
for (int i = 0; i < numbers.length; i++) {

    System.out.println(numbers[i]);

}
```
Ou avec une boucle enhanced **for** :
```java
for (int number : numbers) {

    System.out.println(number);

}
```
---

# Modification

Les valeurs d'un tableau peuvent être modifiées grâce à leur index.

Exemple :
```java
numbers[0] = 100;
```
La valeur précédente est remplacée.

---

# Tableaux multidimensionnels

Java permet de créer des tableaux avec plusieurs dimensions.

Exemple :
```java
int[][] matrix = {

    {1, 2},
    {3, 4}

};
```
Ils peuvent représenter des matrices ou des données organisées en lignes et colonnes.

---

# Limites des tableaux

La taille d'un tableau Java est fixe.

Exemple :
```java
int[] numbers = new int[5];
```
Il ne sera pas possible d'ajouter un nouvel élément après sa création.

Pour des tailles dynamiques, Java propose des collections comme :

- ArrayList
- List

---
# À retenir

Dans ce chapitre, vous avez appris :

- déclarer un tableau ;
- initialiser un tableau ;
- utiliser les index ;
- parcourir un tableau ;
- modifier des valeurs ;
- utiliser les tableaux multidimensionnels. 

--- 

# Navigation

⬅️ [Méthodes](../methodes/README.md)

➡️ Fin du module Java Basics