Projet JAVA B3 2024

## Lancez le projet

Pour lancer le projet, il faudra au prealable avoir mis dans les fichier application.properties les informations de connexion à la base de données et le port sur lequel vous voulez lancer le projet. Par default les ports de lanceent sont 8080 et 9090.

## Liste des endpoints

#### API :

##### - GET

- /api/quotes/get : Récupéré une citation aléatoire

##### - POST

- /api/quotes/add : Ajouter une citation, attend un json

#### Application :

##### - GET

- / : Retourne la page d'acceuil avec le chat

- /api/conversations/new : Reçoit le message de l'utilisateur et le stocke en base de données avant de rencoyer la réponse

- /api/conversations/user/{userName} : Récupère les messages de l'utilisateur et les affiche a l'admininistaeur

- /api/conversations/users : Récupère la liste des utilisateurs et les affiche a l'administrateur
