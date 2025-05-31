# 🧪 Katalon Test Project – Khan Academy App

## 📋 Description

Ce projet contient une suite de tests automatisés réalisés avec **Katalon Studio** pour l’application Android **Khan Academy**, dans le cadre du projet "Test Logiciel" (ISTQB) à l’Université de Sfax.

Les tests portent principalement sur les **fonctionnalités d’authentification** et la **gestion des paramètres** dans l’application mobile.

---

## 👨‍💻 Réalisé par

- **Oussema Zghal**  
- Ahmed Ben Salah  
- Encadré par : **M. Taher Labidi**

---

## 🧰 Technologies

- **Katalon Studio** v10.0.0.223  
- Android Emulator (Android 12 - sdk_gphone64_x86_64)  
- Windows 11 64-bit

---

## ✅ Cas de test couverts

### 🔐 Authentification
- ✅ Sign up avec un email déjà utilisé
- ❌ Sign up avec un email invalide (⚠️ bug détecté)
- ✅ Sign out
- ✅ Sign up avec des informations valides
- ✅ Sign in avec mot de passe incorrect
- ✅ Sign in avec des informations valides

### ⚙️ Paramètres (Settings)
- ✅ Ajout d’un enseignant valide
- ✅ Ajout d’un enseignant invalide
- ✅ Changement de langue de l'application
- ✅ Visualisation d’un rapport de progression

---

## 📊 Résultats des tests

### 🔐 Authentification
| Total | Passés | Échoués | Skipped |
|-------|--------|---------|---------|
|   6   |   5    |    1    |    0    |

### ⚙️ Paramètres
| Total | Passés | Échoués | Skipped |
|-------|--------|---------|---------|
|   4   |   4    |    0    |    0    |

---

## 📁 Structure du projet

```text
.
├── settings/
│   ├── internal/
│   └── external/
├── Object Repository/
├── Test Cases/
├── Test Suites/
├── ttt.prj
└── README.md
