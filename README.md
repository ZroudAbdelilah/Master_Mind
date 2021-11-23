# Master_Mind
## Project context
Le programme tirera une combinaison, demandera à l'utilisateur de la retrouver sur la base de ses réponses successives. Une combinaison sera représentée par une séquence de n chiffres tirés parmi m (typiquement n=4 et m=6). Par exemple, une combinaison pourrait être 3251.

Création de la combinaison à trouver

​

Dans un fichier .java, deux entiers n et m valent respectivement 4 et 6. Déclarez deux tableaux de n entiers appelés laCombinaison, destiné à stocker la combinaison à deviner, et combinaison, destiné à stocker la combinaison proposée par l'utilisateur.

On veut écrire la méthode tirerCombinaison qui tire une combinaison de n chiffres. Pour cela, utilisez la méthode
```sh
static int hasard(int max){
    return (1 + (int)(Math.random() * max));
}
```
qui tire un nombre au hasard entre 1 et max (qui par défaut vaut m). En utilisant cette méthode hasard, écrivez la méthode tirerCombinaison décrite ci-dessus, ayant comme entête quelque chose comme :

```sh
static void tirerCombinaison(int[] uneCombinaison ..);
}
```
et qui affecte une combinaison au hasard à la variable uneCombinaison.

### Remarque

Pour tester votre programme, il sera peut être utile de modifier la méthode tirerCombinaison de sorte à ce qu'elle retourne une combinaison connue choisie par vous pour vos tests. Faites le simplement en écrivant la combinaison que vous voulez utiliser pour vos tests.

## Saisie de la réponse du joueur

​

On s'intéresse maintenant à pouvoir entrer une réponse du joueur. Définissez la méthode demanderCoup, analogue à tirerCombinaison, et qui remplit combinaison, par des valeurs demandées à l'utilisateur.

On attaque maintenant la partie la plus difficile du programme : la génération de la réponse. Une réponse est constituée d'indicateurs (au plus n) de 2 types :

​

- Des indicateurs correspondant aux chiffres corrects bien placés, c'est-à-dire les valeurs et positions exactement les mêmes entre les deux séquences. Par exemple, si la séquence à deviner est 1213 et que l'on a proposé 4516, la réponse sera "1 correct", ce qui correspond au deuxième 1. Ce type de réponse sera noté par un '#'.
- Des indicateurs correspondant aux chiffres corrects mais mal placés, c'est-à-dire une valeur présente mais pas à la bonne position. Par exemple, si la séquence à deviner est 1213 et que l'on a proposé 4562, la réponse sera "1 mal placé", ce qui correspond au 2. Ce type de réponse sera noté par un 'O'.
​

Ces indicateurs sont cumulés pour tous les chiffres de la réponse. Par exemple, si la séquence à deviner est 1213 et que l'on a proposé 4512, la réponse sera "#O", ce qui correspond respectivement au 1 et au 2.

Attention :

Un principe de base dans la génération des réponse est qu'un chiffre ne peut servir qu'une seule fois dans la réponse.

Exemple : Si la séquence à deviner est 1213 et que l'on a proposé 4156, la réponse est "O" (c'est-à-dire un bon chiffre mais mal placé : le 1) et non pas "OO" (pour le 1 deux fois mal placé) car il n'y a qu'un seul 1 dans la séquence proposée. Par contre, si la solution proposée est 4151, la réponse sera bien "OO".

Un principe est que l'on n'indique pas quels chiffres sont bons ou bien placés. On indique uniquement leur nombre.

Ainsi si la séquence à deviner est 4213 et que l'on a proposé 5243, la réponse sera ##O et non pas .#O#.