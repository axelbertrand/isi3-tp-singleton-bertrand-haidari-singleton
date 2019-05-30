Nom Etudiant 1: Axel BERTRAND

Nom Etudiant 2: Omran HAIDARI

## Le pattern Singleton

> Quel est l'intérêt du Pattern Singleton ?

L'intérêt du pattern Singleton est de limité les instances d'un objet à une unité.

> Quel est le cas d'utilisation de ce Pattern ?

Un cas d'utilisation est la création d'une connexion  une base de données.

## Le static c'est quoi en fait

> Peut-on lire une variable d'instance depuis une fonction static ?

Il est impossible de lire une variable d'instance depuis une fonction static.

> Peut-on écrire une variable d'instance depuis une fonction static ?

Idem pour l'écriture.

> Peut-on appeler une fonction d'instance depuis une fonction static ?

Idem pour l'appel aux fonctions d'instance.

> Peut-on modifier une variable static depuis une méthode d'instance ?

On peut modifier une variable static depuis une méthode d'instance car toutes les instances connaissent le contexte static.

> Peut-on surcharger une méthode static ?

On ne peut pas surcharger une méthode static car le contexte static n'est pas partagé entre la classe de base et la classe dérivée.


## Spring Core, au secours !!

> Qu'est ce qu'un Bean Spring ?

Un bean est un conteneur de configuration.

> Comment pourrait-on décrire simplement le contexte Spring ?

Spring est un framework qui permet de faire de l'injection de dépendance par inversion de contrôle.

> Quel est le scope par défaut d'un Bean ?

Le scope par défaut d'un bean est le scope singleton.

> A quoi sert le paramètre `abstract`

Le paramètre `abstract` sert à préciser que la classe à instancier est abstraite.

> A quoi fait référence `name="logger"` dans la property ?

`name="logger"` fait référence au nom du bean.

> A quoi fait référence `ref="logger"` dans la property ?

`ref="logger"` est une référence vers un autre bean. Dans ce cas ci, `ref="logger"` fait référence à un bean avec l'id `logger`.

## Rappel - les annotation en Java

> Expliquez ce qu'est une annotation en Java.

Les annotations sont des méta-données.

> Sur quoi peut-on ajouter une annotation en Java ?

Elles sont applicables sur n'importe quel élément du Java (classe, attribut, méthode, paramètres...).

> Les annotation sont elles utilisées uniquement à la compilation ? au runtime ?

Les annotations peuvent être utilisées à la compilation et au runtime.

## La même chose avec Spring par annotation

> Maintenant qu'on a rapidement vu les annotations en Java. A quoi pourrait servir les annotations pour Spring.

On peut se servir des annotations pour définir nos beans automatiquement.

> A quoi correspond l'`autowiring` par rapport à notre configuration spring précédente.

l'autowiring correspond au cablage automatique de beans avec les annotations.