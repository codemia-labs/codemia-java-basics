# Conditions

Les conditions permettent à un programme de prendre des décisions en fonction de certaines valeurs.

Elles permettent d'exécuter un bloc de code uniquement lorsqu'une expression est vraie ou de choisir entre plusieurs chemins d'exécution.

---

## Sommaire

- [L'instruction if](#linstruction-if)
- [if / else](#if--else)
- [if / else if / else](#if--else-if--else)
- [Conditions imbriquées](#conditions-imbriquées)
- [L'instruction switch](#linstruction-switch)
- [Bonnes pratiques](#bonnes-pratiques)
- [À retenir](#à-retenir)

---

# L'instruction if

L'instruction `if` permet d'exécuter un bloc de code uniquement si une condition est vraie.

Syntaxe :

```java
if (condition) {
    // code exécuté si la condition est vraie
}
```

Exemple :

```java
if (age >= 18) {
    System.out.println("Majeur");
}
```

La condition doit toujours retourner une valeur booléenne :

```java
true
false
```

---

# if / else

L'instruction `if / else` permet de définir une alternative.

Si la condition est vraie, le premier bloc est exécuté.
Sinon, le bloc `else` est exécuté.

Exemple :

```java
if (age >= 18) {
    System.out.println("Majeur");
} else {
    System.out.println("Mineur");
}
```

---

# if / else if / else

Lorsque plusieurs cas sont possibles, on peut utiliser plusieurs conditions.

Exemple :

```java
if (score >= 90) {
    System.out.println("Excellent");
} else if (score >= 70) {
    System.out.println("Bien");
} else {
    System.out.println("Insuffisant");
}
```

Java teste les conditions dans l'ordre jusqu'à trouver une condition vraie.

---

# Conditions imbriquées

Une condition peut contenir une autre condition.

Exemple :

```java
if (isLogged) {

    if (isAdmin) {
        System.out.println("Admin");
    }

}
```

Cependant, trop de conditions imbriquées peuvent rendre le code difficile à lire.

---

# L'instruction switch

`switch` permet de comparer une valeur avec plusieurs possibilités.

Exemple :

```java
switch(day) {

    case 1:
        System.out.println("Lundi");
        break;

    case 2:
        System.out.println("Mardi");
        break;

    default:
        System.out.println("Inconnu");
}
```

Le mot-clé `break` permet de sortir du `switch`.

---

# Bonnes pratiques

- Garder les conditions simples et lisibles.
- Éviter les imbrications trop profondes.
- Utiliser `switch` lorsque plusieurs valeurs possibles existent.
- Donner des noms explicites aux variables booléennes.

Exemple :

Préférer :

```java
boolean isConnected;
```

plutôt que :

```java
boolean status;
```

---

# À retenir

Dans ce chapitre, vous avez appris :

- utiliser `if` ;
- créer des alternatives avec `else` ;
- gérer plusieurs cas avec `else if` ;
- utiliser des conditions imbriquées ;
- utiliser `switch`.

---

## Navigation

⬅️ [Opérateurs](../operators/README.md)

➡️ Prochain chapitre : Boucles