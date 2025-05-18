# Adapter

Design Pattern estrutural que permite que classes com interfaces incompatíveis trabalhem juntas. O Adapter atua como um tradutor entre duas interfaces, adaptando uma classe existente para uma nova interface esperada.

O padrão Adapter é útil quando você quer reutilizar uma classe existente, mas sua interface não corresponde ao que o sistema espera. Ele permite integrar sistemas de forma flexível sem alterar o código existente.

Suponha que temos um sistema que trabalha com a interface Printer, com o método print(document: String). No entanto, temos uma classe externa chamada LegacyPrinter que utiliza o método printText(text: String). Como as interfaces são incompatíveis, não conseguimos usar LegacyPrinter diretamente.

| Tipo de Impressora | Interface Esperada | Implementação Existente        |
| ------------------ | ------------------ | ------------------------------ |
| Moderna            | `Printer`          | `ModernPrinter`                |
| Legada             | `Printer`          | `LegacyPrinter` (incompatível) |
