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
