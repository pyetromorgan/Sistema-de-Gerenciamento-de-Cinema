# 🎬 CineTech - Sistema de Gestão de Bilheteria

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Git](https://img.shields.io/badge/git-%23F05032.svg?style=for-the-badge&logo=git&logoColor=white)

Este projeto é uma solução robusta para o gerenciamento de operações de cinema, desenvolvida em **Java**. O foco principal foi a aplicação prática dos pilares da **Programação Orientada a Objetos (POO)** para criar um código escalável, organizado e de fácil manutenção.

---

## 🎯 Objetivo do Projeto
Desenvolver um motor de regras de negócio para um cinema, capaz de validar requisitos de segurança (classificação indicativa), gerenciar inventário (assentos) e aplicar lógica de preços diferenciada (polimorfismo).

---

## 🛠️ Tecnologias e Conceitos Aplicados

### Tecnologias:
* **Linguagem:** Java (JDK 17+)
* **Versionamento:** Git & GitHub

### Engenharia de Software (POO):
* **Herança e Polimorfismo:** Implementados na gestão de ingressos (`Inteira` vs `Meia`), permitindo que o sistema calcule preços e exiba comprovantes de forma dinâmica.
* **Encapsulamento:** Proteção da integridade dos dados através de modificadores de acesso e métodos acessores.
* **Composição:** Relação entre `Sessao`, `Filme` e `Ingresso` para representar o domínio de forma fiel à realidade.
* **Lógica de Negócio:** Algoritmos para validação de idade e controle de disponibilidade de assentos em matrizes/arrays.

---

## 🚀 Funcionalidades Principais

* ✅ **Filtro de Segurança:** Validação automática da idade do cliente contra a classificação indicativa do filme.
* ✅ **Gestão de Assentos:** Sistema de reserva que impede a compra de assentos já ocupados.
* ✅ **Catálogo Dinâmico:** Organização de sessões por data e horário (utilizando tipos primitivos e Strings para maior performance e simplicidade).
* ✅ **Cálculo de Preços:** Implementação de regra de negócio para meia-entrada.

---

## 🔧 Como Executar o Projeto

1. Clone o repositório:
   ```bash
   git clone [https://github.com/pyetromorgan/Sistema-de-Gerenciamento-de-Cinema.git](https://github.com/pyetromorgan/Sistema-de-Gerenciamento-de-Cinema.git)
