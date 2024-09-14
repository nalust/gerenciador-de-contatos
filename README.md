# Gerenciador de Contatos

Este projeto é um gerenciador de contatos implementado em Java. Ele permite adicionar, buscar, remover e listar contatos usando uma lista encadeada. A interface é baseada em linha de comando e fornece um menu para interagir com as funcionalidades.

## Estrutura do Projeto

O projeto é composto pelos seguintes arquivos:

- `Contact.java`: Representa um contato com nome, telefone e e-mail.
- `Node.java`: Representa um nó da lista encadeada que armazena um `Contact`.
- `ContactList.java`: Implementa uma lista encadeada para armazenar e gerenciar contatos.
- `MenuOption.java`: Enumeração que define as opções do menu.
- `MenuHandler.java`: Manipulador do menu que lida com a lógica de adição, busca, remoção e listagem de contatos.
- `ContactManager.java`: Classe principal que executa o aplicativo e apresenta o menu para o usuário.

## Funcionalidades

1. **Adicionar Contato**: Permite ao usuário adicionar um novo contato à lista.
2. **Buscar Contato**: Permite ao usuário buscar um contato pelo nome ou telefone.
3. **Remover Contato**: Permite ao usuário remover um contato da lista pelo nome ou telefone.
4. **Listar Contatos**: Exibe todos os contatos armazenados na lista.
5. **Sair**: Encerra o aplicativo.

## Instruções para Execução

Para executar o projeto, siga estas etapas:

1. **Compile o código**: Certifique-se de que o JDK está instalado e compile o código usando o comando `javac`:

    ```bash
    javac Contact.java Node.java ContactList.java MenuOption.java MenuHandler.java ContactManager.java
    ```

2. **Execute o programa**: Execute o programa principal usando o comando `java`:

    ```bash
    java ContactManager
    ```
