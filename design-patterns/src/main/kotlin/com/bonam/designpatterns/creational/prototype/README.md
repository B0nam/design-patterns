# Protorype

O Prototype é um Design Pattern criacional que permite clonar objetos existentes sem depender de suas classes concretas. Ele é útil quando a criação de um objeto é custosa ou complexa, e você quer gerar novos objetos copiando um já existente.

Imagine um editor de documentos em que o usuário pode criar modelos (templates) de documentos e depois fazer cópias para preencher com dados. Criar cada documento do zero seria repetitivo e ineficiente.

| Objeto              | Função                |
| ------------------- | --------------------- |
| `DocumentPrototype` | Interface de clonagem |
| `TextDocument`      | Documento de texto    |
| `Spreadsheet`       | Planilha com células  |
