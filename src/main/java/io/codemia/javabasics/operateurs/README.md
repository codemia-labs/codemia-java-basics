# Opérateurs

Les opérateurs permettent d'effectuer des opérations sur des valeurs ou des variables.

Ils sont utilisés pour calculer, comparer des valeurs, modifier des variables ou construire des expressions logiques.

---

## Sommaire

- [Opérateurs arithmétiques](#opérateurs-arithmétiques)
- [Opérateurs d'affectation](#opérateurs-daffectation)
- [Opérateurs de comparaison](#opérateurs-de-comparaison)
- [Opérateurs logiques](#opérateurs-logiques)
- [Opérateur ternaire](#opérateur-ternaire)
- [Bonnes pratiques](#bonnes-pratiques)
- [À retenir](#à-retenir)

---

# Opérateurs arithmétiques

Les opérateurs arithmétiques permettent de réaliser des calculs.

| Opérateur | Description |
|-----------|-------------|
| `+` | Addition |
| `-` | Soustraction |
| `*` | Multiplication |
| `/` | Division |
| `%` | Modulo |

Exemple :

```java
int result = 10 + 5;
```

---

# Opérateurs d'affectation

Ils permettent d'affecter ou de modifier la valeur d'une variable.

Exemples :

```java
int value = 10;

value += 5;
value -= 2;
```

Équivalent à :

```java
value = value + 5;
value = value - 2;
```

---

# Opérateurs de comparaison

Les opérateurs de comparaison retournent toujours une valeur booléenne (`true` ou `false`).

| Opérateur | Description |
|-----------|-------------|
| `==` | Égal à |
| `!=` | Différent de |
| `>` | Supérieur à |
| `<` | Inférieur à |
| `>=` | Supérieur ou égal |
| `<=` | Inférieur ou égal |

Exemple :

```java
age >= 18
```

---

# Opérateurs logiques

Les opérateurs logiques permettent de combiner plusieurs conditions.

| Opérateur | Description |
|-----------|-------------|
| `&&` | ET logique |
| `||` | OU logique |
| `!` | Négation |

Exemple :

```java
age >= 18 && hasTicket
```

---

# Opérateur ternaire

L'opérateur ternaire est une forme courte d'une condition simple.

Syntaxe :

```java
condition ? valeurSiVrai : valeurSiFaux;
```

Exemple :

```java
String result = age >= 18 ? "Majeur" : "Mineur";
```

---

# Bonnes pratiques

- Utiliser des parenthèses pour rendre les expressions complexes plus lisibles.
- Éviter les expressions trop longues.
- Préférer la lisibilité à la réduction du nombre de lignes.

---

# À retenir

Dans ce chapitre, vous avez appris :

- les opérateurs arithmétiques ;
- les opérateurs d'affectation ;
- les opérateurs de comparaison ;
- les opérateurs logiques ;
- l'opérateur ternaire.

---

## Navigation

- [Accueil](../../../../../../../README.md)
- Chapitre précédent : [Types](../types/README.md)
- Chapitre suivant : [Conditions](../conditions/README.md)