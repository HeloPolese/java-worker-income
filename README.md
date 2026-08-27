# Java Worker Income

Sistema desenvolvido em **Java** para gerenciamento de trabalhadores, departamentos e contratos por hora. O projeto permite cadastrar um trabalhador, adicionar contratos e calcular sua renda com base nos contratos realizados em um determinado mês e ano.

## 📌 Sobre o projeto

O sistema foi desenvolvido com foco na prática de **Programação Orientada a Objetos (POO)** em Java, trabalhando com classes, enumerações, associações entre objetos, listas e manipulação de datas.

A aplicação possui três principais entidades:

* **Worker** — representa o trabalhador.
* **Department** — representa o departamento ao qual o trabalhador pertence.
* **HourContract** — representa um contrato de trabalho por hora.

Além disso, o projeto utiliza o enum **WorkerLevel** para representar o nível do trabalhador:

* `JUNIOR`
* `MID_LEVEL`
* `SENIOR`

## 🏗️ Estrutura do projeto

```text
Worker
├── name : String
├── level : WorkerLevel
├── baseSalary : Double
├── department : Department
└── contracts : List<HourContract>

Department
└── name : String

HourContract
├── date : Date
├── valuePerHour : Double
└── hours : Integer
```

### Relacionamentos

* Um `Worker` pertence a **um Department**.
* Um `Worker` pode possuir **vários HourContract**.
* Cada `HourContract` possui uma data, valor por hora e quantidade de horas trabalhadas.

## ⚙️ Funcionalidades

* Cadastro do departamento do trabalhador;
* Cadastro dos dados do trabalhador;
* Definição do nível do trabalhador;
* Cadastro de múltiplos contratos por hora;
* Adição e remoção de contratos;
* Cálculo do valor total de cada contrato;
* Cálculo da renda do trabalhador em um determinado mês e ano;
* Exibição dos dados do trabalhador e seu departamento.

## 💻 Exemplo de execução

```text
Enter a departament's name:
Desing

Enter worker data:
Name:
Alex
Level:
JUNIOR
Base salary:
1200.00

How many contracts to this worker:
3

Enter contract #01 data:
Date DD/MM/YYYY:
20/08/2018
Value per hour:
50.00
Duration (Hours):
20

Enter contract #02 data:
Date DD/MM/YYYY:
13/06/2018
Value per hour:
30.00
Duration (Hours):
18

Enter contract #03 data:
25/08/2018
Value per hour:
80.00
Duration (Hours):
10

Enter month and year to calculate Income (MM/YYYY):
08/2018

Name: Alex
Departament: Desing
Income for 08/2018: 3000.0
```

O cálculo considera o salário-base e os contratos realizados no mês informado.

**Exemplo:**

```text
Salário base: R$ 1.200,00

Contrato 1:
20 horas × R$ 50,00 = R$ 1.000,00

Contrato 3:
10 horas × R$ 80,00 = R$ 800,00

Renda total:
R$ 1.200,00 + R$ 1.000,00 + R$ 800,00
= R$ 3.000,00
```

## 🛠️ Tecnologias utilizadas

* **Java**
* **Programação Orientada a Objetos (POO)**
* `List`
* `enum`
* `Date`
* `SimpleDateFormat`
* Manipulação de datas
* Associações entre classes

## 📚 Conceitos praticados

Este projeto foi desenvolvido para praticar conceitos importantes de Java, como:

* Classes e objetos;
* Encapsulamento;
* Construtores;
* Métodos;
* Enumerações;
* Associação entre objetos;
* Composição;
* Listas;
* Tratamento e comparação de datas;
* Entrada de dados pelo console;
* Organização de código em pacotes.

## 🚀 Como executar

### 1. Clone o repositório

```bash
git clone https://github.com/SEU-USUARIO/java-worker-income.git
```

### 2. Entre na pasta do projeto

```bash
cd java-worker-income
```

### 3. Compile e execute o projeto

Execute a classe principal (`Program.java`) pela sua IDE ou pelo terminal.

## 📂 Organização sugerida

```text
src/
└── application/
    └── Program.java

└── entities/
    ├── Worker.java
    ├── Department.java
    └── HourContract.java

└── enums/
    └── WorkerLevel.java
```

## 🎯 Objetivo

O objetivo deste projeto é consolidar conhecimentos de **Java e Programação Orientada a Objetos**, especialmente o relacionamento entre diferentes classes e o processamento de informações relacionadas a trabalhadores e seus contratos.

---

**Desenvolvido por Heloisa Polese**
