# Strategy

Strategy é um padrão comportamental que permite definir uma família de algoritmos, encapsulá-los em classes separadas e torná-los intercambiáveis em tempo de execução.

O padrão Strategy permite alterar o comportamento de um objeto em tempo de execução delegando a lógica para classes que implementam uma interface comum.

Imagine um sistema de checkout onde o usuário pode escolher diferentes estratégias de pagamento:

| Estratégia        | Implementação       |
| ----------------- | ------------------- |
| Cartão de Crédito | `CreditCardPayment` |
| PayPal            | `PaypalPayment`     |
| Criptomoeda       | `CryptoPayment`     |
