# Types

Les types définissent la nature des données qu'une variable peut stocker.

Chaque variable Java possède un type qui indique au compilateur :

- quel genre de valeur peut être stocké ;
- quelle quantité de mémoire est nécessaire ;
- quelles opérations peuvent être réalisées.

---

## Sommaire

- [Les types en Java](#les-types-en-java)
- [Les types primitifs](#les-types-primitifs)
    - [Types entiers](#types-entiers)
    - [Types décimaux](#types-décimaux)
    - [Type caractère](#type-caractère)
    - [Type booléen](#type-booléen)
- [Les types objets](#les-types-objets)
- [Le type String](#le-type-string)
- [À retenir](#à-retenir)

---

# Les types en Java

En Java, toutes les variables possèdent un type.

On distingue deux grandes familles :

- les types primitifs ;
- les types objets (également appelés types référence).

Les types primitifs sont intégrés au langage Java et permettent de manipuler les valeurs les plus courantes.

Les types objets sont des classes. Ils permettent de représenter des données plus complexes et offrent de nombreuses fonctionnalités.

---

# Les types primitifs

Java possède huit types primitifs.

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

Ces huit types peuvent être regroupés en plusieurs catégories.

---

## Types entiers

Les types entiers permettent de stocker des nombres sans partie décimale.

Exemple :

```java
int age = 25;
long population = 8000000000L;
```

Le suffixe `L` indique une valeur de type `long`.

---

## Types décimaux

Java possède deux types pour représenter des nombres décimaux.

```java
float price = 19.99F;
double pi = 3.14159265359;
```

Le type `double` offre une meilleure précision que `float`.

Le suffixe `F` est nécessaire pour les valeurs de type `float`.

---

## Type caractère

Le type `char` représente un caractère unique.

```java
char letter = 'A';
```

Les caractères sont entourés d'apostrophes simples.

---

## Type booléen

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

# Les types objets

En complément des types primitifs, Java propose les types objets.

Contrairement aux types primitifs, ils sont définis sous forme de classes et offrent de nombreuses fonctionnalités.

Parmi les types objets les plus courants, on retrouve notamment :

- `String`
- `Integer`
- `Double`
- `Boolean`

Dans ce chapitre, nous allons découvrir le type objet le plus utilisé : `String`.

---

# Le type String

`String` permet de représenter une chaîne de caractères.

Exemple :

```java
String name = "Alice";
```

Les chaînes de caractères sont entourées de guillemets doubles.

Contrairement aux types primitifs, `String` est une classe Java.

---

# À retenir

Dans ce chapitre, vous avez appris :

- le rôle des types en Java ;
- la différence entre les types primitifs et les types objets ;
- les huit types primitifs ;
- les principales catégories de types primitifs ;
- le type objet `String`.

---

## Navigation

- [Accueil](../../../../../../../README.md)
- Chapitre précédent : [Variables](../variables/README.md)
- Chapitre suivant : [Opérateurs](../operateurs/README.md)