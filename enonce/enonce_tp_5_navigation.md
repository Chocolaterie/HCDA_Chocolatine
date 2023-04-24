# Enonce

A partir du TP file rouge Twitter, on souhaite maintenant scinder la **Connexion** et la page affichant le **Tweet** en deux fragments distincts.

- Créer le NavGraph (nav_graph_twitter) associé au TP
- Placer un NavHostContainer dans le milieu de la page (fonc dans l'Activité Twitter)
- Créer deux fragments vides
    - **LoginTwitterFragment** *(destination par défaut)*:  Un va contenir la connexion (ou Login pour les puristes)
    - **ListTwitterFragment** : Le deuxième va afficher la zone du Tweet
- Dans le **NavGraph**(nav_graph_twitter) compléter pour définir les règles de navigation entre les deux fragments
- Au clique du bouton Login : Naviguer sur le deuxieme fragment tout en gardant la logique sur le contrôle de surface (verifier les champs)