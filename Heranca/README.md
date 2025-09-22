\# 🏦 Sistema Bancário com Herança e Polimorfismo em Java



Projeto desenvolvido durante o curso de Java do Nélio Alves na Udemy, demonstrando conceitos avançados de Orientação a Objetos.



\## 🎯 Funcionalidades



\- \*\*Herança\*\*: `BusinessAccount` e `SavingsAccount` herdam de `Account`

\- \*\*Polimorfismo\*\*: Métodos sobrescritos e upcasting/downcasting

\- \*\*Encapsulamento\*\*: Atributos privados com getters e setters

\- \*\*Classes Abstratas\*\*: Estrutura base para contas bancárias



\## 📁 Estrutura do Projeto

Herança/

├── src/

│ ├── entities/

│ │ ├── Account.java # Classe base

│ │ ├── BusinessAccount.java # Conta empresarial com empréstimo

│ │ └── SavingsAccount.java # Conta poupança com juros

│ └── application/

│ └── Program.java # Classe principal com testes

└── README.md





\## 🚀 Como Executar



```bash

\# Compilar

javac src/application/Program.java src/entities/\*.java



\# Executar

java src.application.Program





\## Exemplo de uso do Upcasting e Downcasting

// Upcasting

Account acc = new BusinessAccount(1001, "Maria", 1000.0, 500.0);



// Downcasting seguro

if (acc instanceof BusinessAccount) {

&nbsp;   BusinessAccount bacc = (BusinessAccount) acc;

&nbsp;   bacc.loan(200.0);

}

