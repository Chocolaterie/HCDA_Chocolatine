# Enonce

En partant du TP actuel, changer la manière de manipuler les composants tels que les **EditText** et **TextView** à l'aide du DataBinding

Il faut :
- Activer le DataBinding dans le gradle (attention au **SyncNow** pour appliquer les changements)
- Activer le DataBinding dans le XML
- Utiliser le **DataBindingUtil** dans l'Activité Kotlin
- Ne plus utiliser le **findViewById** mais plutôt le composant depuis la vue qui utilise le **DataBinding**

Example :
```kt
// Récupérer la vue data bindé
amd = DataBindingUtil.setContentView<...>(...)

...

// Récupérer un EditText de cette manière
amd.edtEmail

// Au lieu de
val edtEmail = findViewById<EditText>(R.id.....)
```