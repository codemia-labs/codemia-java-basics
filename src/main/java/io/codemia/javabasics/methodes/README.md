# Méthodes

Les méthodes permettent de regrouper des instructions dans un bloc de code réutilisable.

Elles permettent d'organiser un programme, éviter la duplication et rendre le code plus lisible.

---

## Sommaire

- [Déclaration d'une méthode](#déclaration-dune-méthode)
- [Paramètres](#paramètres)
- [Valeur de retour](#valeur-de-retour)
- [Surcharge de méthodes](#surcharge-de-méthodes)
- [Paramètres variables](#paramètres-variables)
- [À retenir](#à-retenir)

---

# Déclaration d'une méthode

Une méthode est définie avec :

```java
modificateur typeRetour nomMethode() {
    
}
```
Exemple:
```java
public static void afficherMessage() {

    System.out.println("Bonjour");

}
```

Une méthode void ne retourne aucune valeur.

---
# Paramètres

 Les paramètres permettent de transmettre des informations à une méthode.

Exemple :
```java
public static void afficherNom(String nom) {

    System.out.println(nom);

}
```
Lors de l'appel :
```java
afficherNom("Alice");
```
La valeur **"Alice"** est passée comme argument.

---
# Valeur de retour

 Une méthode peut retourner une valeur avec le mot-clé return.

Exemple :
```java
public static int additionner(int a, int b) {

    return a + b;

}
```
Le type de retour doit être indiqué dans la déclaration.

---
# Surcharge de méthodes

La surcharge permet de créer plusieurs méthodes avec le même nom mais avec des paramètres différents.

Exemple :
```java
afficher(int nombre);

afficher(String texte);
```
Java choisit automatiquement la méthode correspondante selon les arguments fournis.

---
# Paramètres variables

Les varargs permettent de recevoir un nombre variable de paramètres.

Syntaxe :
```java
public static void afficher(int... valeurs) {

}
```
Exemple :
```java
afficher(1, 2, 3, 4);
```
Java transforme ces valeurs en tableau.

---
# À retenir

Dans ce chapitre, vous avez appris :

créer une méthode ;
- utiliser des paramètres ;
- retourner une valeur ;
- surcharger une méthode ;
- utiliser les paramètres variables.
---
# Navigation

⬅️ [Boucles](../boucles/README.md)

➡️ Prochain chapitre : [Tableaux](../tableaux/README.md)