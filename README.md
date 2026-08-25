# ☕ Coffee Machine - Clean Code & POO em Java

Projeto prático desenvolvido para exercitar conceitos fundamentais e avançados de **Programação Orientada a Objetos (POO)** e boas práticas descritas no livro **Código Limpo (*Clean Code*)**, de Robert C. Martin (Uncle Bob).

---

## 🎯 Objetivos de Design e Arquitetura

- **Tell, Don't Ask (Diga, Não Pergunte):** O estoque (`Inventory`) encapsula suas regras e valida seu próprio estado, eliminando modelos de domínio anêmicos.
- **Princípio Aberto/Fechado (OCP - SOLID):** Novas bebidas podem ser adicionadas apenas implementando a interface `Beverage`, sem necessidade de alterar classes existentes.
- **Injeção de Dependência:** Desacoplamento da máquina de café de suas dependências via construtor, facilitando testes e modularidade.
- **Eliminação de Código Condicional Complexo:** Uso de polimorfismo no lugar de cadeias de `if/else` ou `switch/case`.
- **Tratamento Semântico de Exceções:** Criação de exceções de domínio expressivas (`InsufficientIngredientsException`) em vez de retorno de `null` ou flags/códigos de erro.
- **Imutabilidade e Records:** Representação de receitas com Java Records e validação *fail-fast* no construtor compacto.

---

## 🏗️ Estrutura do Projeto

```text
src/
└── com/
    └── coffeemachine/
        ├── Main.java                                  # Ponto de composição da aplicação
        ├── exception/
        │   └── InsufficientIngredientsException.java  # Exceção de domínio
        ├── model/
        │   ├── Beverage.java                          # Interface de bebidas
        │   ├── Recipe.java                            # Value Object (Record)
        │   ├── Espresso.java                          # Implementação de bebida
        │   ├── Cappuccino.java                        # Implementação de bebida
        │   ├── Latte.java                             # Implementação de bebida
        │   └── Inventory.java                         # Encapsulamento de insumos
        └── service/
            └── CoffeeMachine.java                     # Orquestrador do preparo
```

---

## 🚀 Como Executar

### Pré-requisitos
- **Java JDK 17** ou superior
- **Git** instalado (opcional)

### Passo a passo

1. **Clone o repositório:**
   ```bash
   git clone [https://github.com/SEU_USUARIO/coffee-machine-clean-code.git](https://github.com/PedroSIDev/coffee-machine-clean-code.git)
   cd coffee-machine-clean-code
   ```

2. **Compile as classes:**
   ```bash
   javac -d bin src/com/coffeemachine/**/*.java src/com/coffeemachine/*.java
   ```

3. **Execute o projeto:**
   ```bash
   java -cp bin com.coffeemachine.Main
   ```

---

## 🧪 Exemplo de Saída

```text
 Sucesso: Espresso preparado com sucesso!
 Sucesso: Cappuccino preparado com sucesso!
 Falha ao preparar Latte: Café insuficiente. Necessário: 14g, Disponível: 4g
```

---

## 🛠️ Tecnologias e Conceitos Utilizados

- **Linguagem:** Java 17+
- **Conceitos:** SOLID, Clean Code, POO, Java Records, Domain Exceptions, Injeção de Dependência
