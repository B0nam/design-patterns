# Facade

O Facade é um Design Pattern estrutural que fornece uma interface unificada e simples para um subsistema complexo. Ele esconde os detalhes internos e oferece uma maneira mais fácil de interagir com ele.

Imagine um sistema de home theater com várias partes: projetor, sistema de som, luzes, player de vídeo, etc. Para assistir a um filme, seria necessário configurar cada parte manualmente.

| Subsistema      | Função                |
| --------------- | --------------------- |
| Projetor        | Exibe a imagem        |
| Sistema de som  | Reproduz o áudio      |
| Luzes           | Controla a iluminação |
| Player de vídeo | Reproduz o filme      |

Com o padrão Facade, criamos uma classe HomeTheaterFacade que encapsula essas partes e oferece métodos simples como assistirFilme() e encerrarFilme().
