# Enonce

A partir du TP file rouge Twitter, on souhaite maintenant scinder la **Connexion** et la page affichant le **Tweet** en deux fragments distincts.

- Créer le **NavGraph** (nav_graph_twitter) associé au TP
- Placer un **NavHostFragment** dans le milieu de la page (donc dans l'Activité Twitter)
- Créer deux fragments vides (enlever les args créer par défauts)
    - **LoginTwitterFragment** *(destination par défaut)*:  Va contenir la connexion (ou Login pour les puristes)
        - Le *onClick* n'est plus dans le XML mais on appel le ```setOnClickListener```
        - Exemple:
        ```kt
        binding.monBoutonLogin.setOnClickListener {
            // mon code pour verifier les champs vide et naviguer quand c'est bon
        }
        ``` 
    - **ListTwitterFragment** : Le deuxième va afficher la zone du Tweet
- Dans le **NavGraph**(nav_graph_twitter) compléter pour définir les règles de navigation entre les deux fragments
- Au clique du bouton Login : Naviguer sur le deuxieme fragment tout en gardant la logique sur le contrôle de surface (verifier les champs)