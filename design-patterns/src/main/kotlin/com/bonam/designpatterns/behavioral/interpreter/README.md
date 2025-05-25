# Interpreter

O Interpreter é um padrão comportamental que define uma representação para uma gramática e um interpretador que usa essa representação para interpretar sentenças dessa linguagem.

O padrão Interpreter define uma gramática para uma linguagem e fornece um interpretador para avaliar sentenças dessa linguagem.

Queremos interpretar expressões como:
```
"5 + 3 - 2"
```

A ideia é construir uma árvore de expressão, onde cada nó representa uma operação (+, -, número). Cada nó sabe como se avaliar.

