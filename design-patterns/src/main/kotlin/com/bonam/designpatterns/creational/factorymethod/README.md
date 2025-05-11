# Factory Method

Design Pattern criacional que define uma interface para criar um objeto, mas permite que as subclasses decidam qual classe instanciar. O Factory Method permite que uma classe delegue a responsabilidade de instanciar objetos a subclasses.

O padrão Factory Method é útil quando uma classe não pode prever a classe de objetos que deve criar. Ele permite que subclasses alterem o tipo de objetos que serão criados, promovendo a flexibilidade e a extensibilidade do código.

Considere o exemplo de um sistema de pagamento. Temos diferentes tipos de pagamentos, como cartão de crédito, PayPal e transferência bancária. Cada tipo de pagamento tem sua própria implementação e lógica de processamento.

| Tipo de Pagamento | Implementação         |
|-------------------|-----------------------|
| Cartão de Crédito  | CreditCardPayment     |
| PayPal            | PaypalPayment         |
| Transferência     | BankTransferPayment   |

Nesse caso, podemos criar uma interface `Payment` que define o método `processPayment()`. Em seguida, criamos subclasses para cada tipo de pagamento, como `CreditCardPayment`, `PaypalPayment` e `BankTransferPayment`. A classe `PaymentFactory` é responsável por criar a instância correta com base no tipo de pagamento solicitado.