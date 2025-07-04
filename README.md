# Projeto da disciplina de Compiladores (2025.1) da Universidade de Pernambuco - Sugarc

Este projeto é um compilador para **Sugarc**, uma linguagem de programação simples e orientada a objetos. Ele converte o código-fonte escrito em Sugarc para a linguagem **C**.

O projeto utiliza o ANTLR 4 para a análise léxica e sintática e uma lógica customizada em Python para realizar a compilação.

## Sobre a Linguagem Sugarc

* **Possui Tipagem Estática:** Suporte para tipos como `int`, `float`, `string` e `bool`.
* **É Orientada a Objetos:** Suporte para `classes`, `herança` (`extends`), `métodos` e `campos`.
* **Estruturas de Controle:** Inclui `if-else`, `for`, `while`, `break`, `continue` e `return`.
* **Sintaxe Familiar:** Inspirada em linguagens populares para facilitar o aprendizado.

### Exemplo de Código Sugarc

```java
class Calculadora {
    int somar(int a, int b) {
        return a + b;
    }
}

void main() {
    Calculadora calc = new Calculadora();
    int resultado = calc.somar(5, 3);
    // printf("O resultado é: %d\n", resultado); // Supondo uma função printf
}
```

## Arquitetura do Compilador

### O compilador é dividido em três partes principais:

1. Analisador Léxico/Sintático (runtime/): Arquivos gerados pelo ANTLR (SugarcLexer.py, SugarcParser.py) que criam uma Árvore de Análise (Parse Tree) a partir do código-fonte.

2. Módulo Principal (main.py): Orquestra o processo: lê o arquivo de entrada, aciona o parser do ANTLR e passa a árvore gerada para o gerador de código.

3. Core da Compilação (src/core.py): Contém a lógica central:

    - SugarcMetadata: Uma classe responsável por coletar e armazenar metadados sobre as classes Sugarc (atributos, métodos, herança) durante a análise.

    - SugarcCodeGenerator: A classe que percorre a árvore de análise do ANTLR e, usando os metadados coletados, traduz as estruturas da linguagem Sugarc para o código C equivalente.

## Para Rodar o Projeto:

### Dependências

- ANTLR4 v4.13.2 com Python

#### Execute
```python
pip install antlr4-python3-runtime
```
- Python v3.12
- JDK v1.1.0

### Forma utilizando o uv
```
uv sync; uv run main.py <path_do_arquivo>
```

## Grupo

- André Escorel
- Eduardo Távora
