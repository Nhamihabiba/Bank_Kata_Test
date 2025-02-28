# Bank Kata - Gestion de compte bancaire
## Description
Ce projet est une implémentation simple d'un système de gestion de compte bancaire en Java. Il permet d'effectuer des dépôts, des retraits et d'afficher l'historique des transactions.

## Fonctionnalités

Dépôt d'argent sur un compte

Retrait d'argent du compte

Affichage des transactions sous forme d'un relevé bancaire

Tests unitaires avec JUnit 5

## Technologies utilisées

Java 11+

Maven

JUnit 5

## Installation et exécution

### Prérequis :

Java 11 ou plus installé

Maven installé

Un IDE : Eclipse 

## Étapes

Cloner le dépôt GitHub :

git clone <URL_DU_REPO>
cd bank-kata

Compiler et exécuter le projet avec Maven :

mvn clean install
mvn exec:java -Dexec.mainClass="com.bankkata.Main"

Lancer les tests unitaires :

mvn test

## Structure du projet
├── src

│   ├── main

│   │   ├── java

│   │   │   ├── com.bankkata.account

│   │   │   │   ├── Account.java

│   │   │   │   ├── Transaction.java

│   │   │   ├── com.bankkata.service

│   │   │   │   ├── AccountService.java

│   │   │   │   ├── AccountServiceImpl.java

│   ├── test

│   │   ├── java

│   │   │   ├── com.bankkata.test

│   │   │   │   ├── AccountTest.java

├── pom.xml

├── README.md

## Exemples d'utilisation

### Voici un exemple d'utilisation de la classe Account :

Account account = new Account();
account.deposit(1000);

account.withdraw(500);

account.printStatement();

## Auteur

Nhami Habiba
