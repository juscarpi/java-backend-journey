# ☕ Jornada Java - Curso Completo

### Essas são minhas anotações do curso "Java COMPLETO Programação Orientada a Objetos + Projetos" do Professor Nélio Alves.

## 📚 Módulo: Estrutura Sequencial

**Neste módulo, foquei em dominar a base da linguagem e a lógica de programação:**

### 1. Expressões Aritméticas
- Em primeiro lugar: `*`, `/`, `%`
- Em segundo lugar: `+`, `-`

  | Operador  | Significado |
  |:---|:---|
  | + | adição |
  | - | subtração|
  | * | multiplicação | 
  | / | divisão |
  | % | resto da divisão("mod") |


### 2. Variáveis e Tipos de Dados: int, double, String, char.

- Tipos primitivos em Java

    |Tipo|Tamanho|Valores| 
    |:-----|:---|:---|
    |byte|8 bits|-128 a 127|
    |short|16 bits|-32768 a 32767|
    |int|32 bits|-2147483648 a 2147483647|
    |long|64 bits|-9223372036854770000 a 9223372036854770000|
    |float|32 bits|-1,4024E-37 a 3,4028E+38|
    |double|64 bits|-4,94E-307 a 1,79E+308|
    |char|16 bits|'\u0000' a '\uFFFF'|
    |boolean|1 bit|{false, true}|
    **String** não é tipo primitivo, é uma Classe!(Mas usamos como se fosse).

### 3. Entrada de Dados(Output)
Como mostrar informações na tela:
- `print`: Escreve e fica na mesma linha.
- `println`: Escreve e pula linha.
- `printf`: Escreve com formatação.
- `%d` = Inteiro
- `%f` = Ponto flutuante(`%.2f` para 2 casas)
- `%s` = Para texto
- `%n` = Quebra de linha

```java
Locale.setDefault(Locale.US); // Para sair com ponto (10.50) e não vírgula
System.out.printf("Medida: %.2f metros%n", medida);
``` 

### 4. Processamento e Casting
- **Atribuição (`=`)**: Lê-se "recebe". `x = 10`(x recebe 10).
- **Casting**: É a conversão manual de um tipo para outro.
```java
int a = 5;
int b = 2;
double resultado = (double) a / b; // Casting para forçar o resultado decimal (2.5)
```

### 5. Entrada de Dados(Scanner)
Como ler o que o usuário digita:
1. Importar: `import java.util.Scanner;`
2. Iniciar: `Scanner sc = new Scanner(System.in);`
3. Comandos: 
   - `sc.next()`: Lê uma palavra.
   - `sc.nextInt()`: Lê um número inteiro.
   - `sc.nextDouble()`: Lê um número decimal.
   - `sc.nextLine()`: Lê a frase toda até o Enter.
   
⚠️**Atenção**: Se usar `nextInt()` e depois `nextLine()`, lembre de dar um `nextLine()` extra para limpar o buffer!

### 6. Funções Matemáticas (`Math`)
Funções matemáticas do Java:
- `A = Math.sqrt(x)`: `A` recebe a raiz quadrada de `x`.
- `A = Math.pow(x, y)`: `A` recebe o resultado de x elevado a `y`.
- `A = Math.abs(x)`: `A` recebe o valor valor absoluto de `x`.


## 👩‍💻 Autora
Feito por <ins>**[Julia Scarpi](https://www.linkedin.com/in/juliascarpi/)**</ins> durante minha jornada rumo ao Backend Java.
