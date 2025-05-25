# Visitor

O padrão Visitor é um padrão comportamental que permite separar algoritmos de objetos nos quais eles operam. Ele permite adicionar novas operações a estruturas de objetos sem modificar suas classes.

O padrão Visitor permite definir uma nova operação sem alterar as classes dos elementos nos quais opera, utilizando um visitante que implementa a operação para cada tipo de elemento.

Imagine que temos diferentes tipos de itens financeiros e queremos gerar relatórios de impostos sem modificar essas classes diretamente. Para isso usamos o visitor

| Tipo de item | Classe    | Operações (visitadas) |
| ------------ | --------- | --------------------- |
| Produto      | `Product` | Calcular imposto      |
| Serviço      | `Service` | Calcular imposto      |

