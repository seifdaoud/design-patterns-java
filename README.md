# 🎯 Java Design Patterns (Regroupés par type)

Ce projet contient des implémentations simples et pédagogiques des principaux Design Patterns en Java, regroupés par type.

## 📦 Organisation

- `creational/` : Patterns de création (Singleton, Factory, Builder…)
- `structural/` : Patterns de structure (Adapter, Decorator…)
- `behavioral/` : Patterns de comportement (Strategy, Observer…)

---

## ✅ Pattern #1 – Singleton

📁 Chemin : `com.github.seif.creational.singleton`

Le pattern Singleton garantit qu'une classe n'a qu'une seule instance accessible globalement.

Exemple : `AppConfig` simule un gestionnaire de configuration d'application.

Commande pour exécuter :

```bash
mvn compile
mvn exec:java -Dexec.mainClass="com.github.seif.creational.singleton.SingletonDemo"
```

---

## ✅ Pattern #2 – Factory Method (Version simple)

📁 Chemin : `com.github.seif.creational.factorysimple`

Ce pattern permet de créer des objets sans que le code client ne connaisse leur classe concrète.

Exemple : `ShapeFactory` retourne un objet `Shape` (`Circle`, `Square`) selon une chaîne de caractères.

Commande pour exécuter :

```bash
mvn compile
mvn exec:java -Dexec.mainClass="com.github.seif.creational.factorysimple.FactorySimpleDemo"
```

---

## ✅ Pattern #3 – Builder

📁 Chemin : `com.github.seif.creational.builder`

Le Builder permet de construire un objet complexe étape par étape (ex : avec des champs optionnels) sans exposer les détails de création.

Exemple : `UserBuilder` permet de créer un `User` avec ou sans âge, téléphone, adresse…

Commande pour exécuter :

```bash
mvn compile
mvn exec:java -Dexec.mainClass="com.github.seif.creational.builder.BuilderDemo"
```

---

## ✅ Pattern #4 – Strategy

📁 Chemin : `com.github.seif.behavioral.strategy`

Le pattern Strategy permet de changer dynamiquement le comportement d’un objet en encapsulant des algorithmes (stratégies) interchangeables.

Exemple : `PriceCalculator` applique différentes stratégies de remise (`NoDiscount`, `SeasonalDiscount`, `ClearanceDiscount`).

Commande pour exécuter :

```bash
mvn compile
mvn exec:java -Dexec.mainClass="com.github.seif.behavioral.strategy.StrategyDemo"
```

---

## ✅ Pattern #5 – Decorator

📁 Chemin : `com.github.seif.structural.decorator`

Le pattern Decorator permet d’ajouter dynamiquement des fonctionnalités à un objet sans modifier sa classe.

Exemple : `SimpleCoffee` peut être enrichi avec `MilkDecorator`, `SugarDecorator`, etc.

Commande pour exécuter :

```bash
mvn compile
mvn exec:java -Dexec.mainClass="com.github.seif.structural.decorator.DecoratorDemo"
```
