# Boucles

Les boucles permettent de répéter l'exécution d'un bloc de code plusieurs fois.

Elles sont utilisées lorsqu'une opération doit être réalisée plusieurs fois sans écrire le même code manuellement.

---

## Sommaire

- [Boucle while](#boucle-while)
- [Boucle do while](#boucle-do-while)
- [Boucle for](#boucle-for)
- [Boucle foreach](#boucle-foreach)
- [Instruction break](#instruction-break)
- [Instruction continue](#instruction-continue)
- [Bonnes pratiques](#bonnes-pratiques)
- [À retenir](#à-retenir)

---

# Boucle while

La boucle `while` répète un bloc de code tant qu'une condition est vraie.

Syntaxe :

```java
while (condition) {
    // code exécuté
}
```

Exemple :

```java
int count = 1;

while (count <= 5) {
    System.out.println(count);
    count++;
}
```

La condition est vérifiée avant chaque exécution.

---

# Boucle do while

La boucle `do while` est similaire à `while`, mais le bloc de code est exécuté au moins une fois.

Syntaxe :

```java
do {
    // code exécuté
} while (condition);
```

Exemple :

```java
int count = 1;

do {
    System.out.println(count);
    count++;
} while (count <= 5);
```

---

# Boucle for

La boucle `for` est souvent utilisée lorsque le nombre de répétitions est connu.

Syntaxe :

```java
for (initialisation; condition; modification) {
    // code exécuté
}
```

Exemple :

```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

---

# Boucle foreach

La boucle `foreach` permet de parcourir facilement une collection ou un tableau.

Exemple :

```java
String[] names = {"Alice", "Bob"};

for (String name : names) {
    System.out.println(name);
}
```

Elle évite de gérer directement les index.

---

# Instruction break

`break` permet de sortir immédiatement d'une boucle.

Exemple :

```java
if (value == 5) {
    break;
}
```

La boucle est arrêtée même si sa condition est encore vraie.

---

# Instruction continue

`continue` permet de passer directement à l'itération suivante.

Exemple :

```java
if (value == 3) {
    continue;
}
```

Le reste du code de l'itération actuelle est ignoré.

---

# Bonnes pratiques

- Utiliser la boucle la plus adaptée au besoin.
- Éviter les boucles infinies.
- Garder les conditions de sortie faciles à comprendre.
- Préférer `foreach` lorsque l'index n'est pas nécessaire.

---

# À retenir

Dans ce chapitre, vous avez appris :

- utiliser `while` ;
- utiliser `do while` ;
- utiliser `for` ;
- parcourir des données avec `foreach` ;
- contrôler une boucle avec `break` et `continue`.

---

## Navigation

- [Accueil](../../../../../../../README.md)
- Chapitre précédent : [Conditions](../conditions/README.md)
- Chapitre suivant : [Méthodes](../methodes/README.md)