# Enonce TP 6

## Objectif

Déplacer le contrôle de surface (verifier la saisie des champs Email et Mot de passe) dans un ViewModel

## Procedure

- Créer la classe ViewModel (**TwitterLoginViewModel**)
    - Un membre de classe nommé: 
    ```kt 
    var errorMessage = ""
    ``` 
    - Créer une fonction **validateLogin()** dans le **ViewModel**
    - Cette fonction va contenir tout le contrôle de surface (donc déplacer le code précedent à l'interieur de cette fonction)
    - Adapter un peu le code, cela signifie que le message d'erreur sera contenu dans une variable de type **String** et vous devrez rafraichir la vue si nécessaire
        - Example :
        ```kt 
        errorMessage = "Mon erreur"
        // Une méthode développée par nos soins comme la démo
        forceRefreshUI()
        ``` 
    - Puisque qu'on ne peut pas récupèrer les composants dans un **ViewModel** si on adapte le pattern réelement, nous devons stocker la saisie de l'**Email** et du **Mot de passe** dans leur variable respective de type  **MutableLiveData<String>**
    - Exemple :
        ```kt 
        // le liéer dans l'EditText xml en écriture grace au @={....}
        var emailField = MutableLiveData<String>()
        ...
        if (emailField.value!!....)
        ``` 
    - Attention pour le **onClick** on change la méthodologie(dans le xml). On appel une fonction de notre **ViewModel**
        ```xml  
        android:onClick="@{() -> monViewModel.maFonction()}"
        ``` 
- Liéer le **ViewModel** à la vue dans le **Fragment**
- L'observe dans le fragment pour rafraichir la vue quand il recoit l'evenement (comme la démo)

