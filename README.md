# Projeto Calculadora Java

## Descrição do Projeto

Este projeto consiste no desenvolvimento de uma calculadora simples utilizando a linguagem Java. O sistema foi criado com o objetivo de aplicar conceitos fundamentais da programação orientada a objetos, organização de código em pacotes (`package`), tratamento de exceções e documentação automática com JavaDoc.

A aplicação é capaz de realizar operações matemáticas básicas, como soma, subtração, multiplicação e divisão, além de realizar validações para evitar erros, como divisão por zero e operadores inválidos.

O projeto foi desenvolvido no Visual Studio Code (VSCode), utilizando Java JDK 21, Git para versionamento de código e GitHub para hospedagem do repositório.

---

# Objetivo da Atividade

O objetivo desta atividade é desenvolver uma aplicação em Java que demonstre a aplicação prática dos seguintes conceitos:

* Criação de classes e objetos;
* Métodos com parâmetros e retorno;
* Estruturas condicionais (`if/else`);
* Tratamento de exceções (`try/catch`);
* Organização do projeto utilizando `package`;
* Documentação técnica utilizando JavaDoc;
* Controle de versão com Git e GitHub.

Além disso, a atividade tem como finalidade reforçar boas práticas de programação, documentação e organização do código-fonte.

---

# Estrutura do Projeto

A estrutura do projeto foi organizada da seguinte forma:

```txt
Java
├── calculadora
│   ├── calculadora.java
│   └── testeCalculadora.java
├── docs
│   └── (arquivos gerados pelo JavaDoc)
```

### Explicação dos Arquivos

### `calculadora.java`

Classe responsável por realizar as operações matemáticas da aplicação.

### `testeCalculadora.java`

Classe responsável pela execução dos testes do sistema, verificando se as operações estão funcionando corretamente.

### `docs/`

Pasta gerada automaticamente pelo JavaDoc, contendo toda a documentação do projeto em HTML.


---

# Explicação das Operações

A calculadora realiza quatro operações matemáticas básicas:

## Soma (`+`)

A operação de soma é utilizada para adicionar dois números.

### Exemplo

```java
calc.calc(2, 3, "+");
```

### Resultado esperado

```txt
Resultado = 5
```

---

## Subtração (`-`)

A operação de subtração é utilizada para diminuir um valor do outro.

### Exemplo

```java
calc.calc(10, 4, "-");
```

### Resultado esperado

```txt
Resultado = 6
```

---

## Multiplicação (`*`)

A multiplicação realiza o produto entre dois números.

### Exemplo

```java
calc.calc(3, 5, "*");
```

### Resultado esperado

```txt
Resultado = 15
```

---

## Divisão (`/`)

A operação de divisão divide um número pelo outro.

### Exemplo

```java
calc.calc(8, 2, "/");
```

### Resultado esperado

```txt
Resultado = 4
```

---

# Tratamento de Exceções

O sistema possui validações para evitar operações inválidas.

## Divisão por Zero

Ao tentar dividir um número por zero, o sistema lança uma exceção do tipo `IllegalArgumentException`.

### Exemplo

```java
calc.calc(8, 0, "/");
```

### Resultado esperado

```txt
ERRO: Divisão por zero, operação irregular
```

---

## Operador Inválido

Caso um operador inexistente seja informado, o sistema também lança uma exceção.

### Exemplo

```java
calc.calc(5, 5, "x");
```

### Resultado esperado

```txt
Operação inválida
```

---

# Execução do Projeto

## Compilação do Projeto

Para compilar os arquivos Java, execute o seguinte comando no terminal:

```bash
javac -d . calculadora\*.java
```

## Execução do Projeto

Após compilar, execute o programa utilizando o comando:

```bash
java calculadora.testeCalculadora
```

---

# Resultado dos Testes

Ao executar o programa, os seguintes resultados são esperados:

```txt
Resultado = 5
5
Resultado = -1
-1
Resultado = 6
6
Resultado = 0
0
ERRO: Divisão por zero, operação irregular
Operação inválida
```

---

# Prints da Execução dos Testes

### Print do terminal executando os testes

<img width="391" height="169" alt="image" src="https://github.com/user-attachments/assets/0807b763-e257-48b5-8fbf-230ef03ec3a8" />



# Prints da Documentação JavaDoc

A documentação JavaDoc foi gerada automaticamente utilizando o comando:

```bash
javadoc -d ../docs calculadora.java testeCalculadora.java
```

### Print da documentação


<img width="1314" height="505" alt="image" src="https://github.com/user-attachments/assets/ad20d03c-4cd8-4e52-84a3-16e0d874c2f8" />


# Documentação JavaDoc

A documentação do projeto foi gerada utilizando JavaDoc, permitindo visualizar:

* Classes do sistema;
* Métodos implementados;
* Atributos utilizados;
* Parâmetros dos métodos;
* Valores retornados;
* Exceções tratadas;
* Comentários técnicos do projeto.


# Autor

**Vinicius Amancio**

Projeto desenvolvido como atividade acadêmica para prática de programação em Java, versionamento com Git/GitHub e documentação utilizando JavaDoc.
