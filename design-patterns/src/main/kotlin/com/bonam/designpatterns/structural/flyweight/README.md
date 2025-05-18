# Flyweight

O Flyweight é um Design Pattern estrutural que tem como objetivo minimizar o uso de memória ao compartilhar o maior número possível de dados entre objetos semelhantes. Ele é ideal quando o sistema precisa criar um grande número de objetos similares, como em jogos, editores gráficos ou sistemas de mapas.

Imagine um editor de texto que renderiza milhares de caracteres. Cada caractere pode ter uma formatação diferente (fonte, tamanho, cor), mas muitos deles repetem essas propriedades. Criar um objeto para cada caractere com todos os seus atributos seria caro em memória.

Com o padrão flyweight nós podemos separar os dados em estados internos e compartilhar eles entre objetos semelhantes. Isso permite que os objetos sejam criados de maneira eficiente, evitando duplicação de memória e melhorando a performance do sistema.
