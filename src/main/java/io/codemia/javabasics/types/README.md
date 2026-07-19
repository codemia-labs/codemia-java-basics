# Types

Les types définissent la nature des données qu'une variable peut stocker.

Chaque variable Java possède un type qui indique au compilateur :

- quel genre de valeur peut être stocké ;
- quelle quantité de mémoire est nécessaire ;
- quelles opérations peuvent être réalisées.

---

## Sommaire

- [Types primitifs](#types-primitifs)
- [Types entiers](#types-entiers)
- [Types décimaux](#types-décimaux)
- [Type caractère](#type-caractère)
- [Type booléen](#type-booléen)
- [Type String](#type-string)
- [À retenir](#à-retenir)

---

# Types primitifs

Java possède 8 types primitifs :

| Type | Description |
|------|-------------|
| byte | Petit nombre entier |
| short | Nombre entier court |
| int | Nombre entier classique |
| long | Grand nombre entier |
| float | Nombre décimal simple précision |
| double | Nombre décimal double précision |
| char | Un caractère |
| boolean | Valeur vraie ou fausse |

---

# Types entiers

Les types entiers permettent de stocker des nombres sans partie décimale.

Exemples :

```java
int age = 25;
long population = 8000000000L;
```

Les suffixes sont importants :

- `L` pour un `long`

---

# Types décimaux

Java possède deux types principaux pour les nombres décimaux :

```java
float price = 19.99F;
double pi = 3.14159265359;
```

Différence :

- `float` utilise moins de mémoire ;
- `double` offre une meilleure précision.

Le suffixe `F` permet d'indiquer une valeur `float`.

---

# Type caractère

Le type `char` représente un seul caractère.

Exemple :

```java
char letter = 'A';
```

Un caractère utilise des apostrophes simples.

---

# Type booléen

Le type `boolean` représente une valeur logique.

Il possède uniquement deux valeurs :

```java
true
false
```

Exemple :

```java
boolean isConnected = true;
```

---

# Type String

`String` permet de représenter une chaîne de caractères.

Contrairement aux types précédents, `String` n'est pas un type primitif mais une classe Java.

Exemple :

```java
String name = "Alice";
```

Les chaînes utilisent des guillemets doubles.

---

# À retenir

Dans ce chapitre, vous avez appris :

- le rôle des types ;
- les 8 types primitifs Java ;
- les nombres entiers ;
- les nombres décimaux ;
- les caractères ;
- les valeurs booléennes ;
- les chaînes de caractères.

---

## Navigation

⬅️ [Variables](../variables/README.md)

➡️ Prochain chapitre : Opérateurs