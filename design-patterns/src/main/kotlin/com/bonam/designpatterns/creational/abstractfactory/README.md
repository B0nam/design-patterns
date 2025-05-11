# Abstract Factory

Design pattern criacional que fornece um interface para criação de famílias de objetos relacionados ou dependentes sem especificar suas classes contretas.

Considere duas redes de fast food: McDonald's e Burger King. Ambas têm produtos semelhantes, como hambúrgueres, batatas fritas e refrigerantes. No entanto, cada rede tem suas próprias receitas e métodos de preparo. Que resultam em produtos diferentes da mesma família.

| Família      | McDonald's   | Burger King |
|--------------|--------------|-------------|
| Hamburguer   | Big Mac      | Whopper     |
| Batata       | Batata frita | Batata frita com cheddar |
| Refrigerante |  Coca-Cola   | Pepsi         |

Pensando em um sistema de pedidos, podemos criar uma interface `FastFoodFactory` que define métodos para criar os produtos. Cada rede de fast food implementa essa interface, criando seus próprios produtos.

Essa interface permite que o cliente crie produtos sem precisar conhecer as classes concretas. O cliente pode usar a fábrica para criar produtos de uma rede específica, como McDonald's ou Burger King, e obter os produtos correspondentes.

Sendo assim, temos as fabricas `McDonaldsFactory` e `BurgerKingFactory`, que implementam a interface `FastFoodFactory`. Cada fábrica cria seus próprios produtos, como `McDonaldsHamburger`, `McDonaldsFries`, `BurgerKingHamburger` e `BurgerKingFries`.

Pesnsando um um sistema de pedidos, podemos criar uma classe `Order` que usa a fábrica para criar os produtos. O cliente pode escolher a rede de fast food e fazer o pedido correspondente. A classe `Order` não precisa conhecer as classes concretas dos produtos, apenas a interface da fábrica.