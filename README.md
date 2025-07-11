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

class MathUtil extends Calculadora  // Herança de Calculadora
{
  int square(int n)
  {
    return n * n;
  }

  int factorial(int n)
  {
    if (n <= 1)
      return 1;
    return n * this.factorial(n - 1);
  }
}

class DataHolder
{
  int values[];

  constructor(int size)
  {
    this.values = malloc(size);
  }

  void set(int index, int value)
  {
    this.values[index] = value;
  }

  int get(int index)
  {
    return this.values[index];
  }
}

void main() {
    Calculadora calc = new Calculadora();
    int resultado = calc.somar(5, 3);
    printf("O resultado é: %d\n", resultado); // Supondo uma função printf
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
Execute o script `dry_run.sh` para criar um ambiente virtual, instalar as dependências e compilar o código `teste.sugarc` na raiz do projeto.

Apos isso, você pode executar o seguinte comando para compilar um arquivo Sugarc específico:

```bash
.venv/bin/python3 main.py <caminho_do_arquivo_sugarc>
```

### Dependências

- Python 3.12
- antlr4-python3-runtime 4.13.2
- antlr4-tools 0.2.2
- install-jdk 1.1.0
- pydantic 2.11.7
- pyyaml 6.0.2

#### Execute para instalar as dependências fora do ambiente virtual:

```python
pip install -r requirements.txt
```

### Forma utilizando o uv
voce pode utilizar o [uv](https://docs.astral.sh/uv/guides/install-python/) comom gerenciador de pacotes e ambiente virtual para rodar o projeto.

```bash
uv sync; # para instalar as dependências 
uv run main.py <path_do_arquivo> # para rodar o compilador
```

## Grupo

- André Escorel
- Eduardo Távora
