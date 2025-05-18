# Proxy

O Proxy é um Design Pattern estrutural que fornece um substituto ou representante para outro objeto. Ele controla o acesso a esse objeto, permitindo adicionar funcionalidades extras como controle de acesso, cache, lazy loading, etc., sem modificar o objeto real.

Imagine que temos um sistema de streaming onde vídeos podem ser acessados, mas alguns estão restritos por permissão. Queremos controlar o acesso a esses vídeos sem alterar a lógica da classe que os representa.

| Componente     | Função                             |
| -------------- | ---------------------------------- |
| `VideoService` | Interface de acesso ao vídeo       |
| `RealVideo`    | Classe que carrega e exibe o vídeo |
| `VideoProxy`   | Controla o acesso à `RealVideo`    |

