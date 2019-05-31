Nom Etudiant 1: Axel BERTRAND

Nom Etudiant 2: Omran HAIDARI

## Le pattern Singleton

> Quel est l'intérêt du Pattern Singleton ?

L'intérêt du pattern Singleton est de limité les instances d'un objet à une unité en rendant le constructeur privé.

> Quel est le cas d'utilisation de ce Pattern ?

Un cas d'utilisation est la création d'une connexion  une base de données.

## Le static c'est quoi en fait

> Peut-on lire une variable d'instance depuis une fonction static ?

Il est impossible de lire une variable d'instance depuis une fonction static car une fonction static ne connaît pas les instances de la classe.

> Peut-on écrire une variable d'instance depuis une fonction static ?

Idem pour l'écriture.

> Peut-on appeler une fonction d'instance depuis une fonction static ?

Idem pour l'appel aux fonctions d'instance.

> Peut-on modifier une variable static depuis une méthode d'instance ?

On peut modifier une variable static depuis une méthode d'instance car toutes les instances connaissent le contexte static.

> Peut-on surcharger une méthode static ?

Oui, il est possible de surcharger une méthode static.
En revanche, on ne peut pas redéfinir une méthode static car le contexte static n'est pas partagé entre la classe de base et la classe dérivée.


## Spring Core, au secours !!

> Qu'est ce qu'un Bean Spring ?

Un bean est un objet Java géré par le Framework Spring que l'on peut injecter à un autre objet (bean ou pas).

> Comment pourrait-on décrire simplement le contexte Spring ?

Le contexte Spring est une configuration qui définie l'ensemble des beans de l'application et permet de les récupérer.

> Quel est le scope par défaut d'un Bean ?

Le scope par défaut d'un bean est le scope singleton.

> A quoi sert le paramètre `abstract`

Le paramètre `abstract` sert à préciser que le bean est abstrait et qu'il n'a donc pas d'instance.
Dans notre cas, on l'utilise pour permettre l'injection d'un objet dérivé de `Loggable` en utilisant le polymorphisme.

> A quoi fait référence `name="logger"` dans la property ?

`name="logger"` fait référence au nom de l'attribut de la classe du bean, c'est-à-dire l'attribut `logger` de la classe `Loggable`.

> A quoi fait référence `ref="logger"` dans la property ?

`ref="logger"` est une référence vers un autre bean. Dans ce cas ci, `ref="logger"` fait référence au bean du logger avec l'id `logger`.
```
<bean name="logger" class="logger.ConsoleLogger" />
```

## Rappel - les annotation en Java

> Expliquez ce qu'est une annotation en Java.

Les annotations sont des @interface définissant des méta-données qui permettent de modifier le comportement d'une classe.

> Sur quoi peut-on ajouter une annotation en Java ?

Elles sont applicables sur n'importe quel élément du Java (classe, attribut, méthode, paramètres...).

> Les annotation sont elles utilisées uniquement à la compilation ? au runtime ?

Les annotations peuvent être utilisées à la compilation et au runtime selon la rétention choisie (avec l'annotation `@Retention`).

## La même chose avec Spring par annotation

> Maintenant qu'on a rapidement vu les annotations en Java. A quoi pourrait servir les annotations pour Spring.

On peut se servir des annotations pour définir nos beans automatiquement.

> A quoi correspond l'`autowiring` par rapport à notre configuration spring précédente.

l'autowiring correspond au cablage automatique de beans avec les annotations.
Il permet d'instancier le bean et de l'affecter automatiquement à l'attribut désiré sans configuration supplémentaire.