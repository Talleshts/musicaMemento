# Projeto Música com Memento

Este projeto é uma implementação simples em Java 17 que utiliza o padrão de projeto Memento para gerenciar o estado de uma música. Através desse padrão, é possível salvar e restaurar o estado da música de forma eficiente.

## Estrutura do Projeto

A estrutura do projeto é a seguinte:

- `Principal`: Classe principal que executa o programa.
- `model.Musica`: Classe que representa uma música.
- `memento.Memento`: Classe que armazena o estado da música.
- `memento.Zelador`: Classe que atua como um gerenciador de mementos.

## Funcionalidades

- **Criar Música**: Permite criar uma instância de `Musica` com nome, artista e ano.
- **Salvar Estado**: O estado atual da música pode ser salvo através do `Zelador`.
- **Alterar Estado**: O ano da música pode ser alterado.
- **Restaurar Estado**: O estado anterior da música pode ser restaurado usando o último memento salvo.

## Como Usar

1. Clone ou baixe o repositório.
2. Abra o projeto em sua IDE preferida.
3. Execute a classe `Principal` para ver o funcionamento.

### Exemplo de Execução

Ao executar o programa, você verá a seguinte saída:

```
Estado inicial: Nome: Smells Like Teen Spirit, Artista: Nirvana, Ano: 1991
Estado alterado: Nome: Smells Like Teen Spirit, Artista: Nirvana, Ano: 1993
Música restaurada: Nome: Smells Like Teen Spirit, Artista: Nirvana, Ano: 1991
```

## Detalhes de Implementação

### Classe `Musica`

- Armazena informações sobre a música.
- Métodos para criar um memento e restaurar seu estado.

### Classe `Memento`

- Armazena o estado da música (nome, artista, ano).
- Fornece métodos de acesso para esses atributos.

### Classe `Zelador`

- Implementa o padrão Singleton para garantir que haja apenas uma instância do gerenciador de mementos.
- Permite adicionar e recuperar o último memento salvo.

## Requisitos

- Java 17 ou superior.

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir um pull request ou relatar problemas.

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).
