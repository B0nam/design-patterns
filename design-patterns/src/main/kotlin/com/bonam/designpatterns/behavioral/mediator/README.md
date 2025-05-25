# Mediator

O Mediator é um padrão comportamental que define um objeto que encapsula a forma como um conjunto de objetos interage. Ele promove o desacoplamento ao evitar que os objetos se refiram explicitamente uns aos outros.

O padrão Mediator centraliza a comunicação entre objetos, promovendo um baixo acoplamento entre eles.

Vamos modelar um chat onde vários usuários podem enviar mensagens uns aos outros. Ao invés de cada usuário manter referência direta a todos os outros, um mediador (ChatRoom) gerencia as interações.

| Componente | Função                                 |
| ---------- | -------------------------------------- |
| `User`     | Participante do chat                   |
| `ChatRoom` | Mediador central que repassa mensagens |

