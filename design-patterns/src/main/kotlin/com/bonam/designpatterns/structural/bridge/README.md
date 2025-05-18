# Bridge

O Bridge é um Design Pattern estrutural que tem como objetivo desacoplar uma abstração da sua implementação, permitindo que as duas variações evoluam de forma independente.

Em vez de usar herança para estender funcionalidades, o padrão Bridge favorece a composição, separando o que é feito (abstração) de como é feito (implementação).

Imagine um sistema que envia mensagens por diferentes canais (como email ou SMS), e que também pode enviar diferentes tipos de mensagem (alerta, notificação, mensagem comum).

| Tipo de Mensagem | Canais de Envio | Implementação          |
|------------------|-----------------|------------------------|
| Alerta           | Email           | EmailSender            |
| Notificação      | SMS             | SmsSender              |
| Mensagem Comum   | Email ou SMS    | EmailSender, SmsSender |

No exemplo acima, temos uma abstração (mensagem) e duas implementações (EmailSender e SmsSender). O Bridge permite que as implementações evoluam de forma independente, sem afetar a abstração.