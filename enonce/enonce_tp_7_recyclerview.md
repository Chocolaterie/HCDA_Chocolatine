# Enonce

## Objectif

Le but est d'appliquer la démo Recycler dans le tp **Twitter**

Pour les données elles sont identiques (donc un for de 0 à 20 avec les mêmes données)

## Procedure

- Créer la classe **Tweet** (id, author, message)
- Créer le fichier xml correspondant à la ligne
    - Deplacer le **LinearLayout** qui correspond à un Tweet dans ce fichier
    - Remplacer les textes en dur par les variables du model **Tweet** : 
    ```kt
    android:text="{@tweet.message}"
    ```

- Le **RecyclerView** sera dans le Fragment qui affichait le bloc du Tweet
- Creer le **ListAdapter** correspondant (**TwitterListAdapter**) avec toutes les classes qui vont avec (**ViewHolder**, **DiffCallback**, etc...)
-  Dans le **Fragment** connecter l'adapteur au **RecyclerView** et envoyer les données bouchonnées dans l'adapteur
- Finalement on remarque que le xml du fragment en question se limitera à un **RecyclerView** encapsulé dans son **FrameLayout** puisqu'on aura déplacé tout le bloque du **Tweet** dans un fichier à part (le fichier pour définir la ligne du Tweet)

### ATTENTION 

#### Activer le data binding dans le Fragment (comme pour le Fragment Login)

### Resumé

C'est un copié collé de la Démo (pas tout les fichiers bien sûr) mais en adaptant le modèle de données et en appliquant le concept dans le Fragment qui affichait le bloc du **Tweet**