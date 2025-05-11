# Builder

Design pattern criacional que separa a contrução de um objeto complexo da sua representação de modo que o mesmo processo de construção possa criar diferentes representações.

O padrão Builder é útil quando um objeto tem muitos parâmetros ou quando a construção do objeto é complexa e envolve várias etapas. Ele permite criar objetos de forma mais legível e flexível, sem precisar passar todos os parâmetros de uma só vez.

Considere a montagem de um hambúrguer. Um hambúrguer pode ter vários ingredientes, como carne, queijo, alface, tomate e molho. Cada ingrediente pode ser adicionado ou removido, e a ordem em que são adicionados pode afetar o resultado final.

| Ingrediente       | Opção 1 | Opção 2 | Opção 3     |
|-------------------|---------|---------|-------------|
| Carne             | Picanha | Frango  | Vegetariano |
| Queijo            | Cheddar | Prato   | Vegano      |
| Alface            | Sim     | Não     | Não         |
| Tomate            | Sim     | Não     | Não         |
| Molho             | Barbecue| Maionese| Ketchup     |

Nesse caso, podemos criar uma interface `BurgerBuilder` que define métodos para adicionar ingredientes. Cada implementação dessa interface representa um tipo de hambúrguer, como `CheeseburgerBuilder`, `ChickenBurgerBuilder` e `VeggieBurgerBuilder`. A classe `Burger` representa o produto final, que é construído usando o builder.