# Diagrama de classes UML

```mermaid
classDiagram
    direction LR
    class Carro {
        - String modelo
        + acelerar(int v) int
    }
    
    class Motor{
        - int hp
        + acelerar(int v) int 
    }
    
    Carro *-- Motor
```

- *-- -> Significa a Composition, ou seja, caso o carro seja vendido, o motor vai junto
- o-- -> Significa a Agregação, ou seja, caso o carro seja vendido, o motor fica na garagem para ser reutilizado


- Exercicio dos slides da aula 26/04/2024, fazer apenas o UML das classes, tentando usar o máximo de classes para representar uma lista de contatos e respeitando os requisitos
```mermaid
classDiagram
    class App{
        - Agenda agenda
    }
        
    class Agenda{
        - ArrayList<Contato> contato
    }
    class Contato{
        - String nome
        - String lastName
        - ArrayList<Telefone> numeroTelefone
        - ArrayList<Email> email
        
    }
    
    class Telefone{
        - String rotulo
        - String numero
    }
    class Email{
        - String rotulo
        - String email
    }
    App *-- Agenda
    Agenda *-- Contato
    Contato *-- Telefone
    Contato *-- Email

```