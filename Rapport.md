Nom Etudiant 1: Axel BERTRAND

Nom Etudiant 2: Omran HAIDARI

## Le pattern Singleton

- L'intérêt du pattern Singleton est de limité les instances d'un objet à une unité.
- Un cas d'utilisation est la création d'une connexion  une base de données.

## Le static c'est quoi en fait

- Il est impossible de lire une variable d'instance depuis une fonction static.
- Idem pour l'écriture.
- Idem pour l'appel aux fonctions d'instance.
- On peut modifier une variable static depuis une méthode d'instance car toutes les instances connaissent le contexte static.
- On ne peut pas surcharger une méthode static car le contexte static n'est pas partagé entre la classe de base et la classe dérivée.

## Spring Core, au secours !!

- Un bean est un conteneur de configuration.
- Spring est un framework qui permet de faire de l'injection de dépendance par inversion de contrôle.
- Le scope par défaut d'un bean est le scope singleton.

- Le paramètre `abstract` sert à préciser que la classe à instancier est abstraite.
- `name="logger"` fait référence au nom du bean.

## Rappel - les annotation en Java

- Les annotations sont des méta-données.
- Elles sont applicables sur n'importe quel élément du Java (classe, attribut, méthode, paramètres...).
- Les annotations peuvent être utilisées à la compilation et au runtime.

## La même chose avec Spring par annotation

- On peut se servir des annotations pour définir nos bean automatiquement.
- l'autowiring correspond au cablage automatique de beans avec les annotations.