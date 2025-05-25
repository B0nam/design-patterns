# State

State é um padrão comportamental que permite que um objeto altere seu comportamento quando seu estado interno muda. É como se o objeto mudasse de classe durante a execução.

O padrão State encapsula o comportamento associado a um estado específico em objetos separados, e permite que o objeto principal alterne entre esses estados dinamicamente.

Vamos modelar uma vending machine com os seguintes estados:

| Estado                | Ações possíveis              |
| --------------------- | ---------------------------- |
| Sem moeda             | Inserir moeda                |
| Com moeda             | Selecionar produto, ejetar   |
| Produto sendo vendido | Dispensa e volta para início |
