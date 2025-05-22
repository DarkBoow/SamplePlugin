# SamplePlugin

## Présentation
SamplePlugin est un exemple minimal de plugin Minecraft basé sur l'API **Spigot 1.16**. Ce projet sert de squelette pour démarrer rapidement un nouveau plugin et il est compilé avec **Maven**.

## Fonctionnement
- À l'activation (`onEnable`), le plugin enregistre un gestionnaire d'événements (`SamplePluginEvents`).
- À la désactivation (`onDisable`), un message est affiché dans la console.

Aucune logique de jeu ou commande n'est encore implémentée : le but est simplement de fournir une structure de départ.

## Fichiers de configuration
### plugin.yml
| Clé | Type | Description |
| --- | ---- | ----------- |
| `name` | string | Nom du plugin. |
| `author` | string | Auteur principal. |
| `version` | string | Version du plugin. |
| `main` | string | Classe Java principale chargée par Spigot. |
| `api-version` | string | Version de l'API Spigot ciblée (ici `1.16`). |

## Compilation / Installation
Prérequis : disposer de **Maven** installé localement. Le `pom.xml` référence déjà l'API Spigot nécessaire.

```bash
mvn package
```

Le JAR généré se trouve ensuite dans le dossier `target/`. Copiez-le dans le répertoire `plugins/` de votre serveur Spigot puis redémarrez.

## Fichiers importants
- `src/main/java/fr/darkbow_/sampleplugin/SamplePlugin.java` : classe principale du plugin.
- `src/main/java/fr/darkbow_/sampleplugin/SamplePluginEvents.java` : gestionnaire d'événements (vide par défaut).
- `src/main/resources/plugin.yml` : déclaration du plugin pour Spigot.

## Utilisation rapide
1. Compilez le projet avec Maven.
2. Copiez le JAR obtenu dans le dossier `plugins/` de votre serveur.
3. Lancez ou redémarrez le serveur. Le message "Plugin ON!" apparaîtra dans la console pour confirmer le chargement.

