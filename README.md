# 🧮 Calculadora Java

Calculadora de linha de comando desenvolvida em Java, com suporte a operações básicas e histórico de cálculos.

## 📋 Funcionalidades

- Soma, subtração, multiplicação e divisão
- Histórico de operações realizadas
- Limpeza do histórico
- Tratamento de erros (divisão por zero, entrada inválida)

## 🗂️ Estrutura do Projeto

```
src/
└── main/
    └── java/
        └── calculadora/
            ├── Main.java          # Ponto de entrada e interface com o usuário
            ├── Calculadora.java   # Lógica das operações matemáticas
            └── Historico.java     # Gerenciamento do histórico de operações
```

## ▶️ Como executar

**Pré-requisitos:** Java JDK instalado.

```bash
# Compile os arquivos
javac calculadora/*.java

# Execute o programa
java calculadora.Main
```

## 🖥️ Exemplo de uso

```
=== CALCULADORA JAVA made by: Daniel Ribeiro ===
1 - Somar
2 - Subtrair
3 - Multiplicar
4 - Dividir
5 - Ver historico
6 - Excluir historico
0 - Sair
Escolha uma opção: 1
Digite o primeiro número: 10
Digite o segundo número: 5
Resultado: 15.0
```

## 👤 Autor

**Daniel Ribeiro Salvador, 2026 <3**
