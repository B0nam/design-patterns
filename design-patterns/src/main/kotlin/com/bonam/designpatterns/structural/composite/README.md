# Composite

O Composite é um Design Pattern estrutural que permite tratar objetos individuais e composições de objetos de maneira uniforme. Ele é especialmente útil para representar estruturas em árvore, como sistemas de arquivos, menus, documentos, etc.

Imagine um catálogo de produtos onde você pode ter itens simples (como um celular ou uma camisa), mas também pode ter categorias que agrupam outros produtos ou subcategorias (como Eletrônicos, Moda, etc.).

| Tipo | Exemplo                      |
|------|------------------------------|
| Produto Simples | Camisa, Celular, Notebook    |
| Categoria composta | Roupa, Eletrônico, Vestuário |

Com o padrão Composite, podemos criar uma interface CatalogComponent com operações como print() ou getPrice(). Tanto Product (simples) quanto Category (composta) implementam essa interface. Assim, podemos tratar todos de forma uniforme.
