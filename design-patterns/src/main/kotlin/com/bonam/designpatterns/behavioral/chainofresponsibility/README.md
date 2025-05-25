# Chain of Responsibility

O Chain of Responsibility (CoR) é um Design Pattern comportamental que permite que vários objetos tenham a chance de processar uma solicitação, evitando o acoplamento entre o remetente e o receptor.

A solicitação é passada ao longo de uma cadeia de manipuladores até que um deles a processe.

Imagine um sistema de atendimento ao cliente onde cada nivel de suporte verifica se pode resolver o problema. Se não puder, o problema é passado para o próximo nivel.

| Nível de Suporte    | Responsável por          |
| ------------------- | ------------------------ |
| SuporteN1Handler    | Problemas simples        |
| SuporteN2Handler    | Problemas intermediários |
| EspecialistaHandler | Problemas avançados      |
