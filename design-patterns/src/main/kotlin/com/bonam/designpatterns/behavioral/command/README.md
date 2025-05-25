# Command

Command é um padrão de projeto comportamental que encapsula uma solicitação como um objeto, permitindo parametrizar clientes com diferentes solicitações, enfileirar ou registrar operações, e oferecer suporte a operações reversíveis (undo/redo).

Imagine um sistema de automação residencial com dispositivos como luzes e portas. O controle remoto pode executar comandos como ligar a luz ou trancar a porta. Com o padrão Command, cada ação é encapsulada como um objeto que pode ser executado, cancelado ou armazenado para histórico.

| Command      | Receiver | Action        |
| ------------ | -------- | ------------- |
| TurnOnLight  | Light    | light.on()    |
| TurnOffLight | Light    | light.off()   |
| LockDoor     | Door     | door.lock()   |
| UnlockDoor   | Door     | door.unlock() |
